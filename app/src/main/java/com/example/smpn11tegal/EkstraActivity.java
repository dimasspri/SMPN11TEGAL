package com.example.smpn11tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkstraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstra);
    }

    public void lainya (View view) {
        Intent intent = new Intent(EkstraActivity.this,LainyaActivity.class);
        startActivity(intent);
    }

}