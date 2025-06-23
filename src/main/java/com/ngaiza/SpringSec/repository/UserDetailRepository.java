package com.ngaiza.SpringSec.repository;

import com.ngaiza.SpringSec.model.UserAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<UserAccounts, Integer> {

    UserAccounts findByUsername(String username);

}
