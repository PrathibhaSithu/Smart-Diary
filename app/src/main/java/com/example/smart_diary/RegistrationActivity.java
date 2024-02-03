package com.example.smart_diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private EditText signupName, signupEmail, signupUsername, signupPassword;
    private Button signupButton;
    private TextView loginRedirectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        registration();
    }

    private void registration(){
        signupName = findViewById(R.id.signup_name);
        signupEmail = findViewById(R.id.signup_email);
        signupUsername = findViewById(R.id.signup_username);
        signupPassword = findViewById(R.id.signup_password);

        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = signupName.getText().toString().trim();
                String email = signupEmail.getText().toString().trim();
                String username = signupUsername.getText().toString().trim();
                String password = signupPassword.getText().toString().trim();

                if(TextUtils.isEmpty(name)){
                    signupName.setError("Name is required...");
                    return;
                }
                if(TextUtils.isEmpty(email)){
                    signupEmail.setError("Email is required...");
                    return;
                } if(TextUtils.isEmpty(username)){
                    signupUsername.setError("User Name is required...");
                    return;
                } if(TextUtils.isEmpty(password)){
                    signupPassword.setError("Password is required...");
                    return;
                }
            }
        });
    }
}