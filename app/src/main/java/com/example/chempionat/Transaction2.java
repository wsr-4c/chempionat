package com.example.chempionat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Transaction2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transaction2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Переход назад. Денисова(участник 4). 27.06.24. 3 сессия
    public void track(View v){
        Intent intent = new Intent(this, Tracking.class);
        startActivity(intent);
    }
    //Переход назад. Денисова(участник 4). 27.06.24. 3 сессия
    public void back(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}