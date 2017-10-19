package com.gfb.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button playButton;
    Button settingsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(this);
    //    settingsButton = (Button) findViewById(R.id.settingsButton);
      //  settingsButton.setOnClickListener(this);




       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
     //   fab.setOnClickListener(new View.OnClickListener() {
      //      @Override
       //     public void onClick(View view) {
      //          Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
      //                  .setAction("Action", null).show();
       //     }
      //  });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.playButton:
                //DO something
                Intent y;
                y = new Intent(this, GameActivity.class);
                startActivity(y);
                break;
            case R.id.settingsButton:
                Intent z;
                z = new Intent(this,SettingsActivity.class);
                startActivity(z);
                break;



    }
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      //  int id = item.getItemId();
        Intent preferencesIntent = new Intent(this, SettingsActivity.class);
        startActivity(preferencesIntent);
        return super.onOptionsItemSelected(item);
        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
         //   return true;
       // }

    }
}
