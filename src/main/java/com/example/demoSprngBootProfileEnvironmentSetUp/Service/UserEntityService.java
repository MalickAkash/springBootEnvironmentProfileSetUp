package com.example.demoSprngBootProfileEnvironmentSetUp.Service;

import com.example.demoSprngBootProfileEnvironmentSetUp.Entity.UserEntity;
import com.example.demoSprngBootProfileEnvironmentSetUp.Repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Profile(value = {"local","dev","prod"}) //these name depend on the application property's name
public class UserEntityService {
    @Autowired
    private UserEntityRepository userEntityRepository;

    public List<UserEntity> getUsers(){
        return userEntityRepository.findAll();
    }

    public UserEntity findSpecificData(Integer userId) {
        return userEntityRepository.findById(userId).orElse(null);
    }
}
