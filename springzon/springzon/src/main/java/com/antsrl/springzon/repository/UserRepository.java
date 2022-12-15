package com.antsrl.springzon.repository;

import com.antsrl.springzon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // SELECT * FROM utenti WHERE username = ?
    public User findByUsername(String username);

    // SELECT * FROM utenti WHERE password = ?
    public User findByPassword(String password);
}
