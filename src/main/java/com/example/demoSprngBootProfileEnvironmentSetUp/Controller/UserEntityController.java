package com.example.demoSprngBootProfileEnvironmentSetUp.Controller;

import com.example.demoSprngBootProfileEnvironmentSetUp.Entity.UserEntity;
import com.example.demoSprngBootProfileEnvironmentSetUp.Service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Profile(value = {"local","dev","prod"}) //these name depend on the application property's name
public class UserEntityController {

    @Autowired
    private UserEntityService userEntityService;

    @GetMapping("/showAllData")
    public List<UserEntity> findAllUser(){
        return userEntityService.getUsers();
    }

    @GetMapping("/showSpecificData/{userId}")
    public UserEntity findSpecificData(@PathVariable Integer userId){
        return userEntityService.findSpecificData(userId);
    }
}
