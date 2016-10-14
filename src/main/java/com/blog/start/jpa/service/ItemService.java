package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Item;
import com.blog.start.jpa.repositorie.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by MahfuzCSE'11 on 12-Oct-16.
 */
@Service
public class ItemService {


    @Autowired
    private ItemRepository itemRepository;


    public List<Item> getItems() {

        return itemRepository.findAll(new PageRequest(0, 20, Sort.Direction.DESC, "publishedDate")).getContent();
    }
}
