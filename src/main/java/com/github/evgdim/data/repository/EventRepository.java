package com.github.evgdim.data.repository;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.github.evgdim.data.model.Event;

public interface EventRepository extends CrudRepository<Event, Long>{
	@Override
	@Query(value="SELECT event.EVT_ID AS id, EVENT.EVT_GRB_ID AS grb_id, event.EVT_TYPE AS type, event.EVT_SUB_ACCOUNT_NR AS sub_account_number, event.EVT_TIMESTAMP AS timestamp FROM event")
	Iterable<Event> findAll();
	
	@Override
	@Query(value="SELECT event.EVT_ID AS id, EVENT.EVT_GRB_ID AS grb_id, event.EVT_TYPE AS type, event.EVT_SUB_ACCOUNT_NR AS sub_account_number, event.EVT_TIMESTAMP AS timestamp "+
				" FROM event WHERE event.EVT_ID = :id")
	Optional<Event> findById(Long id);
}
