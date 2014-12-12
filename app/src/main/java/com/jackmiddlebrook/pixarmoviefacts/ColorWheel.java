package com.jackmiddlebrook.pixarmoviefacts;

import android.graphics.Color;

/**
 * Gets a new background color for each fact.
 * Created by jackmiddlebrook on 10/5/14.
 */
public class ColorWheel {

    private int mIndex = 0;

    private String[] mColors = {
            "#3F51B5",
            "#2196F3",
            "#0288D1",
            "#0097A7",
            "#009688",
            "#4CAF50",
            "#689F38",
            "#F57F17",
            "#E65100",
            "#795548",
            "#757575",
            "#607D8B",
            "#C62828",
            "#7B1FA2"
    };

    public int getColor() {


        mIndex++;

        String color;

        color = mColors[mIndex % mColors.length];

        return Color.parseColor(color);

    }

}
