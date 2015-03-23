package com.playmatecat.testproject.vo;

import com.playmatecat.testproject.dto.JobDTO;
import com.playmatecat.testproject.dto.UserDTO;

/**
 * 传递于ctrl和cpt之间,也可以传到page
 * @author blackcat
 * 
 *
 */
public class ModuleNameVO {
	private UserDTO user;
	private JobDTO job;
	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public JobDTO getJob() {
		return job;
	}
	public void setJob(JobDTO job) {
		this.job = job;
	}
}
