package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход на страницу регистрации. Денисова(участник 4). 26.03.24. 2 сессия
   public void up(View v){
        Intent intent = new Intent(this, Holder.class);
        startActivity(intent);
    }
    //Переход на страницу повторения пароля. Денисова(участник 4). 26.03.24. 2 сессия
    public void forgot(View v){
        Intent intent = new Intent(this, ForgotPass.class);
        startActivity(intent);
    }
    //Переход на главную страницу. Денисова(участник 4). 26.03.24. 2 сессия
    public void home(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}