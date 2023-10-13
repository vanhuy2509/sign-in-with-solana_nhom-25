package com.ps23708.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps23708.entity.Account;
import com.ps23708.repo.AccountRepo;



@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepo accrepo;

	
	@Override
	public Account save(Account entity) {
		return accrepo.save(entity);
	}



	@Override
	public List<Account> saveAll(List<Account> entities) {
		return (List<Account>)accrepo.saveAll(entities);
	}



	@Override
	public Optional<Account> findById(Integer id) {
		return accrepo.findById(id);
	}



	@Override
	public boolean existsById(Integer id) {
		return accrepo.existsById(id);
	}



	@Override
	public List<Account> findAll() {
		return (List<Account>)accrepo.findAll();
	}



	@Override
	public List<Account> findAllById(List<Integer> ids) {
		return (List<Account>)accrepo.findAllById(ids);
	}



	@Override
	public long count() {
		return accrepo.count();
	}



	@Override
	public void deleteById(Integer id) {
		accrepo.deleteById(id);
	}



	@Override
	public void delete(Account entity) {
		accrepo.delete(entity);
	}



	@Override
	public void deleteAll(List<Account> entities) {
		accrepo.deleteAll(entities);
	}



	@Override
	public void deleteAll() {
		accrepo.deleteAll();
	}



	@Override
	public boolean checklogin(Integer id, String email, String password) {
		// TODO Auto-generated method stub
		Optional<Account> optacc = findById(id);
		if(optacc.isPresent() && optacc.get().getPassword().equals(password)) {
			return true;
		}
		return false;
	}


}
