package com.example.rahulkapoor.datastructurefirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    public String root = "https://datastructurefirebase.firebaseio.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        //adding a nested data structure in firebase;

        int userId = 1;
        String username = "rahul253";
        String email = "rahul@gmail.com";
        int collegeId = 101;
        int hotCount = 5;
        int dislikeCount = 2;

        //create a new user;
        User user = new User(userId, username, email, collegeId, hotCount, dislikeCount);

        //push generates a unique key for every user;

        myRef.child("Users").child(String.valueOf(userId)).setValue(user);

        //the user details are set; now we just handle markedusers list;

        //102 user will be picked from list ;
        MarkedUsers markedUsers = new MarkedUsers(102, 1);//marked hot;

        user.markedUsersList.add(markedUsers);

        myRef.child("Users").child(String.valueOf(userId)).child("MarkedUsers").child("102").setValue(markedUsers);

    }
}
