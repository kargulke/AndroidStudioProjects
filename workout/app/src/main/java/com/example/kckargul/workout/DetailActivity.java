package com.example.kckargul.workout;

/**
 * Created by kckargul on 10/9/2017.
 */


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;


public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ARTWORK_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            ArtworkDetailFragment frag = (ArtworkDetailFragment)
                    getSupportFragmentManager().findFragmentById(R.id.detail_frag);
            int artworkId = (int) getIntent().getExtras().get(EXTRA_ARTWORK_ID);
            frag.setArtwork(artworkId);
    }
}