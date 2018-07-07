package com.example.something.biogeneration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class BioGenerationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_generation);
    }
    public void createBio(View view){
        EditText txtSchool = (EditText) findViewById(R.id.school);
        EditText txtDegree = (EditText) findViewById(R.id.degree);
        EditText txtFirstName = (EditText) findViewById(R.id.firstName);
        EditText txtLastName = (EditText) findViewById(R.id.lastName);
        EditText txtHobbies = (EditText) findViewById(R.id.hobbies);
        Spinner spnYear = (Spinner) findViewById(R.id.year);
        RadioButton BA = (RadioButton) findViewById(R.id.BA);
        RadioButton BS = (RadioButton) findViewById(R.id.BS);

        String sYear = String.valueOf(spnYear.getSelectedItem());
        String sSchool = txtSchool.getText().toString();
        String sDegree = txtDegree.getText().toString();
        String sFirstName = txtFirstName.getText().toString();
        String sLastName = txtLastName.getText().toString();
        String sHobbies = txtHobbies.getText().toString();
        String sBachelor = "";
        if(BA.isChecked()) {
             sBachelor = "BA";
        }
        else if(BS.isChecked()){
             sBachelor = "BS";
        }
        else{
             sBachelor = "Some weird Bachelor";
        }


        Intent intent = new Intent(this, BioActivity.class);
        intent.putExtra("Year", sYear);
        intent.putExtra("School", sSchool);
        intent.putExtra("Degree", sDegree);
        intent.putExtra("First Name", sFirstName);
        intent.putExtra("Last Name", sLastName);
        intent.putExtra("Hobbies", sHobbies);
        intent.putExtra("Bachelor", sBachelor);

        startActivity(intent);
    }

}
