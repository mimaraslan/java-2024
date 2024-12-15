package com.mimaraslan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Profile("dev")
    @Bean(name = "myProfileBean")
    public String createDevBean() {
        return "My Profile :  Development";
    }

    @Profile("test")
    @Bean(name = "myProfileBean")
    public String createTestBean() {
        return "My Profile :  Test";
    }

    @Profile("prod")
    @Bean(name = "myProfileBean")
    public String createProdBean() {
        return "My Profile :  Production";
    }


    @Profile("dev-mysql")
    @Bean(name = "myProfileBean")
    public String createDevMySqlBean() {
        return "My Profile :  MySQL Development";
    }


    @Profile("dev-postges")
    @Bean(name = "myProfileBean")
    public String createDevPostgeSqlBean() {
        return "My Profile :  PostgeSQL Development";
    }

}
