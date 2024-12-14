package com.amirul.bank.repository;

import com.amirul.bank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByUsernameIgnoreCase(String username);
}
