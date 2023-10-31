package com.example.demo.Repository;

import com.example.demo.Model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDetail, Integer> {
    Optional<UserDetail>findByUserEmail(String email);
    UserDetail findByUserEmailIgnoreCase(String emailId);

    Boolean existsByUserEmail(String email);
}
