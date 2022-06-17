package com.homelessnt.project.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import java.sql.Date;

public class WorkExperience{

    private int work_exp_id;
    private int user_id; 
    private String company_name;
    private Date date_started;
    private Date date_ended;
    private String company_role;
    private String company_email;
    private String company_phone; 
    private String company_address;
    private String company_website;

    public WorkExperience(int work_exp_id, int user_id, String company_name, Date date_started, Date date_ended, String company_role, String company_email, String company_phone, String company_address, String company_website) {
        this.work_exp_id = work_exp_id;
        this.user_id = user_id;
        this.company_name = company_name;
        this.date_started = date_started;
        this.date_ended = date_ended;
        this.company_role = company_role;
        this.company_email = company_email;
        this.company_phone = company_phone;
        this.company_address = company_address;
        this.company_website = company_website;
    }

    public int getWork_exp_id() {
        return this.work_exp_id;
    }

    public void setWork_exp_id(int work_exp_id) {
        this.work_exp_id = work_exp_id;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCompany_name() {
        return this.company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Date getDate_started() {
        return this.date_started;
    }

    public void setDate_started(Date date_started) {
        this.date_started = date_started;
    }

    public Date getDate_ended() {
        return this.date_ended;
    }

    public void setDate_ended(Date date_ended) {
        this.date_ended = date_ended;
    }

    public String getCompany_role() {
        return this.company_role;
    }

    public void setCompany_role(String company_role) {
        this.company_role = company_role;
    }

    public String getCompany_email() {
        return this.company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getCompany_phone() {
        return this.company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getCompany_address() {
        return this.company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getCompany_website() {
        return this.company_website;
    }

    public void setCompany_website(String company_website) {
        this.company_website = company_website;
    }
    
}