package com.example.hismemberservice;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HisMemberServiceApplication implements InitializingBean {

    @Value("${env}")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(HisMemberServiceApplication.class, args);
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(env);
    }

}
