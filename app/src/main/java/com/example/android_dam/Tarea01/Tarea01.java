package com.example.android_dam.Tarea01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.android_dam.R;

public class Tarea01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea01);
    }
    public void salir(View vista){
        finish();
    }
}
