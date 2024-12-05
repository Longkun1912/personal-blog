package com.personal.blog.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInfo {
    private String username;
    private String email;
    private String country;
    private String mobile;
    private String avatar;
    private String gender;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
