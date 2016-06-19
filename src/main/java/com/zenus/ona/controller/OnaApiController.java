package com.zenus.ona.controller;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.zenus.ona.util.Constants;

public class OnaApiController implements ApiController{
	
	public String getAllForms(){
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_ALL_FORMS);
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String getFormDetailsById(String id) {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_FORM_DETAILS.replace("$", id));
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getFormDataById(String id) {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_FORM_DATA.replace("$", id));
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getProjects() {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_ALL_PROJECTS);
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getProjectDetailsById(String id) {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_PROJECT_DETAILS.replace("$", id));
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getOrganizationDetailsByName(String name) {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_ORGANIZATION_DETAILS.replace("$", name));
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public String getUserDetailsByUsername(String username) {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
		  	HttpGet request = new HttpGet(Constants.URL_USER_DETAIL.replace("$", username));
		  	request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		  	HttpResponse response = client.execute(request);
	
		  	HttpEntity entity = response.getEntity();
		  	return EntityUtils.toString(entity, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
