package com.example.smpn11tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void user(View view){
        Intent intent=new Intent(MainActivity.this, UserActivity.class);
        startActivity(intent);

    }

    public void house(View view){
        Intent intent=new Intent(MainActivity.this, HouseActivity.class);
        startActivity(intent);

    }

    public void info(View view){
        Intent intent=new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);

    }

    public void www(View view){
        Intent intent=new Intent(MainActivity.this, WwwActivity.class);
        startActivity(intent);

    }

    public void settings(View view){
        Intent intent=new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);

    }

    public void picture(View view){
        Intent intent=new Intent(MainActivity.this, PictureActivity.class);
        startActivity(intent);

    }
}