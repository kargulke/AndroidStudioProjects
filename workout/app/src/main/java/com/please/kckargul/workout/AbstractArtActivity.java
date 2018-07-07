package com.please.kckargul.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AbstractArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_art);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        Button btnCreation1 = (Button) findViewById(R.id.creation1);
        Button btnCreation2 = (Button) findViewById(R.id.creation2);
        Button btnCTransformation = (Button) findViewById(R.id.transformation);
        btnCreation1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Creation I", R.drawable.abstract1);
            }
        });
        btnCreation2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Creation II", R.drawable.abstract2);
            }
        });
        btnCTransformation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Transformation", R.drawable.transformation);
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
