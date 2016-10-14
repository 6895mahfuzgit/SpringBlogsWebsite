package com.blog.start.jpa.service;

import com.blog.start.exception.RssException;
import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
public class BlogService {


    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RssService rssService;

    @Autowired
    private ItemRepository itemRepository;


    public void saveItems(Blog blog) {

        try {
            List<Item> items = rssService.getItems(blog.getUrl());

            for (Item item : items) {

                Item saveItem = itemRepository.findByBlogAndLink(blog, item.getLink());

                if (saveItem == null) {
                    item.setBlog(blog);
                    itemRepository.save(item);
                }

            }
        } catch (RssException e) {
            e.printStackTrace();
        }

    }

    //1 hour
    @Scheduled(fixedDelay = 3600000)
    public void reloadBlog() {

        List<Blog> blogs = blogRepository.findAll();

        for (Blog blog : blogs) {

            saveItems(blog);

        }

    }


    public void save(Blog blog, String name) {

        User user = userRepository.findByName(name);
        blog.setUser(user);
        blogRepository.save(blog);
        saveItems(blog);

    }

    @PreAuthorize("#blog.user.name==authentication.name or hasRole('ROLE_ADMIN')")
    public void delete(@P("blog") Blog blog) {
        blogRepository.delete(blog);

    }

    public Blog findOne(int id) {
        return blogRepository.findOne(id);
    }
}
