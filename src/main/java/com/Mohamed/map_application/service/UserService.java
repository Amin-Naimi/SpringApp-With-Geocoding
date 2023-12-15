package com.Mohamed.map_application.service;

import com.Mohamed.map_application.entity.UserEntity;
import com.Mohamed.map_application.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public UserEntity createUser(UserEntity user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }

    public List<UserEntity> getAllUsers() {
        return userRepo.findAll();
    }
}
