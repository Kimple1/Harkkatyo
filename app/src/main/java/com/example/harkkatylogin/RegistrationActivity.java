package com.example.harkkatylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.regex.Pattern;

public class RegistrationActivity extends AppCompatActivity {

    // Activity handles registration of new users, info saved on device
    private EditText eRegisterName;
    private EditText eRegisterPassword;
    private Button eRegister;

    public Credentials credentials;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferenceEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        eRegisterName = findViewById(R.id.etRegisterName);
        eRegisterPassword = findViewById(R.id.etRegisterPassword);
        eRegister = findViewById(R.id.btnRegister);

        credentials = new Credentials();
        // On device file where usernames and passwords are held
        sharedPreferences = getApplicationContext().getSharedPreferences("CredentialsDB", MODE_PRIVATE);
        sharedPreferenceEditor = sharedPreferences.edit();
        // Loading all users to a map if info exists in file
        if(sharedPreferences != null){
            Map<String, ?> preferencesMap = sharedPreferences.getAll();
            if(preferencesMap.size() != 0){
                credentials.loadCredentials(preferencesMap);
            }
        }

        eRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String regUsername = eRegisterName.getText().toString();
                String regPassword = eRegisterPassword.getText().toString();

                if(validate(regUsername, regPassword)) {
                    if (credentials.checkUsername(regUsername)) {
                        Toast.makeText(RegistrationActivity.this, "Username taken!", Toast.LENGTH_SHORT).show();
                    } else {
                        credentials.addCredentials(regUsername, regPassword);
                        sharedPreferenceEditor.putString(regUsername, regPassword);

                        sharedPreferenceEditor.putString("LastSavedUsername", regUsername);
                        sharedPreferenceEditor.putString("LastSavedPassword", regPassword);

                        sharedPreferenceEditor.apply();

                        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
                    }
                }
            }
        });


    }

    // Method for checking whether the password meets the requirements
    private boolean validate(String username, String password) {
        Pattern specialCharPattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePattern = Pattern.compile("[A-Z ]");
        Pattern lowerCasePattern = Pattern.compile("[a-z ]");
        Pattern digitCasePattern = Pattern.compile("[0-9 ]");

        if (username.isEmpty() || password.length() < 12) {
            Toast.makeText(this, "PLease enter all the details, password at least 12 characters, and should contain a number, upper and lowercase letter and a special character!", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            if (!specialCharPattern.matcher(password).find()) {
                Toast.makeText(this, "PLease enter all the details, password at least 12 characters, and should contain a number, upper and lowercase letter and a special character!", Toast.LENGTH_SHORT).show();
                return false;
            }
            if (!UpperCasePattern.matcher(password).find()) {
                Toast.makeText(this, "PLease enter all the details, password at least 12 characters, and should contain a number, upper and lowercase letter and a special character!", Toast.LENGTH_SHORT).show();
                return false;
            }
            if (!lowerCasePattern.matcher(password).find()) {
                Toast.makeText(this, "PLease enter all the details, password at least 12 characters, and should contain a number, upper and lowercase letter and a special character!", Toast.LENGTH_SHORT).show();
                return false;
            }
            if (!digitCasePattern.matcher(password).find()) {
                Toast.makeText(this, "PLease enter all the details, password at least 12 characters, and should contain a number, upper and lowercase letter and a special character!", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
}