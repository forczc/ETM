package com.czc.ETM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czc.ETM.mapper.UserMapper;
import com.czc.ETM.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getAllUserList() {
		User user = userMapper.getAllUserList();
		return user;
	}

}
