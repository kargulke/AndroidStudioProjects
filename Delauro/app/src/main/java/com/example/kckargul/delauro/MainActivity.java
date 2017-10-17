package com.example.kckargul.delauro;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        Button button = (Button) findViewById(R.id.LinkFigurative);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                goSomewhere();
            }
        });
    }
    //@Override
    public void goSomewhere(){
        Intent intent = new Intent(this, ArtworkTypeActivity.class);
        // Bundle bundle = new Bundle();
        // bundle.putSerializable("ARRAY",(Serializable)artwork);
        // intent.putExtra("BUNDLE",bundle);
        startActivity(intent);
    }

    public void itemClicked(View view) {

        //figuring out which fragment they chose and creating a list accordingly
    //    Artwork[] artwork;
       /* switch(view.getId()){
            case R.id.LinkAbstract:
                artwork = Artwork.artworkAbstract;
                break;
            case R.id.LinkArchitecural:
                artwork = Artwork.artworkArchitectural;
                break;
            case R.id.LinkFigurative:
                artwork = Artwork.artworkFigurative;
                break;
            case R.id.LinkReligious:
                artwork = Artwork.artworkReligious;
                break;
            default:artwork = Artwork.artworkAbstract;
        }*/

        Intent intent = new Intent(this, ArtworkTypeActivity.class);
       // Bundle bundle = new Bundle();
       // bundle.putSerializable("ARRAY",(Serializable)artwork);
       // intent.putExtra("BUNDLE",bundle);
        startActivity(intent);
    }
 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the app bar.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider =
                (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Want to join me for pizza?");
        return super.onCreateOptionsMenu(menu);
    }

    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}
