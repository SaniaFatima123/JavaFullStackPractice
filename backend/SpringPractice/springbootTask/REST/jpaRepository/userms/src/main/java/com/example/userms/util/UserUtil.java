package com.example.userms.util;

import com.example.userms.dto.UserDetails;
import com.example.userms.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserUtil {
    public UserDetails toUserDetails(User user){
        UserDetails userDetails = new UserDetails(user.getId(), user.getName(), user.getAge());
        return userDetails;
    }
    public List<UserDetails> toUserDetails(List<User> users){
        List<UserDetails> userDetailsList = new ArrayList<>();
        for(User user: users) {
            UserDetails userDetails = new UserDetails(user.getId(), user.getName(), user.getAge());
            userDetailsList.add(userDetails);
        }
        return userDetailsList;
    }

}
