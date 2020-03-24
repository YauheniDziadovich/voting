package org.dedok.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartRegistryServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StartRegistryServiceApplication.class, args);
    }
}
