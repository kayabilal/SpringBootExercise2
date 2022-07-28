package com.bilal.kaya.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    private String name;
    private String surname;
    private String username;
    private String password;

}
