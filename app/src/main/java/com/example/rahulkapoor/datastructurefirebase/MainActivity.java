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

        //create a new user;
        User user = new User("rahul253@gmail.com", "rahul kapoor");

        //create a new college object;
        College college = new College(101, "chitkara university", "punjab");

        //push generates a unique key for every user;

        myRef.child("Users").push().setValue(user);

        myRef.child("Colleges").push().setValue(college);

    }
}
