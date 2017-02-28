package com.czc.ETM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czc.ETM.mapper.TeamMapper;
import com.czc.ETM.model.Team;

@Service
public class TeamService {
	@Autowired
	private TeamMapper teamMapper;
	
	public Team getTeam(int id){
		return teamMapper.selectTeamById(id);
	}
}
