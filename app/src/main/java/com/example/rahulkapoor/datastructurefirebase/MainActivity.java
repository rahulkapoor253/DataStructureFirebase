package com.example.rahulkapoor.datastructurefirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    public String root = "https://datastructurefirebase.firebaseio.com/";
    public String TAG = "MAINACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        //adding a nested data structure in firebase;
/*
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


        User user = new User();

        user.markedUsersList = new ArrayList<>();
        //the user details are set; now we just handle markedusers list;

        //102 user will be picked from list ;
        MarkedUsers markedUsers = new MarkedUsers(102, 1);//marked hot;

        user.markedUsersList.add(markedUsers);

        myRef.child("Users").child(String.valueOf(1)).child("MarkedUsers").child("102").setValue(markedUsers);

        */

//getting nested data structure in firebase;¬
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                //String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + dataSnapshot.child("Users").child("1").getValue(User.class));
                User user = dataSnapshot.child("Users").child("1").getValue(User.class);
                Toast.makeText(MainActivity.this, user.getMarkedusers() + " ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

    }
}
