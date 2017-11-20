package com.example.kckargul.delauro;

import android.graphics.drawable.Drawable;

/**
 * Created by shepa on 10/15/2017.
 */

public class Artwork {
    private String name;
    private Drawable imageResourceID;

    public static final Artwork[] artworkReligious = {
            new Artwork("Standing Christ Figure",
                    R.drawable.standingchristfigure),
            new Artwork("resurrection",
                    R.drawable.resurrection),
            new Artwork("pieta",
                    R.drawable.pieta)
    };
    public static final Artwork[] artworkArchitectural = {
            new Artwork("Altar Screen",
                    R.drawable.altarscreen)
    };
    public static final Artwork[] artworkAbstract = {
            new Artwork("Creation II",
                    R.drawable.creation2),
            new Artwork("Transformation",
                    R.drawable.creation3)
    };
    public static final Artwork[] artworkFigurative = {
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

    //Each Workout has a name and description
    private Artwork(String name, Drawable imageResourceID) {
        this.name = name;
        this.imageResourceID = imageResourceID;
    }

    public Drawable getImageResourceID() {
        return imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }

}
