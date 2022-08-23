package com.lmansfield.bookwebheroku.controllers;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactory", basePackages= {"com.lmansfield.bookwebheroku.user.repo"}, 
	transactionManagerRef = "transactionManager")
public class UserDBConfig {
	
	//configure data source manually
	@Primary //this is the primary datasource
	@Bean(name="datasource")
	@ConfigurationProperties(prefix="spring.user.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build(); //builds data source for us
	}
	
	
	@Primary //this is the primary entity manager
	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder, 
			@Qualifier ("datasource")DataSource dataSource) {
		Map<String, Object> properties = new HashMap<>();
		properties.put("hibernate.ddl-auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		return builder.dataSource(dataSource)
				.properties(properties) //add above properties to data source
				.packages("com.lmansfield.bookwebheroku.user") //give access to user package
				.persistenceUnit("sppUser") //add object to manage
				.build(); //build the data source
	}
	@Primary
	@Bean(name="transactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
