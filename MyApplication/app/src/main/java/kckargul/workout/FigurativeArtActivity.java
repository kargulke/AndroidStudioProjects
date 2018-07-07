package kckargul.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FigurativeArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figurative_art);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        Button btnDancer = (Button) findViewById(R.id.dancer1);
        Button btnDancingGirl = (Button) findViewById(R.id.dancingGirl);
        Button btnExploration = (Button) findViewById(R.id.exploration);
        Button btnGirlWithLute = (Button) findViewById(R.id.girlWithLute);
        Button btnHolocaust = (Button) findViewById(R.id.holocaust);
        btnDancer.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Dancer 1", R.drawable.dancer1);
            }
        });
        btnDancingGirl.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Dancing Girl", R.drawable.dancinggirl);
            }
        });
        btnExploration.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Exploration", R.drawable.exploration);
            }
        });
        btnGirlWithLute.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Girl with Lute", R.drawable.girllute);
            }
        });
        btnHolocaust.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToImage("Holocaust", R.drawable.holocaust);
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
