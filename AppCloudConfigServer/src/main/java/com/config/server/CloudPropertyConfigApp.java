package com.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Prasanth.P
 *
 */
@SpringBootApplication
@EnableConfigServer
public class CloudPropertyConfigApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(CloudPropertyConfigApp.class, args);
    }
}
