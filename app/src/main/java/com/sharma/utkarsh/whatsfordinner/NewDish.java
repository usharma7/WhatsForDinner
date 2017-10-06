package com.sharma.utkarsh.whatsfordinner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class NewDish extends AppCompatActivity {

    ArrayList<String> MenuItems= new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dish);
        EditText name= (EditText)findViewById(R.id.RecipieNameEdit);


    }

    //TODO
    //for the requirement for the name edit text to check if the recipie already exists



}
