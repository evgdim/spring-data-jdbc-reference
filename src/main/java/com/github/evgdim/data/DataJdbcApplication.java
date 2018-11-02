package com.github.evgdim.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jdbc.repository.RowMapperMap;
import org.springframework.data.jdbc.repository.config.ConfigurableRowMapperMap;
import org.springframework.data.relational.core.mapping.event.BeforeSaveEvent;

import com.github.evgdim.data.model.Event;
import com.github.evgdim.data.model.StatusReason;
import com.github.evgdim.data.repository.StatusReasonRepository;
import com.github.evgdim.data.rowmapper.EventRowMapper;

@SpringBootApplication
public class DataJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DataJdbcApplication.class, args);
		
//		ctx.getBean(EventRepository.class).findAll().forEach(System.out::println);
//		System.out.println("############");
//		ctx.getBean(EventRepository.class).findById(21688L).ifPresent(System.out::println);
		
		StatusReasonRepository statusReasonRepository = ctx.getBean(StatusReasonRepository.class);
//		statusReasonRepository.save(new StatusReason());
		statusReasonRepository.findAll().forEach(System.out::println);
	}
	
	@Bean
	public RowMapperMap rowMappers() {
		return new ConfigurableRowMapperMap()
				.register(Event.class, new EventRowMapper());
	}

	@Bean
	public ApplicationListener<BeforeSaveEvent> beforeSave() {
		return new ApplicationListener<BeforeSaveEvent>() {
			
			@Override
			public void onApplicationEvent(BeforeSaveEvent event) {
				Object entity = event.getEntity();
				System.out.println(entity);
			}
		};
	}
}
