package com.example.kckargul.workout;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.Context;

/**
 * Created by kckargul on 10/9/2017.
 */

public class Artwork {
    private String name;
    private int image;
    Resources res = Resources.getSystem();

    public static final Artwork[] FigurativeArtwork = {
            new Artwork("Dancer 1",
                    R.drawable.dancer1),
            new Artwork("Dancing Girl",
                    R.drawable.dancinggirl),
            new Artwork("Exploration",
                    R.drawable.exploration),
            new Artwork("Girl with Lute",
                    R.drawable.girllute),
            new Artwork("holocaust",
                    R.drawable.holocaust)
    };

    //Each Artwork has a name and description
    private Artwork(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public int getImage() {
        //Resources res = Resources.getSystem();
        //Drawable something = res.getDrawable(image);
        //return something;
        return image;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}