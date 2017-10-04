package com.sharma.utkarsh.whatsfordinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Button btn1=(Button)findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView im = (ImageView)findViewById(R.id.imageView);
        im.setScaleType(ImageView.ScaleType.FIT_XY);

        ImageButton menu = (ImageButton)findViewById(R.id.menuBtn);


    }

    protected void onMenuClick(View view){

    }



     }


