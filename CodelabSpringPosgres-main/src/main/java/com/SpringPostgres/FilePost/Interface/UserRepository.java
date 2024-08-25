package com.SpringPostgres.FilePost.Interface;

import com.SpringPostgres.FilePost.Users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
