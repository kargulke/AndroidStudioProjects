package com.please.kckargul.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ReligiousArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious_art);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        Button btnAbraham = (Button) findViewById(R.id.abrahamandisaac);
        Button btnPieta = (Button) findViewById(R.id.pieta);
        Button btnResurrection = (Button) findViewById(R.id.resurrection);
        Button btnStandingChrist = (Button) findViewById(R.id.standingchrist);
        btnAbraham.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToImage("Abraham and Isaac", R.drawable.abrahamisaac);
            }
        });
        btnPieta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToImage("Pieta", R.drawable.pieta);
            }
        });
        btnResurrection.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToImage("Resurrection", R.drawable.resurrection);
            }
        });
        btnStandingChrist.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToImage("Standing Christ Figure", R.drawable.standingchrist);
            }
        });
    }
    public void goToImage(String header, int image){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("image", image);
        intent.putExtra("text", header);
        startActivity(intent);
    }


}
