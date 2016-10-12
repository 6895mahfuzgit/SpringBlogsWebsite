package com.blog.start.jpa.repositorie;

import com.blog.start.jpa.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
