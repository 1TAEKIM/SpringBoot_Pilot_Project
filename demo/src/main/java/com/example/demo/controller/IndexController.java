package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class IndexController {
  

  @GetMapping("/")
  public @ResponseBody String index(){
    return "Hello, world!!";
  }
}

