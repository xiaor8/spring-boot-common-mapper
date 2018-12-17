package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Table(name = "DM_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String uId;
    String username;
    String password;
}
