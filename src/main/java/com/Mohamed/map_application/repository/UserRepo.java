package com.Mohamed.map_application.repository;

import com.Mohamed.map_application.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Long> {
}
