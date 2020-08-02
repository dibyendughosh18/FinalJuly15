package com.dto;

import java.util.Date;

public class History {

    String ssn;
    String year;
    String process_code;
    String uid_number;
    Date process_date;
    Date due_date;
	
    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getProcess_code() {
        return process_code;
    }

    public void setProcess_code(String process_code) {
        this.process_code = process_code;
    }

    public String getUid_number() {
        return uid_number;
    }

    public void setUid_number(String uid_number) {
        this.uid_number = uid_number;
    }

    public Date getProcess_cd_date() {
        return process_date;
    }

    public void setProcess_cd_date(Date process_cd_date) {
        this.process_date = process_cd_date;
    }

    public String getDeadline__date() {
        return deadline__date;
    }

    public void setDeadline__date(String deadline__date) {
        this.deadline__date = deadline__date;
    }

    String deadline__date;
}
