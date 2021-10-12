package com.codeclan.example.filesHomework.repository;

import com.codeclan.example.filesHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
