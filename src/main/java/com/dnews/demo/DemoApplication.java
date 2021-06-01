package com.dnews.demo;

import com.dnews.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    @Autowired
    public NewsRepository newsRepo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
