package com.michelin.demo.config;

import liquibase.Liquibase;
import liquibase.integration.spring.SpringLiquibase;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.sql.DataSource;

@Configuration
public class ConfigurationCommon {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

//    @Bean
//    public SpringLiquibase liquibase(){
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setChangeLog("classpath:db.changelog/master-changelog.xml");
//        liquibase.setDataSource(dataSource);
//        return liquibase;
//    }

    @LiquibaseDataSource
    @Bean
    public DataSource liquibaseDataSource(LiquibaseProperties liquibaseProperties, DataSourceProperties dataSourceProperties) {
        return DataSourceBuilder.create()
                .username(liquibaseProperties.getUser())
                .password(liquibaseProperties.getPassword())
                .url(dataSourceProperties.getUrl())
                .build();
    }
}
