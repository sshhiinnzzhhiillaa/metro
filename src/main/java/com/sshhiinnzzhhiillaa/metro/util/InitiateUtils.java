package com.sshhiinnzzhhiillaa.metro.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class InitiateUtils implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run");
    }
}
