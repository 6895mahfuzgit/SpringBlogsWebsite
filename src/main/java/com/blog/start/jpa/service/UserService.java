package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private ItemRepository itemRepository;


    public List<User> findAll() {

        return userRepository.findAll();
    }

    public User findOne(int id) {

        return userRepository.findOne(id);
    }


    @Transactional
    public User findOneWithBlogs(int id) {

        User user = findOne(id);


        List<Blog> blogs = blogRepository.findByUser(user);

        for (Blog blog : blogs) {


            List<Item> items = itemRepository.findByBlog(blog, new PageRequest(0, 10, Sort.Direction.DESC, "publishedDate"));
            blog.setItems(items);

        }

        user.setBlogs(blogs);


        return user;
    }
}