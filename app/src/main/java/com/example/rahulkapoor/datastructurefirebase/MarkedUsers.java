package com.example.rahulkapoor.datastructurefirebase;

public class MarkedUsers {

    private int UserId;

    private int marked;//0 for dislike 1 for hot;

    public MarkedUsers(int userid, int marked) {
        this.UserId = userid;
        this.marked = marked;
    }

    public void setUserid(final int userid) {
        UserId = userid;
    }

    public void setMarked(final int marked) {
        this.marked = marked;
    }

    public int getUserid() {
        return UserId;
    }

    public int getMarked() {
        return marked;
    }
}
