package com.example.demoSprngBootProfileEnvironmentSetUp.Repository;

import com.example.demoSprngBootProfileEnvironmentSetUp.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Integer> {
}
