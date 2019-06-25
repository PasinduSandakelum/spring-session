package com.pasindu.spring.springexceptionhandling.service;

import com.pasindu.spring.springexceptionhandling.exception.custom.UserNotFoundException;
import com.pasindu.spring.springexceptionhandling.model.User;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {


    public List<User> userRepository() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<User> users = Arrays.asList(
                new User(1, "pasindu", "kalum", format.parse("1993-09-04")),
                new User(2, "saman", "kumara", format.parse("1988-12-31")),
                new User(3, "nuwan", "priyanga", format.parse("1983-11-11")),
                new User(4, "supun", "asanka", format.parse("2000-05-05")),
                new User(5, "suranga", "pradeep", format.parse("2001-04-02"))
        );
        return users;
    }

    @Override
    public List<User> findAll() throws ParseException {
        return userRepository();
    }

    @Override
    public List<User> findByFirstName(String firstName) throws ParseException {
        if(stringContainsNumber(firstName)){
            throw new UserNotFoundException("UserName con not contains numbers ");
        }
        List<User> user = userRepository().stream().filter(u -> u.getFirstName().contains(firstName)).collect(Collectors.toList());
        return user;
    }

    public boolean stringContainsNumber( String s )
    {
        return Pattern.compile( "([0-9])" ).matcher( s ).find();
    }
}
