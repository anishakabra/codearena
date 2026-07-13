package com.anisha.codearena.repository;

import com.anisha.codearena.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}