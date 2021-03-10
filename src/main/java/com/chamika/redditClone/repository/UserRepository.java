package com.chamika.redditClone.repository;

import com.chamika.redditClone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
