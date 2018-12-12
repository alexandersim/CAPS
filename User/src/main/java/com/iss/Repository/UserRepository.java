package com.iss.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.iss.Model.User;

public interface UserRepository extends JpaRepository<User, String> {

	
}
