package com.homelessnt.project.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;
@Entity

@Table(name = "users_metrics",schema = "test2")
public class UserMetrics{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private Date birth_date; 
    private char gender;
    private boolean is_recruiter;
    private char swipes_per_day;
    private boolean is_premium;
    private boolean is_boosted;


    public UserMetrics() {
    }

    public UserMetrics(int user_id, String username, String first_name, String last_name, String email, 
    String password, Date birth_date, char gender, boolean is_recruiter, char swipes_per_day, 
    boolean is_premium, boolean is_boosted) {
        this.user_id = user_id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.birth_date = birth_date;
        this.gender = gender;
        this.is_recruiter = is_recruiter;
        this.swipes_per_day = swipes_per_day;
        this.is_premium = is_premium;
        this.is_boosted = is_boosted;
    }



    public int getUser_id() {
        return this.user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth_date() {
        return this.birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isIs_recruiter() {
        return this.is_recruiter;
    }

    public boolean getIs_recruiter() {
        return this.is_recruiter;
    }

    public void setIs_recruiter(boolean is_recruiter) {
        this.is_recruiter = is_recruiter;
    }

    public char getSwipes_per_day() {
        return this.swipes_per_day;
    }

    public void setSwipes_per_day(char swipes_per_day) {
        this.swipes_per_day = swipes_per_day;
    }

    public boolean isIs_premium() {
        return this.is_premium;
    }

    public boolean getIs_premium() {
        return this.is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }

    public boolean isIs_boosted() {
        return this.is_boosted;
    }

    public boolean getIs_boosted() {
        return this.is_boosted;
    }

    public void setIs_boosted(boolean is_boosted) {
        this.is_boosted = is_boosted;
    }
    
}

