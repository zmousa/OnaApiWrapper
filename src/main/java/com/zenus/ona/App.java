package com.zenus.ona;

import java.util.List;

import com.zenus.ona.controller.ApiController;
import com.zenus.ona.controller.JsonProcessor;
import com.zenus.ona.controller.OnaApiController;
import com.zenus.ona.model.OnaFormData;

public class App 
{
    public static void main( String[] args )
    {
    	ApiController api_Controller = new OnaApiController();
    	
		String jsonData = api_Controller.getFormDataById("120849");
		
		JsonProcessor jsonProcessor = new JsonProcessor();
		List<OnaFormData> forms = jsonProcessor.parseFormDataJSON(jsonData);
		System.out.println(forms.size());
    }
}
