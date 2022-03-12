package com.example.youtubetut1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.AsyncTaskLoader;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.lang.Object;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginUser(View v) {
        /* Getting the username & password and storing
        * them into strings */
        TextView tbUsername = findViewById(R.id.txtboxUtilizator);
        TextView tbPassword = findViewById(R.id.txtboxParola);
        TextView lblError = findViewById(R.id.lblErrorTxt);

        if (tbPassword.length() < 3 || tbUsername.length() < 3) {
            lblError.setText("Numele sau parola trebuie sa contina minim 3 caractere!");
            lblError.setVisibility(View.VISIBLE);

            /* Clearing the text boxes */
            tbUsername.setText("");
            tbPassword.setText("");
            tbUsername.clearFocus();
        }
        else {
            /* Clearing the text boxes */
            tbUsername.setText("");
            tbPassword.setText("");
            tbUsername.clearFocus();
            lblError.setVisibility(View.INVISIBLE);

            String username = tbUsername.getText().toString();
            String password = tbPassword.getText().toString();

            /* Print them for debugging */
            Log.d("LOGIN", "USERNAME: " + username);
            Log.d("LOGIN", "PASSWORD: " + password);
        }
    }

    public void startRegisterActivity(View v) {
        TextView lbl = findViewById(R.id.lblErrorTxt);
        lbl.setText("Se incarca..");
        lbl.setVisibility(View.VISIBLE);

        Log.d("BUTTON_PRESSED", "Autentifica-te button was pressed.");

        Intent startRegisterActivityIntent = new Intent(this, ActivityRegister.class);
        startRegisterActivityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.getApplicationContext().startActivity(startRegisterActivityIntent);

        Log.d("ACTIVITY", "ActivityRegister intent was launched.");
    }
}