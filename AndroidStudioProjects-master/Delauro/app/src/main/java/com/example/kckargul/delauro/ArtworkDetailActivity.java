package com.example.kckargul.delauro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shepa on 10/15/2017.
 */

public class ArtworkDetailActivity extends AppCompatActivity  {
    public static final String EXTRA_ARTWORK_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artwork_detail);
        ArtworkDetailFragment frag = (ArtworkDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int artworkId = (int) getIntent().getExtras().get(EXTRA_ARTWORK_ID);
        frag.setArtwork(artworkId);
    }
}
