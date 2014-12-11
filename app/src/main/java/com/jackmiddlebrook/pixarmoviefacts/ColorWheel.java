package com.jackmiddlebrook.pixarmoviefacts;

import android.graphics.Color;

/**
 * Gets a new background color for each fact.
 * Created by jackmiddlebrook on 10/5/14.
 */
public class ColorWheel {

    private int mIndex = 0;

    private String[] mColors = {
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

    public int getColor() {


        mIndex++;

        String color;

        color = mColors[mIndex % mColors.length];

        return Color.parseColor(color);

    }

}
