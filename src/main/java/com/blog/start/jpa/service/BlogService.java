package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void delete(int id) {
        blogRepository.delete(id);

    }
}
