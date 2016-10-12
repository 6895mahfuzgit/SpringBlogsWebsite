package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Blog;
import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.entity.Role;
import com.blog.start.jpa.entity.Userj;
import com.blog.start.jpa.repositorie.BlogRepository;
import com.blog.start.jpa.repositorie.ItemRepository;
import com.blog.start.jpa.repositorie.RoleRepository;
import com.blog.start.jpa.repositorie.UserjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
@Transactional
public class InitDbService {


    @Autowired
    private UserjRepository userjRepository;


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
        roleUser.setName("ROLE_ADMIN");
        roleRepository.save(roleAdmin);


        Userj userAdmin = new Userj();
        userAdmin.setName("admin");
        List<Role> roles = new ArrayList<Role>();
        roles.add(roleAdmin);
        roles.add(roleUser);
        userAdmin.setRoles(roles);

        userjRepository.save(userAdmin);


        Blog blogjinit = new Blog();

        blogjinit.setName("java blog");
        blogjinit.setUrl("http://feeds.feedburner.com/javavids?format=xml");
        blogjinit.setUserj(userAdmin);
        blogRepository.save(blogjinit);


        Item item1 = new Item();
        item1.setBlog(blogjinit);
        item1.setTitle("First");
        item1.setLink("http://www.javavids.com");
        item1.setPublishedDate(new Date());

        itemRepository.save(item1);

        Item item2 = new Item();
        item2.setBlog(blogjinit);
        item2.setTitle("First");
        item2.setLink("http://www.javavids.com");
        item2.setPublishedDate(new Date());

        itemRepository.save(item1);

    }


}
