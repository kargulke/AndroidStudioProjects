package com.example.kckargul.biogeneration;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.test.suitebuilder.TestMethod;
        import android.widget.EditText;
        import android.widget.TextView;

/**
 * Created by something on 9/30/2017.
 */

public class BioGenerationActivity   extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio_activity);

        Intent callingIntent = getIntent();


        String year = callingIntent.getStringExtra("Year");
        String school = callingIntent.getStringExtra("School");
        String degree = callingIntent.getStringExtra("Degree");
        String firstName = callingIntent.getStringExtra("First Name");
        String lastName = callingIntent.getStringExtra("Last Name");
        String hobbies = callingIntent.getStringExtra("Hobbies");
        String bachelor = callingIntent.getStringExtra("Bachelor");

        TextView editText1 = (TextView) findViewById(R.id.bio);

        String bio = "";
        if(year.equals("grad yr")||firstName.equals("")||school.equals("")||degree.equals("")||lastName.equals("")||hobbies.equals("")){
            bio = "you forgot to put in some values bro";
        }
        else {

//Susan Anthony holds a BA in History from Collingsworth University. Her interests include writing and golf.
            bio = firstName + " " + lastName + " holds a " +
                    bachelor + " in " +
                    degree + " from " +
                    school + " in " +
                    year + ". Their interests include " +
                    hobbies + ".";
        }
        editText1.setText(bio);

    }
}
