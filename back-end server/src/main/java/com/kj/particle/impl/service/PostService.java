package com.kj.particle.impl.service;

import com.kj.particle.base.utils.BaseFilter;
import com.kj.particle.impl.model.Post;
import org.springframework.data.domain.Page;

public interface PostService {
    Post savePost(Post post);
    Page<Post> postList(BaseFilter filter);
}
