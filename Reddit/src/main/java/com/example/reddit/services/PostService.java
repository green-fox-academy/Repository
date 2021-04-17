package com.example.reddit.services;

import com.example.reddit.models.Post;

import java.util.List;

public interface PostService {

  Post save(Post Entity);
  List<Post> readAll ();
}
