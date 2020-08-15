package com.greefoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(path = "/greeting")
  public Greeting greet(@RequestParam(required = false) String name) {
    return new Greeting(atomicLong.incrementAndGet(), name);
  }
}