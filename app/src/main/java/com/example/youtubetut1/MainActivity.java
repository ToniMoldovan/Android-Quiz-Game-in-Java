package com.example.youtubetut1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v) {
        /* Getting the username & password and storing
        * them into strings */
        TextView tbUsername = findViewById(R.id.txtboxUtilizator);
        TextView tbPassword = findViewById(R.id.txtboxParola);

        String username = tbUsername.getText().toString();
        String password = tbPassword.getText().toString();

        /* Clearing the text boxes */
        tbUsername.setText("");
        tbPassword.setText("");
        tbUsername.clearFocus();
        tbPassword.clearFocus();

        /* Print them for debugging */
        Log.d("LOGIN", "USERNAME: " + username);
        Log.d("LOGIN", "PASSWORD: " + password);
    }
}