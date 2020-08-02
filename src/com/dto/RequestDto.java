package com.dto;

public class RequestDto {


    String SSN;
    String process_year;
	String location_id;
	String uid;


    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getProcess_year() {
        return process_year;
    }

    public void setProcess_year(String process_year) {
        this.process_year = process_year;
    }

}
