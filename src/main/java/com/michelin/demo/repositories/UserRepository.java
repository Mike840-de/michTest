package com.michelin.demo.repositories;

import com.michelin.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User getUserByUsername(String username);
}
