package com.homelessnt.project.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import java.sql.Date;

public class RecruiterQuirks {
    private int listing_id;
    private int user_id;
    private String company_name; 
    private String job_postion;
    private String salary;
    private String location_job;
    private boolean is_on_site;
    private String linked_in_link;
    private String glass_door_link; 
    private char work_exp_years_req;
    private String industry_name; 
    private String soft_skill_1;
    private String soft_skill_2; 
    private String soft_skill_3;
    private String hard_skill_1;
    private String hard_skill_2;
    private String hard_skill_3;
    private String hard_skill_4;
    private String hard_skill_5;
    private String major_1;
    private String major_2;
    private String major_3;
    private String major_4;
    private String major_5;

    public RecruiterQuirks(int listing_id, int user_id, String company_name, String job_postion, String salary, String location_job, boolean is_on_site, String linked_in_link, String glass_door_link, char work_exp_years_req, String industry_name, String soft_skill_1, String soft_skill_2, String soft_skill_3, String hard_skill_1, String hard_skill_2, String hard_skill_3, String hard_skill_4, String hard_skill_5, String major_1, String major_2,String major_3,String major_4,String major_5) {
        this.listing_id = listing_id;
        this.user_id = user_id;
        this.company_name = company_name;
        this.job_postion = job_postion;
        this.salary = salary;
        this.location_job = location_job;
        this.is_on_site = is_on_site;
        this.linked_in_link = linked_in_link;
        this.glass_door_link = glass_door_link;
        this.work_exp_years_req = work_exp_years_req;
        this.industry_name = industry_name;
        this.soft_skill_1 = soft_skill_1;
        this.soft_skill_2 = soft_skill_2;
        this.soft_skill_3 = soft_skill_3;
        this.hard_skill_1 = hard_skill_1;
        this.hard_skill_2 = hard_skill_2;
        this.hard_skill_3 = hard_skill_3;
        this.hard_skill_4 = hard_skill_4;
        this.hard_skill_5 = hard_skill_5;
        this.major_1 = major_1;
        this.major_2 = major_2;
        this.major_3 = major_3;
        this.major_4 = major_4;
        this.major_5 = major_5;
    }
    public int getListing_id() {
        return this.listing_id;
    }

    public void setListing_id(int listing_id) {
        this.listing_id = listing_id;
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

    public String getJob_postion() {
        return this.job_postion;
    }

    public void setJob_postion(String job_postion) {
        this.job_postion = job_postion;
    }

    public String getSalary() {
        return this.salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation_job() {
        return this.location_job;
    }

    public void setLocation_job(String location_job) {
        this.location_job = location_job;
    }

    public boolean isIs_on_site() {
        return this.is_on_site;
    }

    public boolean getIs_on_site() {
        return this.is_on_site;
    }

    public void setIs_on_site(boolean is_on_site) {
        this.is_on_site = is_on_site;
    }

    public String getLinked_in_link() {
        return this.linked_in_link;
    }

    public void setLinked_in_link(String linked_in_link) {
        this.linked_in_link = linked_in_link;
    }

    public String getGlass_door_link() {
        return this.glass_door_link;
    }

    public void setGlass_door_link(String glass_door_link) {
        this.glass_door_link = glass_door_link;
    }

    public char getWork_exp_years_req() {
        return this.work_exp_years_req;
    }

    public void setWork_exp_years_req(char work_exp_years_req) {
        this.work_exp_years_req = work_exp_years_req;
    }

    public String getIndustry_name() {
        return this.industry_name;
    }

    public void setIndustry_name(String industry_name) {
        this.industry_name = industry_name;
    }

    public String getSoft_skill_1() {
        return this.soft_skill_1;
    }

    public void setSoft_skill_1(String soft_skill_1) {
        this.soft_skill_1 = soft_skill_1;
    }

    public String getSoft_skill_2() {
        return this.soft_skill_2;
    }

    public void setSoft_skill_2(String soft_skill_2) {
        this.soft_skill_2 = soft_skill_2;
    }

    public String getSoft_skill_3() {
        return this.soft_skill_3;
    }

    public void setSoft_skill_3(String soft_skill_3) {
        this.soft_skill_3 = soft_skill_3;
    }

    public String getHard_skill_1() {
        return this.hard_skill_1;
    }

    public void setHard_skill_1(String hard_skill_1) {
        this.hard_skill_1 = hard_skill_1;
    }

    public String getHard_skill_2() {
        return this.hard_skill_2;
    }

    public void setHard_skill_2(String hard_skill_2) {
        this.hard_skill_2 = hard_skill_2;
    }

    public String getHard_skill_3() {
        return this.hard_skill_3;
    }

    public void setHard_skill_3(String hard_skill_3) {
        this.hard_skill_3 = hard_skill_3;
    }

    public String getHard_skill_4() {
        return this.hard_skill_4;
    }

    public void setHard_skill_4(String hard_skill_4) {
        this.hard_skill_4 = hard_skill_4;
    }

    public String getHard_skill_5() {
        return this.hard_skill_5;
    }

    public void setHard_skill_5(String hard_skill_5) {
        this.hard_skill_5 = hard_skill_5;
    }

    public String getMajor_1() {
        return this.major_1;
    }

    public void setMajor_1(String major_1) {
        this.major_1 = major_1;
    }
    public String getMajor_2() {
        return this.major_2;
    }

    public void setMajor_2(String major_2) {
        this.major_2 = major_2;
    }
    public String getMajor_3() {
        return this.major_3;
    }

    public void setMajor_3(String major_3) {
        this.major_3 = major_3;
    }

    public String getMajor_4() {
        return this.major_4;
    }

    public void setMajor_4(String major_4) {
        this.major_4= major_4;
    }

    public String getMajor_5() {
        return this.major_5;
    }

    public void setMajor_5(String major_5) {
        this.major_5 = major_5;
    }
}
