package com.blog.start.jpa.repositorie;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findByBlog(Blog blog, Pageable pageable);


    Item findByBlogAndLink(Blog blog, String link);
}
