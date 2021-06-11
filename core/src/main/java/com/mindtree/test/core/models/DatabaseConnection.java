package com.mindtree.test.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.day.commons.datasource.jdbcpool.JdbcPoolService;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DatabaseConnection {

	public String getDriver() {
		return JdbcPoolService.OSGI_PROPERTY_JDBC_DRIVER_CLASS;

	}

	public String getName() {
		return JdbcPoolService.OSGI_PROPERTY_JDBC_USERNAME;
	}

	public String getPassword() {
		return JdbcPoolService.OSGI_PROPERTY_JDBC_PASSWORD;
	}
}
