package com.sharma.utkarsh.whatsfordinner;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by utkarsh on 10/6/17.
 */

public class Recipe {
    String name;
    ArrayList<String> ingredients;
    String directions;
    Image icon= null;

    public Recipe(String name, ArrayList<String> ingredients, String directions, Image icon) {
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
        this.icon = icon;
    }

    public Recipe(String name, ArrayList<String> ingredients, String directions) {
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
    }


}
