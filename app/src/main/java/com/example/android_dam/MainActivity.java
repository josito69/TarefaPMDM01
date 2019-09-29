package com.example.android_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tarea1(View view) {
        Intent i = new Intent(this, com.example.android_dam.Tarea01.Tarea01.class);
        startActivity(i);
    }
}
