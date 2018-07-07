package com.please.kckargul.workout;

import android.content.res.Resources;

import java.io.Serializable;

/**
 * Created by kckargul on 10/9/2017.
 */

public class Artwork implements Serializable{
    private String name;
    private int image;
    Resources res = Resources.getSystem();

    public static final Artwork[] FigurativeArtwork ={
            new Artwork("dancer1", R.drawable.dancer1),
            new Artwork("Dancing Girl", R.drawable.dancinggirl),
            new Artwork("Exploration", R.drawable.exploration),
            new Artwork("Girl with Lute", R.drawable.girllute),
            new Artwork("holocaust", R.drawable.holocaust)
    };
    public static final Artwork[] AbstractArtwork = {
            new Artwork("abstract1", R.drawable.abstract1),
            new Artwork("abstract2", R.drawable.abstract2),
            new Artwork("transformation", R.drawable.transformation)
    };
    public static final Artwork[] ArchitecturalArtwork = {
            new Artwork( "Altar Screen", R.drawable.altarscreen),
            new Artwork("Ascending Column", R.drawable.ascendingcolumn)
    };
    public static final Artwork[] ReligiousArtwork={
            new Artwork("Abraham And Isaac", R.drawable.abrahamisaac),
            new Artwork("Pieta", R.drawable.pieta),
            new Artwork("Resurection", R.drawable.resurrection),
            new Artwork("Standing Christ Figure", R.drawable.standingchrist)
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