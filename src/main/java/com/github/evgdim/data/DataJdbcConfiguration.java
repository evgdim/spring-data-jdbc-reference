package com.github.evgdim.data;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;

import oracle.sql.TIMESTAMPTZ;

@Configuration
public class DataJdbcConfiguration extends JdbcConfiguration {
	@Override
	protected JdbcCustomConversions jdbcCustomConversions() {
		return new JdbcCustomConversions(Arrays.asList(new Converter<TIMESTAMPTZ, Date>() {

			@Override
			public Date convert(TIMESTAMPTZ source) {
				try {
					return source.dateValue();
				} catch (SQLException e) {
					return null;
				}
			}
		}));
	}
}
