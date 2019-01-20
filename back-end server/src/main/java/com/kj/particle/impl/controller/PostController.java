package com.kj.particle.impl.controller;


import com.kj.particle.base.utils.BaseFilter;
import com.kj.particle.impl.model.Post;
import com.kj.particle.impl.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    private PostServiceImpl postService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public Post savePost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Page<Post> postList(@RequestBody BaseFilter filter) {
        return postService.postList(filter);
    }
}
