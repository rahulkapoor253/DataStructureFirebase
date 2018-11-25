package com.example.rahulkapoor.datastructurefirebase;

public class MarkedUsers {

    public int UserId;

    int marked;//0 for dislike 1 for hot;

    public MarkedUsers(int userId, int mark) {
        this.UserId = userId;
        this.marked = mark;
    }

}
