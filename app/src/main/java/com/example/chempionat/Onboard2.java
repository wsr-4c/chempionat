package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Onboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_onboard2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход на страницу холдер после нажатия на кнопку скип(Пропустить). Денисова(участник 4) 26.03.24 1 сессия
    public void skipHolder(View v){
        Intent intent = new Intent (this, Holder.class);
        startActivity(intent);
    }
    //Переход на страницу Onboard3 после нажатия на кнопку некст(следующая). Денисова(участник 4) 26.03.24 1 сессия
    public void next(View v){
        Intent intent = new Intent (this, Onboard3.class);
        startActivity(intent);
    }
}