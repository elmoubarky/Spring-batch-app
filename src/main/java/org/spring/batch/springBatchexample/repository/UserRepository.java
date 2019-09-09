package org.spring.batch.springBatchexample.repository;


import java.util.List;

import org.spring.batch.springBatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	

}
