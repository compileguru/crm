/*
package com.compileguru.crm.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.GetParameterRequest;
import software.amazon.awssdk.services.ssm.model.GetParameterResponse;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DataSourceConfig {

    private final Environment env;

    public DataSourceConfig(Environment env) {
        this.env = env;
    }

    @Bean
    @Profile("local")
    public DataSource localDataSource() {
        return DataSourceBuilder.create()
                .url(env.getProperty("spring.datasource.url"))
                .username(env.getProperty("spring.datasource.username"))
                .password(env.getProperty("spring.datasource.password"))
                .driverClassName("org.postgresql.Driver")
                .build();
    }

    @Bean
    @Profile("aws")
    public DataSource awsDataSource() {
        log.info("Active Spring Profiles: {}", String.join(", ", env.getActiveProfiles()));
        SsmClient ssmClient = SsmClient.builder().region(Region.US_EAST_1).build();

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(getSSMParameter(ssmClient,"/crm/db/url"));
        config.setUsername(getSSMParameter(ssmClient,"/crm/db/username"));
        config.setPassword(getSSMParameter(ssmClient,"/crm/db/password"));
        config.setDriverClassName("org.postgresql.Driver");
        return new HikariDataSource(config);

        */
/*return DataSourceBuilder.create()
                .url(getSSMParameter(ssmClient, env.getProperty("spring.datasource.url")))
                .username(getSSMParameter(ssmClient, env.getProperty("spring.datasource.username")))
                .password(getSSMParameter(ssmClient, env.getProperty("spring.datasource.password")))
                .driverClassName("org.postgresql.Driver")
                .build();*//*

    }

    private String getSSMParameter(SsmClient ssmClient, String paramName) {
        GetParameterRequest parameterRequest = GetParameterRequest.builder()
                .name(paramName)
                .withDecryption(true)
                .build();
        GetParameterResponse parameterResponse = ssmClient.getParameter(parameterRequest);
        log.info("Parameter response {}", parameterResponse);
        return parameterResponse.parameter().value();
    }
}
*/
