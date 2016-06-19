package com.zenus.ona;

import com.zenus.ona.controller.AsyncCallback;
import com.zenus.ona.controller.OnaAsyncApiController;

public class AsyncApp 
{
    public static void main( String[] args )
    {
    	OnaAsyncApiController apiController = new OnaAsyncApiController();
    	AsyncCallback callback = new AsyncCallback() {
			
			public void failed(String exception) {
				System.out.println(exception);
			}
			
			public void completed(String response) {
				System.out.println(response);
			}
			
			public void cancelled() {
				System.out.println("cancelled");
			}
		};
		
		apiController.setCallback(callback);
    	apiController.getAllForms();
    }
}
