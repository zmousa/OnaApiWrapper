package com.zenus.ona.controller;

import java.util.concurrent.CountDownLatch;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;

import com.zenus.ona.util.Constants;

public class OnaAsyncApiController implements ApiController{
	private AsyncCallback callback;
	
	public String getAllForms(){
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    final HttpGet request = new HttpGet(Constants.URL_ALL_FORMS);
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}
	
	public String getFormDetailsById(String id) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_FORM_DETAILS.replace("$", id));
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	public String getFormDataById(String id) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_FORM_DATA.replace("$", id));
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	public String getProjects() {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_ALL_PROJECTS);
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	public String getProjectDetailsById(String id) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_PROJECT_DETAILS.replace("$", id));
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	public String getOrganizationDetailsByName(String name) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_ORGANIZATION_DETAILS.replace("$", name));
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	public String getUserDetailsByUsername(String username) {
		CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();
		try {
		    httpclient.start();
		    final CountDownLatch latch = new CountDownLatch(1);
		    HttpGet request = new HttpGet(Constants.URL_USER_DETAIL.replace("$", username));
		    request.setHeader(HttpHeaders.AUTHORIZATION, Constants.AUTHORIZATION);
		    httpclient.execute(request, new FutureCallback<HttpResponse>() {

		        public void completed(final HttpResponse response) {
		            HttpEntity entity = response.getEntity();
		            try {
						String jsonResponse = EntityUtils.toString(entity, "UTF-8");
						getCallback().completed(jsonResponse);
						latch.countDown();
					} catch (Exception e) {
						e.printStackTrace();
					}
		        }

		        public void failed(final Exception ex) {
		            getCallback().failed(ex.getMessage());
		            latch.countDown();
		        }

		        public void cancelled() {
		            getCallback().cancelled();
		            latch.countDown();
		        }
		    });
		    latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "";
	}

	private AsyncCallback getCallback() {
		return callback;
	}

	public void setCallback(AsyncCallback callback) {
		this.callback = callback;
	}
}
