package com.blog.start.jpa.service;

import com.blog.start.jpa.entity.Item;
import com.blog.start.rss.ObjectFactory;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * Created by MahfuzCSE'11 on 14-Oct-16.
 */
@Service
public class RssSercice {


    public List<Item> getItems() {


        try {
            JAXBContext.newInstance(ObjectFactory.class);
        } catch (JAXBException e) {

        }


        return null;


    }

}
