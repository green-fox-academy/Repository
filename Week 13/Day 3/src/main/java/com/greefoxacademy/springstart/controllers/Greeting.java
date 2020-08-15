package com.greefoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;


public class Greeting {
  private long id = 0;
  private String content;

  public Greeting(long id, String content) {
    this.id += id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
