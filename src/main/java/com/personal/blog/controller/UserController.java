package com.personal.blog.controller;

import com.personal.blog.model.User;
import com.personal.blog.response.UserInfo;
import com.personal.blog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user-management")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserInfo>> viewUsers(){
        return ResponseEntity.ok(userService.viewUsers());
    }
}
