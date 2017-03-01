package com.czc.ETM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czc.ETM.mapper.ShareMapper;
import com.czc.ETM.model.Share;

@Service
public class ShareService {
	@Autowired
	private ShareMapper shareMapper;
	
	public List<Share> getShareList(){
		return shareMapper.getShareList();
	}
}
