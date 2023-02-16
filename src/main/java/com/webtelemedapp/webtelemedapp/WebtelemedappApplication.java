package com.webtelemedapp.webtelemedapp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebtelemedappApplication {

    //@Autowired
    //UserTmRepository TmRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebtelemedappApplication.class, args);
    }

    //@PostConstruct
    //void testuser() {
    //TmRepository.save(new UserTm("damir", "jamnic", "", "", "damir@mail.com", "1234", "234432"));
    }

