package org.example.scagoodms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScaGoodMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaGoodMsApplication.class, args);
    }

}
