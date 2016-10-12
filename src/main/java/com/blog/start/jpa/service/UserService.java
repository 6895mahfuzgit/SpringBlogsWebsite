package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Userj;
import com.blog.start.jpa.repositorie.UserjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
public class UserService {

    @Autowired
    private UserjRepository userjRepository;


    public List<Userj> findAll() {

        return userjRepository.findAll();
    }

    public Userj findOne(long id) {

        return userjRepository.findOne(id);
    }
}
