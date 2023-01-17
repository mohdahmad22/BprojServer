package com.makcom.in.BProj.JPA;

import com.makcom.in.BProj.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpa extends JpaRepository<User , Integer> {

}
