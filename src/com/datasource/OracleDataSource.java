package com.datasource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class OracleDataSource {

	public static DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("springMVC");
		ds.setPassword("dibyendu");
		return ds;
	}

}
