package com.czc.ETM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czc.ETM.model.Share;
import com.czc.ETM.service.ShareService;

@Controller
public class ShareController {
	@Autowired
	private ShareService shareService;
	
	@RequestMapping("/getShareList")
    @ResponseBody
    public List<Share> getShareList(){
		return shareService.getShareList();
	}
}
