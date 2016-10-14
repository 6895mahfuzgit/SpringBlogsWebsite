package com.blog.start.annotation;

import com.blog.start.jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by MahfuzCSE'11 on 14-Oct-16.
 */
public class UniqueUsernameValidator implements ConstraintValidator<UniqueUserName, String> {


    @Autowired
    private UserRepository userRepository;


    public void initialize(UniqueUserName uniqueUserName) {

    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if (userRepository == null) {
            return true;
        }
        return userRepository.findByName(s) == null;
    }


}
