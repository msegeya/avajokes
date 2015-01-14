package com.wordpress.webdevrn.kidsjokes;
import android.graphics.Color;

import java.util.Random;
/**
 * Created by christopherStephens on 1/9/15.
 */
public class ColorWheel {
    // this is a propertie so gets a m for member
    public String mColors[] = {
            "#39add1", // light blue
            "#7eff69b4", //hot pink
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#7eff69b4", //hot pink
            "#7eff69b4", //hot pink
            "#e0ab18", // mustard
            "#f092b0", // pink
    };
    // this is a method
    public int getColor() {
        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length) ;
        color = mColors[randomNumber];
int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    };
};