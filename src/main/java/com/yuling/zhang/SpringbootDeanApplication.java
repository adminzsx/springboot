package com.yuling.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@MapperScan({"com.yuling.**.mapper","com.yuling.**.dao"})
@EnableCaching
@SpringBootApplication
public class SpringbootDeanApplication {

    public static void main(String[] args) {
        System.out.println();
        SpringApplication.run(SpringbootDeanApplication.class, args);
    }

}
