package com.gfb.tictactoe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    Switch switchButton;
   // CompoundButton.OnCheckedChangeListener vibrateListener;

    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPref = getSharedPreferences("soundInfo", Context.MODE_PRIVATE);
        editor = sharedPref.edit();

        switchButton = (Switch) findViewById(R.id.switch1);

        switchButton.setChecked(sharedPref.getBoolean("Sound",switchButton.isChecked())); //setting status of switchButton based on shared preferences
        switchButton.setOnClickListener(this);
       /* switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.xyz", MODE_PRIVATE).edit();
                    editor.putBoolean("Sound", true);
                    editor.commit();
                }
                else
                {
                    SharedPreferences.Editor editor = getSharedPreferences("com.example.xyz", MODE_PRIVATE).edit();
                    editor.putBoolean("Sound", false);
                    editor.commit();
                }
        )};*/




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



//    @Override
//    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//    }



    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.switch1:          // when switch button is clicked.

                if (switchButton.isChecked()) {

                    editor.putBoolean("Sound", switchButton.isChecked());
                    editor.commit();
                } else {
                    switchButton.setChecked(false);
                    editor.putBoolean("Sound", false);
                    editor.commit();
                }
        }
    }



}