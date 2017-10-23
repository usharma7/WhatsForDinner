package com.sharma.utkarsh.whatsfordinner;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    final ImageButton btn1=(ImageButton)findViewById(R.id.addBtn);
        ArrayList<String> RecipeItems=new ArrayList();
        ArrayList<String> ingredients= new ArrayList<>();





    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = (ImageView) findViewById(R.id.imageView);
        im.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageButton menu = (ImageButton) findViewById(R.id.menuBtn);
        ImageButton add= (ImageButton)findViewById(R.id.addBtn);

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), NewDish.class));

            }


        });

        ImageButton recipe = (ImageButton) findViewById(R.id.RecipieBtn);
        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), RecipieScreen.class));
            }
        });




    }




}


