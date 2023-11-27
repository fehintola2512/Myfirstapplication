package com.fehintola.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.accessibility.AccessibilityEvent
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        val loginBtn: Button = findViewById(R.id.loginButton)
        val usernameEdt: EditText = findViewById(R.id.editText)
        val passwordEdt: EditText = findViewById(R.id.editText2)
        loginBtn.setOnClickListener{
            val userUsernameEntered: String =usernameEdt .text.toString()
            val userPasswordEntered: String = passwordEdt.text.toString()
            var message = "";
            if(userUsernameEntered.isEmpty() && userPasswordEntered.isEmpty()){
                message = "You need to input a username and password";
            }else{
                if(userUsernameEntered.isEmpty()){
                    message = "You need to input a username"
                }else{
                    if(userPasswordEntered.isEmpty()){
                        message = "You need to input a password"
                    }else{
                        val i = Intent(this, HomePage:: class.java)
                        startActivity(i)
                    }
                }

            }
            Snackbar.make(findViewById(R.id.loginAcct), message, Snackbar.LENGTH_LONG).show()
        }

    }
}