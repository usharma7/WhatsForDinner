package com.sharma.utkarsh.whatsfordinner;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class NewDish extends AppCompatActivity {

     Recipe current= new Recipe();
     final int PICK_RECIPE_PHOTO= 1;
     ArrayList<String> ingredients;
    EditText name;
    ImageButton addImage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //inflate veiws
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dish);
         name = (EditText) findViewById(R.id.RecipieNameEdit);
        addImage = (ImageButton) findViewById(R.id.addImage);

        //on click to add
        addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pickPhoto = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(pickPhoto, PICK_RECIPE_PHOTO);
            }
        });

        Spinner ing1 = (Spinner) findViewById(R.id.spinner1);
        if ((ingredients) != null) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, ingredients);


        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Check which request we're responding to
        if (requestCode == PICK_RECIPE_PHOTO) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                Uri uri = data.getData();
                ImageView pic= (ImageView)findViewById(R.id.recipeView);
                pic.setImageURI(uri);
                current.setIcon(uri);

            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);



    }

    public void onFocusChange(View v, boolean hasFocus) {
        if ((v.getId()) == R.id.RecipieNameEdit && !hasFocus){
          String e= ((EditText)v).getText().toString();
            current.setName(e);
            ((EditText)v).setText("Focus lost");

        }

    }



    //TODO
    //for the requirement for the name edit text to check if the recipie already exists



}
