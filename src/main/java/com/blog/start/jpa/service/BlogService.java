package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
public class BlogService {


    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;


    public void save(Blog blog, String name) {

        User user = userRepository.findByName(name);
        blog.setUser(user);
        blogRepository.save(blog);

    }

    @PreAuthorize("#blog.user.name==authentication.name or hasRole('ROLE_ADMIN')")
    public void delete(@P("blog")Blog blog) {
        blogRepository.delete(blog);

    }

    public Blog findOne(int id) {
        return blogRepository.findOne(id);
    }
}
