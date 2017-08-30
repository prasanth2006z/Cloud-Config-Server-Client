package com.user.service;

/**
 * @author Prasanth.P
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RefreshScope
public class AppConfig {

  @Value("${message.greeting}")
  String greeting;

  @Value("${author}")
  String author;

  @Value("${configuration}")
  String configuration;

  @RequestMapping("/")
  public String read() {
    return greeting + "/=====" + author + "====" + configuration;
  }
}
