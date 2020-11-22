package com.webapp.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

  @Autowired
  private Date startTime;
  
  @RequestMapping("/")
  public String index() {
    
    return "Running since : " + startTime;
  }
}
