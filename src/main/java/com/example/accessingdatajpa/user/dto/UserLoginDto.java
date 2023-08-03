package com.example.accessingdatajpa.user.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;

@Getter
@JsonRootName("user")
public class UserLoginDto {
    private String email;

    private String password;
}