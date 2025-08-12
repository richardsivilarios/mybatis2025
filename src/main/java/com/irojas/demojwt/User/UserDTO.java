package com.irojas.demojwt.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    int id;
    //firstName
    String username;
    String firstName;
    String lastName;
    String emailId;
}