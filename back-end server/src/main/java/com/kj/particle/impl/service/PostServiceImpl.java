package com.kj.particle.impl.service;

import com.kj.particle.base.utils.BaseFilter;
import com.kj.particle.impl.model.Post;
import com.kj.particle.impl.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        postRepository.save(post);
        return post;
    }

    public Page<Post> postList(BaseFilter filter) {
        Pageable pageable = new PageRequest(filter.getPage(), filter.getPageSize());
        Page<Post> posts = postRepository.findAll(pageable);

        return posts;
    }
}
