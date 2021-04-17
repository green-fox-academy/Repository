package com.example.reddit.controllers;

import com.example.reddit.models.Post;
import com.example.reddit.services.PostService;
import com.example.reddit.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

  final
  PostService postService;

  public IndexController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping (path = "/")
  public String renderIndex(Model model){
    model.addAttribute("posts", postService.readAll());
  return "index";
  }

  @GetMapping (path = "/submit")
  public String renderSubmit(Model model){
    model.addAttribute("post", new Post());
  return "submit";
  }

  @PostMapping (path = "/submit")
  public String savePost(@ModelAttribute Post post){
    postService.save(post);
    return "redirect:/";
  }
}
