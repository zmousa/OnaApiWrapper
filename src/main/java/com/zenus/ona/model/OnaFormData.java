package com.zenus.ona.model;

import java.util.HashMap;
import java.util.Map;

public class OnaFormData {
	private String _notes;
	private String _bamboo_dataset_id;
	private String _tags;
	private String _xform_id_string;
	private String meta_instanceID;
	private String _duration;
	private String end;
	private String start;
	private String _geolocation;
	private String _edited;
	private String _status;
	private String today;
	private String simserial;
	private String _uuid;
	private String _submitted_by;
	private String formhub_uuid;
	private String _submission_time;
	private String _version;
	private String _attachments;
	private String deviceid;
	private String _id;
	private String subscriberid;
	
	public OnaFormData() {
		items = new HashMap<String, String>();
	}
	
	private Map<String, String> items;

	public String get_notes() {
		return _notes;
	}

	public void set_notes(String _notes) {
		this._notes = _notes;
	}

	public String get_bamboo_dataset_id() {
		return _bamboo_dataset_id;
	}

	public void set_bamboo_dataset_id(String _bamboo_dataset_id) {
		this._bamboo_dataset_id = _bamboo_dataset_id;
	}

	public String get_tags() {
		return _tags;
	}

	public void set_tags(String _tags) {
		this._tags = _tags;
	}

	public String get_xform_id_string() {
		return _xform_id_string;
	}

	public void set_xform_id_string(String _xform_id_string) {
		this._xform_id_string = _xform_id_string;
	}

	public String getMeta_instanceID() {
		return meta_instanceID;
	}

	public void setMeta_instanceID(String meta_instanceID) {
		this.meta_instanceID = meta_instanceID;
	}

	public String get_duration() {
		return _duration;
	}

	public void set_duration(String _duration) {
		this._duration = _duration;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String get_geolocation() {
		return _geolocation;
	}

	public void set_geolocation(String _geolocation) {
		this._geolocation = _geolocation;
	}

	public String get_edited() {
		return _edited;
	}

	public void set_edited(String _edited) {
		this._edited = _edited;
	}

	public String get_status() {
		return _status;
	}

	public void set_status(String _status) {
		this._status = _status;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getSimserial() {
		return simserial;
	}

	public void setSimserial(String simserial) {
		this.simserial = simserial;
	}

	public String get_uuid() {
		return _uuid;
	}

	public void set_uuid(String _uuid) {
		this._uuid = _uuid;
	}

	public String get_submitted_by() {
		return _submitted_by;
	}

	public void set_submitted_by(String _submitted_by) {
		this._submitted_by = _submitted_by;
	}

	public String getFormhub_uuid() {
		return formhub_uuid;
	}

	public void setFormhub_uuid(String formhub_uuid) {
		this.formhub_uuid = formhub_uuid;
	}

	public String get_submission_time() {
		return _submission_time;
	}

	public void set_submission_time(String _submission_time) {
		this._submission_time = _submission_time;
	}

	public String get_version() {
		return _version;
	}

	public void set_version(String _version) {
		this._version = _version;
	}

	public String get_attachments() {
		return _attachments;
	}

	public void set_attachments(String _attachments) {
		this._attachments = _attachments;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getSubscriberid() {
		return subscriberid;
	}

	public void setSubscriberid(String subscriberid) {
		this.subscriberid = subscriberid;
	}

	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}
}
