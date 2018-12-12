package com.iss.Service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iss.Model.User;
import com.iss.Repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	//@Resource
	//UserRepository urepo;
	
	/*@Override
	@Transactional
	public User findUserById(String userID) {
		return urepo.findById(userID).get();
	}*/
	
	@Override
	public ArrayList<User> findAllUsers() {
		//ArrayList<User> ulist = (ArrayList<User>)urepo.findAll();
		//return ulist;
		return null;
	}
}
