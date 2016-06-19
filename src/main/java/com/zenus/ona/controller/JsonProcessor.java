package com.zenus.ona.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.zenus.ona.model.OnaFormData;

public class JsonProcessor {
	
	public List<OnaFormData> parseFormDataJSON(String jsonData){
		List<OnaFormData> forms = new ArrayList<OnaFormData>();
		try {
			ObjectMapper mapper = new ObjectMapper();
		  	JsonFactory factory = mapper.getFactory();
		  	JsonParser jp = factory.createParser(jsonData);
		  	JsonNode actualObj = mapper.readTree(jp);
		  	
		  	if (actualObj instanceof ArrayNode){
		  		ArrayNode formList = (ArrayNode) actualObj;
		  		for (JsonNode node : formList){
		  			OnaFormData formData = parseFormJSON(node);
		  			if (formData != null)
		  				forms.add(formData);
		  		}
		  	}
		} catch (Exception e){
			e.printStackTrace();
		}
		return forms;
	}
	
	private OnaFormData parseFormJSON(JsonNode node) {
		OnaFormData formData = new OnaFormData();
		try {
			Iterator<Map.Entry<String, JsonNode>> itr = node.fields();
			while (itr.hasNext()) {
				Map.Entry<String, JsonNode> myNode = itr.next();
				
				if("_notes".equals(myNode.getKey())){
					formData.set_notes(myNode.getValue().asText());
				} else if("_bamboo_dataset_id".equals(myNode.getKey())){
					formData.set_bamboo_dataset_id(myNode.getValue().asText());
				} else if("_tags".equals(myNode.getKey())){
					formData.set_tags(myNode.getValue().asText());
				} else if("_xform_id_string".equals(myNode.getKey())){
					formData.set_xform_id_string(myNode.getValue().asText());
				} else if("meta/instanceID".equals(myNode.getKey())){
					formData.setMeta_instanceID(myNode.getValue().asText());
				} else if("_duration".equals(myNode.getKey())){
					formData.set_duration(myNode.getValue().asText());
				} else if("end".equals(myNode.getKey())){
					formData.setEnd(myNode.getValue().asText());
				} else if("start".equals(myNode.getKey())){
					formData.setStart(myNode.getValue().asText());
				} else if("_geolocation".equals(myNode.getKey())){
					formData.set_geolocation(myNode.getValue().asText());
				} else if("_edited".equals(myNode.getKey())){
					formData.set_edited(myNode.getValue().asText());
				} else if("_status".equals(myNode.getKey())){
					formData.set_status(myNode.getValue().asText());
				} else if("today".equals(myNode.getKey())){
					formData.setToday(myNode.getValue().asText());
				} else if("simserial".equals(myNode.getKey())){
					formData.setSimserial(myNode.getValue().asText());
				} else if("_uuid".equals(myNode.getKey())){
					formData.set_uuid(myNode.getValue().asText());
				} else if("_submitted_by".equals(myNode.getKey())){
					formData.set_submitted_by(myNode.getValue().asText());
				} else if("formhub/uuid".equals(myNode.getKey())){
					formData.setFormhub_uuid(myNode.getValue().asText());
				} else if("_submission_time".equals(myNode.getKey())){
					formData.set_submission_time(myNode.getValue().asText());
				} else if("_version".equals(myNode.getKey())){
					formData.set_version(myNode.getValue().asText());
				} else if("_attachments".equals(myNode.getKey())){
					formData.set_attachments(myNode.getValue().asText());
				} else if("deviceid".equals(myNode.getKey())){
					formData.setDeviceid(myNode.getValue().asText());
				} else if("_id".equals(myNode.getKey())){
					formData.set_id(myNode.getValue().asText());
				} else if("subscriberid".equals(myNode.getKey())){
					formData.setSubscriberid(myNode.getValue().asText());
				} else {
					formData.getItems().put(myNode.getKey(), myNode.getValue().asText());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return formData;
	}
}
