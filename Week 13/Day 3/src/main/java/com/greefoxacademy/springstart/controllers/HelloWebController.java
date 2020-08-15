package com.greefoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong atomicLong = new AtomicLong();


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", atomicLong.incrementAndGet());
    return "greeting";
  }
}
