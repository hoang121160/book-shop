package com.example.books.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserDto {
    private Long id;
    @Size(max = 225)
    private String username;
    @Size(max = 225)
    private String password;
    @Size(max = 225)
    private String email;
    @Size(max = 225)
    private String firstname;
    @Size(max = 225)
    private String lastname;
    @Size(max = 225)
    private String address;
    @Size(max = 225)
    private String phone;
}
