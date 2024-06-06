package com.example.equityvalidation;

import java.util.Date;

public class User {
    private String agentCode;
    private String fullName;
    private String branch;
    private String country;
    private Date sessionExpiryDate;

    public User() {}

    public User(String agentCode, String fullName, String branch, String country, Date sessionExpiryDate) {
        this.agentCode = agentCode;
        this.fullName = fullName;
        this.branch = branch;
        this.country = country;
        this.sessionExpiryDate = sessionExpiryDate;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getSessionExpiryDate() {
        return sessionExpiryDate;
    }

    public void setSessionExpiryDate(Date sessionExpiryDate) {
        this.sessionExpiryDate = sessionExpiryDate;
    }
}