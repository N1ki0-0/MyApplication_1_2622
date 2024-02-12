package com.example.myapplication_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String KEY = "Новая активность";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(KEY, "Message");
        startActivity(intent);
    }
}
