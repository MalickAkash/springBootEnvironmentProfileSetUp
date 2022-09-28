package com.example.demoSprngBootProfileEnvironmentSetUp;

import com.example.demoSprngBootProfileEnvironmentSetUp.Entity.UserEntity;
import com.example.demoSprngBootProfileEnvironmentSetUp.Repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSprngBootProfileEnvironmentSetUpApplication /*implements CommandLineRunner */{

	@Autowired
	private UserEntityRepository userEntityRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoSprngBootProfileEnvironmentSetUpApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		UserEntity user=new UserEntity();
//		user.setUserId(3);
//		user.setUserName("Dev User3");
//
//		UserEntity user1=new UserEntity();
//		user1.setUserId(4);
//		user1.setUserName("Dev User4");
//		userEntityRepository.save(user);
//		userEntityRepository.save(user1);
//	}
}
