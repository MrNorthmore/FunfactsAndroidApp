package com.example.matt.funfacts;


import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    //Fields
    private final String[] colors = new String[]{
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //Methods

    int getColor(){

        //update text view when button is clicked
        //randomly select fact
        Random random = new Random();
        int randomNum = random.nextInt(colors.length);
        return Color.parseColor(colors[randomNum]);
    }


}
