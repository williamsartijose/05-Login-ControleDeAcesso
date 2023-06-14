package com.wsjsistema.wsjdscommerce.repositories;

import com.wsjsistema.wsjdscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}
