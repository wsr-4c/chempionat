package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход на страницу для добавления платежа. Денисова(участник 4). 27.03.24. 3 сессия
    public void add(View v){
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
    //Переход на страницу авторизации. Денисова(участник 4). 27.06.24. 3 сессия
    public void login(View v){
        Intent intent = new Intent(this, LogIn.class);
        startActivity(intent);
    }
    //Переход на страницу уведомлений. Денисова(участник 4). 27.06.24. 3 сессия
    public void notif(View v){
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
    //Переход на страницу добавления палтежной карты. Денисова(участник 4). 27.06.24. 3 сессия
    public void statement(View v){
        Intent intent = new Intent(this, SendApackage.class);
        startActivity(intent);
    }
}