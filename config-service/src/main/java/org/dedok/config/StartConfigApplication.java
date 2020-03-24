package org.dedok.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StartConfigApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StartConfigApplication.class, args);
    }
}
