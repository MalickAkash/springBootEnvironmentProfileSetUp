package com.example.demoSprngBootProfileEnvironmentSetUp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    private Integer userId;
    private String userName;
}
