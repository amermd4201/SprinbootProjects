package com.eurekaserverproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eurekaserverproject.entity.Users;
@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

}
