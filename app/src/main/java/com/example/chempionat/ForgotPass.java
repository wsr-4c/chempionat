package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForgotPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgot_pass);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход на страницу авторизации. Денисова(участник 4). 26.03.24. 2 сессия
    public void log(View v){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
    //Переход на страницу верификации. Денисова(участник 4). 26.03.24. 2 сессия
    public void otp(View v){
        Intent intent = new Intent(this, OTP.class);
        startActivity(intent);
    }
}