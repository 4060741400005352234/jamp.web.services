package jamp.response;

import java.util.List;

import jamp.model.Project;

public class ProjectReponse {
	
	private List<Project> projects;	

	public ProjectReponse() {
	}

	public ProjectReponse(List<Project> projects) {
		super();
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
