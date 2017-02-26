package com.czc.ETM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czc.ETM.mapper.UserMapper;
import com.czc.ETM.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserInfo() {
		User user = userMapper.findUserInfo();
		// User user=null;
		return user;
	}

}
