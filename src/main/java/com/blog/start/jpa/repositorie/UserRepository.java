package com.blog.start.jpa.repositorie;

import com.blog.start.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
