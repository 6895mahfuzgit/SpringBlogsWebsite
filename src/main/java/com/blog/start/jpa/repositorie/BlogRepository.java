package com.blog.start.jpa.repositorie;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    List<Blog> findByUser(User user);
}
