package com.sctce.authapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseUser user;
 private DatabaseReference reference;
    private String userID;
   private Button logOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        logOut = (Button) findViewById(R.id.signOut);
        logOut.setOnClickListener(new View.OnClickListener() {
               @Override
                public void onClick(View v) {
                   FirebaseAuth.getInstance().signOut();
                   startActivity(new Intent(ProfileActivity.this,MainActivity.class));
                        }
              }
        );

          user = FirebaseAuth.getInstance().getCurrentUser();





    }
}

