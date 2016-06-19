package com.zenus.ona.controller;

public interface ApiController {
	public String getAllForms();
	public String getFormDetailsById(String id);
	public String getFormDataById(String id);
	
	public String getProjects();
	public String getProjectDetailsById(String id);
	
	public String getOrganizationDetailsByName(String name);
	
	public String getUserDetailsByUsername(String username);
}
