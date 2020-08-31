package com.example.hismemberservice;

import com.example.hismemberservice.bo.PackageBO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HisMemberServiceApplication{

    public static void main(String[] args) {
        SpringApplication.run(HisMemberServiceApplication.class, args);
    }

    @RequestMapping(value = "/package/detail/{bizId}")
    public PackageBO getPackageByBizId(@PathVariable String bizId) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PackageBO packageBO = new PackageBO();
        packageBO.setBizId("12222");
        packageBO.setPackageName("套餐");
        packageBO.setPrice(1212);
        return packageBO;
    }

}
