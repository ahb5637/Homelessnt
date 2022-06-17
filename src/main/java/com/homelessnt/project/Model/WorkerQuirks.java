package com.homelessnt.project.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import java.sql.Date;

public class WorkerQuirks {
    private int user_id;
    private String school; 
    private String major_1;
    private String major_2;
    private String minor_1;
    private String minor_2;
    private String passions_1;
    private String passions_2; 
    private String passions_3;
    private String passions_4;
    private String passions_5;
    private String linked_in_link;  
    private String proffession;
    private String industry_name;
    private String soft_skill_1;
    private String soft_skill_2; 
    private String soft_skill_3;
    private String hard_skill_1;
    private String hard_skill_2;
    private String hard_skill_3;
    private String hard_skill_4;
    private String hard_skill_5;

    public WorkerQuirks(int user_id, String school, String major_1, String major_2, String minor_1, String minor_2, String passions_1, String passions_2, String passions_3, String passions_4, String passions_5, String linked_in_link, String proffession, String industry_name, String soft_skill_1, String soft_skill_2, String soft_skill_3, String hard_skill_1, String hard_skill_2, String hard_skill_3, String hard_skill_4, String hard_skill_5) {
        this.user_id = user_id;
        this.school = school;
        this.major_1 = major_1;
        this.major_2 = major_2;
        this.minor_1 = minor_1;
        this.minor_2 = minor_2;
        this.passions_1 = passions_1;
        this.passions_2 = passions_2;
        this.passions_3 = passions_3;
        this.passions_4 = passions_4;
        this.passions_5 = passions_5;
        this.linked_in_link = linked_in_link;
        this.proffession = proffession;
        this.industry_name = industry_name;
        this.soft_skill_1 = soft_skill_1;
        this.soft_skill_2 = soft_skill_2;
        this.soft_skill_3 = soft_skill_3;
        this.hard_skill_1 = hard_skill_1;
        this.hard_skill_2 = hard_skill_2;
        this.hard_skill_3 = hard_skill_3;
        this.hard_skill_4 = hard_skill_4;
        this.hard_skill_5 = hard_skill_5;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public String getMinor_1() {
        return this.minor_1;
    }

    public void setMinor_1(String minor_1) {
        this.minor_1 = minor_1;
    }

    public String getMinor_2() {
        return this.minor_2;
    }

    public void setMinor_2(String minor_2) {
        this.minor_2 = minor_2;
    }

    public String getPassions_1() {
        return this.passions_1;
    }

    public void setPassions_1(String passions_1) {
        this.passions_1 = passions_1;
    }

    public String getPassions_2() {
        return this.passions_2;
    }

    public void setPassions_2(String passions_2) {
        this.passions_2 = passions_2;
    }

    public String getPassions_3() {
        return this.passions_3;
    }

    public void setPassions_3(String passions_3) {
        this.passions_3 = passions_3;
    }

    public String getPassions_4() {
        return this.passions_4;
    }

    public void setPassions_4(String passions_4) {
        this.passions_4 = passions_4;
    }

    public String getPassions_5() {
        return this.passions_5;
    }

    public void setPassions_5(String passions_5) {
        this.passions_5 = passions_5;
    }

    public String getLinked_in_link() {
        return this.linked_in_link;
    }

    public void setLinked_in_link(String linked_in_link) {
        this.linked_in_link = linked_in_link;
    }

    public String getProffession() {
        return this.proffession;
    }

    public void setProffession(String proffession) {
        this.proffession = proffession;
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


}
