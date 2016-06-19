package com.zenus.ona.controller;

public interface AsyncCallback {
	public void completed(String response);
	public void failed(String exception);
	public void cancelled();
}
