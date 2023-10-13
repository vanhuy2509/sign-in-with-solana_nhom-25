package com.ps23708.repo;

import org.springframework.data.repository.CrudRepository;

import com.ps23708.entity.Account;

public interface AccountRepo extends CrudRepository<Account, Integer>{
	
}
