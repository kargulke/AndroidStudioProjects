package kckargul.workout;

/**
 * Created by kckargul on 10/9/2017.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.widget.ImageView;


public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ARTWORK_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
            Intent intent = getIntent();
            int artworkID = intent.getIntExtra("image", R.drawable.altarscreen);
            ImageView image = (ImageView)findViewById(R.id.Description);
            image.setImageResource(artworkID);

        /*
            ArtworkDetailFragment frag = (ArtworkDetailFragment)
                    getSupportFragmentManager().findFragmentById(R.id.detail_frag);
            int artworkId = (int) getIntent().getExtras().get(EXTRA_ARTWORK_ID);
            frag.setArtwork(artworkId);*/
    }
}