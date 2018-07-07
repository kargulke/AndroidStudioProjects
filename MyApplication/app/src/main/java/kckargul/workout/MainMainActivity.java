package kckargul.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

/**
 * Created by shepa on 10/16/2017.
 */

public class MainMainActivity extends AppCompatActivity implements Serializable{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Button btnFigurative = (Button) findViewById(R.id.LinkFigurative);
        Button btnAbstract = (Button) findViewById(R.id.LinkAbstract);
        Button btnReligious = (Button) findViewById(R.id.LinkReligious);
        Button btnArchitechural = (Button) findViewById(R.id.LinkArchitectural);

        btnReligious.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReligiousClicked();
            }
        });
        btnArchitechural.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ArchitecturalClicked();
            }
        });

        btnFigurative.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                figurativeClicked();
            }
        });
        btnAbstract.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                abstractClicked();

            }

        });


    }
    public void figurativeClicked(){
        Intent intent = new Intent(this, FigurativeArtActivity.class);
        startActivity(intent);
    }
    public void abstractClicked(){
        Intent intent = new Intent(this, AbstractArtActivity.class);
        startActivity(intent);
    }
    public void ArchitecturalClicked(){
        Intent intent = new Intent(this, ArchitecturalArtActivity.class);
        startActivity(intent);
    }
    public void ReligiousClicked(){
        Intent intent = new Intent(this, ReligiousArtActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                loadbio();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void loadbio(){
        Intent intent = new Intent(this, BioActivity.class);
        startActivity(intent);
    }
}
