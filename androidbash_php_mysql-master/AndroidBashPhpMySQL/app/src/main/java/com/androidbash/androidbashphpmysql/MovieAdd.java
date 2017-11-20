package com.androidbash.androidbashphpmysql;

import android.os.Bundle;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class MovieAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button sendButton = (Button) findViewById(R.id.send);
        sendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addMovie();
            }
        });
    }

    public void addMovie(){
        String response = "";
        BufferedReader reader = null;
        HttpURLConnection conn = null;
        try {
            URL reqURL = new URL("http://csis.svsu.edu/~kckargul/test/user_post.php"); //the URL we will send the request to
            HttpURLConnection request = (HttpURLConnection) (reqURL.openConnection());
            String post = "this will be the post data that you will send";
            request.setDoOutput(true);
            request.addRequestProperty("Content-Length", Integer.toString(post.length())); //add the content length of the post data
            request.addRequestProperty("Content-Type", "application/x-www-form-urlencoded"); //add the content type of the request, most post data is of this type
            request.setRequestMethod("POST");
            request.connect();
            OutputStreamWriter writer = new OutputStreamWriter(request.getOutputStream()); //we will write our request data here
            writer.write(post);
            writer.flush();
        } catch(Exception e){
            Toast toast = Toast.makeText(this, "help", 5);
            toast.show();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
