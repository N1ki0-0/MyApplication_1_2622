package com.example.myapplication_1;

import static com.example.myapplication_1.MainActivity.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, KEY,Toast.LENGTH_SHORT).show();
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(this);
        Button button1 = findViewById(R.id.button3);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button2)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String str = "https://youtube.ru";
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
    }
}