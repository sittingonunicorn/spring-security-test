package com.gmail.sittingonunicorn.springsecuritytest.dto;


import com.gmail.sittingonunicorn.springsecuritytest.entity.User;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UsersDTO {
    private List<User> users;
}
