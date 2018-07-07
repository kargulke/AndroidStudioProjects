package com.please.kckargul.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ArchitecturalArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architectural_art);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

   /*     FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
     */   Button btnAltarScreen = (Button) findViewById(R.id.altarScreen);
        Button btnAscendingColumn = (Button) findViewById(R.id.ascendingColumn);
        btnAltarScreen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Altar Screen", R.drawable.altarscreen);
            }
        });
        btnAscendingColumn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Ascending Column", R.drawable.ascendingcolumn);
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
