package com.example.rahulkapoor.datastructurefirebase;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int UserId;

    private String Username;

    private String Email;

    private int CollegeId;

    private String HotCount;

    private String DislikeCount;

    private List<MarkedUsers> MarkedUsers;

    public User() {

    }

    public User(int userid, String username, String email, int collegeid, String hotcount, String dislikecount) {

        this.UserId = userid;
        this.Username = username;
        this.Email = email;
        this.CollegeId = collegeid;
        this.HotCount = hotcount;
        this.DislikeCount = dislikecount;
        MarkedUsers = new ArrayList<>();

    }


    public int getUserid() {
        return UserId;
    }

    public void setUserid(final int userid) {
        UserId = userid;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(final String email) {
        Email = email;
    }

    public int getCollegeid() {
        return CollegeId;
    }

    public void setCollegeid(final int collegeid) {
        CollegeId = collegeid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(final String username) {
        Username = username;
    }

    public String getDislikecount() {
        return DislikeCount;
    }

    public String getHotcount() {
        return HotCount;
    }


    public void setDislikecount(final String dislikecount) {
        DislikeCount = dislikecount;
    }


    public void setHotcount(final String hotcount) {
        HotCount = hotcount;
    }

    public List<MarkedUsers> getMarkedusers() {
        return MarkedUsers;
    }

    public void setMarkedusers(final List<MarkedUsers> markedusers) {
        this.MarkedUsers = markedusers;
    }
}
