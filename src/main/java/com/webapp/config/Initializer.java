package com.webapp.config;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer {

  @Autowired
  private ApplicationContext context;
  
  
  @Bean("startTime")
  public Date getStartTime() {
    
    return new Date(context.getStartupDate());
  }
}
