package com.personal.blog.service;

import com.personal.blog.model.User;
import com.personal.blog.repository.UserRepository;
import com.personal.blog.response.UserInfo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
    private final ModelMapper mapper;
    private final UserRepository userRepository;

    public List<UserInfo> viewUsers(){
        List<User> users = userRepository.findAll();

        return users.stream().map(user -> mapper.map(user, UserInfo.class)).toList();
    }

}
