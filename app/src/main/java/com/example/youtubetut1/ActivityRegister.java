package com.example.youtubetut1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Log.d("ACTIVITY", "ActivityRegister started successfully!");
    }

    public void startLoginActivity(View v) {
        Intent startLoginActivityIntent = new Intent(this, ActivityLogin.class);
        startLoginActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.getApplicationContext().startActivity(startLoginActivityIntent);
    }
}