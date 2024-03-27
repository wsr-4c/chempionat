package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SendApackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_send_apackage);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход назад. Денисова(участник 4). 27.06.24. 3 сессия
    public void back(View v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    //Переход на страницу оформления заказа. Денисова(участник 4). 27.06.24. 3 сессия
    public void receipt(View v){
        Intent intent = new Intent(this, Reciept.class);
        startActivity(intent);
    }
}