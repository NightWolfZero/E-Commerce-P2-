package com.revature.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ecommerce.model.Users;

public interface UserRepository  extends JpaRepository<Users, Long> {
    void deleteById(Long id);

    Users findByUsername (String username);
    Optional<Users> findById (Long id);
}