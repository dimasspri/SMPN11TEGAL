package com.example.smpn11tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);

    }

    public void absen(View view){
        Intent intent=new Intent(MainActivity.this, AbsenActivity.class);
        startActivity(intent);

    }

    public void info(View view){
        Intent intent=new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);

    }

    public void ekstra (View view){
        Intent intent=new Intent(MainActivity.this, EkstraActivity.class);
        startActivity(intent);

    }

    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);

    }

    public void tugas(View view){
        Intent intent=new Intent(MainActivity.this, TugasActivity.class);
        startActivity(intent);

    }
}