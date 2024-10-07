package com.example.demo.config;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MyStartupRunner implements CommandLineRunner {
    private  Process redisProcess;
    @Override
    public void run(String... args) throws Exception {
        runRedist();
    }
    public void runRedist() throws IOException {
        ProcessBuilder pb=new ProcessBuilder("D:/学习资料/Redis-x64-3.0.504/redis-server.exe");
        redisProcess=pb.start();
    }
    @PreDestroy
    public void stopRedis(){
        if (redisProcess!=null){
            redisProcess.destroy();
        }
    }
}

