package com.example.reddit.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue
  Integer id;

  @Column
  String user;

  @Column
  String message;


  public Post(Integer id, String user, String message) {
    this.id = id;
    this.user = user;
    this.message = message;
  }

  public Post(String user, String message) {
    this.user = user;
    this.message = message;
  }

  public Post() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
