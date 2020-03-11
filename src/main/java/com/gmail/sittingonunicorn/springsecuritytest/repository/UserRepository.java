package com.gmail.sittingonunicorn.springsecuritytest.repository;

import com.gmail.sittingonunicorn.springsecuritytest.entity.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(@NonNull String username);
    //Optional<User> findByEmail(String email);
}
