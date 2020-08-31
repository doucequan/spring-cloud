package com.example.hmogops;

import com.example.hismemberservice.bo.PackageBO;
import com.example.hmogops.feignclients.HisMemberClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableCircuitBreaker
@RestController
@EnableFeignClients
public class HmoGopsApplication {

    @Resource
    private HisMemberClient hisMemberClient;

    public static void main(String[] args) {
        SpringApplication.run(HmoGopsApplication.class, args);
    }

    @RequestMapping(value = "/package/detail/{bizId}")
    @HystrixCommand
    public PackageBO getPackageByBizId(@PathVariable String bizId) {
        return hisMemberClient.getByBizId(bizId);
    }


}
