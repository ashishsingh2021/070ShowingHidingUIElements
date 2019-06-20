package com.example.a070showinghidinguielements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void visible(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setVisibility(View.VISIBLE);
    }
    public void invisible(View view)
    {
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setVisibility(View.INVISIBLE);
    }




}
