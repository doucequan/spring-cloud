package com.example.hmogops.feignclients;

import com.example.hismemberservice.bo.PackageBO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "his-member-service")
public interface HisMemberClient {


    @RequestMapping(value = "/package/detail/{bizId}", method = RequestMethod.GET)
    PackageBO getByBizId(@PathVariable String bizId);
}
