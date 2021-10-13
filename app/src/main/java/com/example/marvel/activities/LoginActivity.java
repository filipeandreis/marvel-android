package com.example.marvel.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.marvel.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;


public class LoginActivity extends AppCompatActivity {
    EditText eName ;
    EditText ePassword;
    Button eLogin;

    String userName = "";
    String userPassword = "";

    String credName = "admin";
    String credPassword = "admin";

    CallbackManager callbackManager = CallbackManager.Factory.create();
    private static final String EMAIL = "email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();
                if(userName.isEmpty() || userPassword.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Digite o usuário e senha!", Toast.LENGTH_LONG).show();

                }
                else {

                    if (!validate(userName, userPassword)) {
                        Toast.makeText(LoginActivity.this, "Credenciais incorretas!", Toast.LENGTH_LONG).show();
                    } else {

                      moveToHome();
                    }

                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void moveToHome () {
        SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS", MODE_PRIVATE).edit();
        editor.putBoolean("isLogin", true);
        editor.apply();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
    private boolean validate(String userName, String userPassword)
    {
        if(userName.equals(credName) && userPassword.equals(credPassword))
        {
            return true;
        }

        return false;
    }
}