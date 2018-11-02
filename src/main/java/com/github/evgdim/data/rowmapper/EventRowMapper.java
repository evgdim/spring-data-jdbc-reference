package com.github.evgdim.data.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.evgdim.data.model.Event;

public class EventRowMapper implements RowMapper<Event>{

	@Override
	public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
		Event event = new Event();
		event.setId(rs.getLong("id"));
		return event;
	}

}
