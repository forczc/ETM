package com.czc.ETM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czc.ETM.model.Team;
import com.czc.ETM.service.TeamService;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/getTeam")
    @ResponseBody
    public Team getUserInfo() {
		Team team = teamService.getTeam(1);
        return team;
    }
}
