package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Role;
import com.blog.start.jpa.entity.User;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.repositorie.RoleRepository;
import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
@Transactional
public class InitDbService {


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RoleRepository roleRepository;


    @Autowired
    private ItemRepository itemRepository;


    @Autowired
    private BlogRepository blogRepository;


    @PostConstruct
    public void init() {


        Role roleUser = new Role();
        roleUser.setName("ROLE_USER");
        roleRepository.save(roleUser);


        Role roleAdmin = new Role();
        roleAdmin.setName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);


        User userAdmin = new User();
        userAdmin.setName("admin");
        userAdmin.setEnabled(true);
        Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();

        userAdmin.setPassword(md5PasswordEncoder.encodePassword("admin", null));

        List<Role> roles = new ArrayList<Role>();
        roles.add(roleAdmin);
        roles.add(roleUser);
        userAdmin.setRoles(roles);

        userRepository.save(userAdmin);


        Blog blogjinit = new Blog();

        blogjinit.setName("java blog");
        blogjinit.setUrl("http://feeds.feedburner.com/javavids?format=xml");
        blogjinit.setUser(userAdmin);
        blogRepository.save(blogjinit);

    }


}
