package com.sharma.utkarsh.whatsfordinner;

import android.media.Image;
import android.net.Uri;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by utkarsh on 10/6/17.
 */

public class Recipe implements Serializable{
    String name= null;
    ArrayList<String> ingredients;
    String directions;
    Uri icon= null;


    public Recipe(String name, ArrayList<String> ingredients, String directions, Uri icon) {
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

    public Recipe() {
        ingredients= new ArrayList<String>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Uri getIcon() {
        return icon;
    }

    public void setIcon(Uri icon) {
        this.icon = icon;
    }
}
