package com.example.rahulkapoor.datastructurefirebase;

import java.util.ArrayList;

public class User {

    public int UserId;

    public String Username;

    public String Email;

    public int CollegeId;

    int HotCount;

    int DislikeCount;

    public ArrayList<MarkedUsers> markedUsersList;


    public User(int userId, String usrname, String email, int collegeId, int hotCount, int dislikeCount) {

        this.UserId = userId;
        this.Username = usrname;
        this.Email = email;
        this.CollegeId = collegeId;
        this.HotCount = hotCount;
        this.DislikeCount = dislikeCount;
        markedUsersList = new ArrayList<>();

    }


}
