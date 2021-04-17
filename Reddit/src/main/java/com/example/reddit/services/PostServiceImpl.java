package com.example.reddit.services;

import com.example.reddit.models.Post;
import com.example.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

  final
  PostRepository postRepository;

  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Post save(Post entity) {
    return postRepository.save(entity);
  }

  @Override
  public List<Post> readAll() {
    return (List<Post>)postRepository.findAll();
  }
}
