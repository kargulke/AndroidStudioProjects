package com.example.kckargul.delauro;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by shepa on 10/12/2017.
 */

public class ArtworkTypeActivity  extends AppCompatActivity implements ArtworkListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artwork_type);
    }
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
      //  Intent intent = new Intent(this, ArtworkDetailActivity.class);
      //  Bundle args = intent.getBundleExtra("BUNDLE");
      //  Artwork[] listing = (Artwork[]) args.getSerializable("ARRAY");

        if (fragmentContainer != null) {
            ArtworkDetailFragment details = new ArtworkDetailFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setArtwork(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, ArtworkDetailActivity.class);
            intent.putExtra(ArtworkDetailActivity.EXTRA_ARTWORK_ID, (int)id);
            startActivity(intent);
        }
    }
}


