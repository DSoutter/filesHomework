package com.codeclan.example.filesHomework.repository;

import com.codeclan.example.filesHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
}
