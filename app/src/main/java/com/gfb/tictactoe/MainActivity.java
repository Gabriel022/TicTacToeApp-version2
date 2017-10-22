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
import android.widget.TextView;

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
           // case R.id.settingsButton:
            //    Intent z;
             //   z = new Intent(this,SettingsActivity.class);
            //    startActivity(z);
            //    break;



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
        //When the user selects an item from the options menu (including action items in the app bar),
        // the system calls your activity's onOptionsItemSelected() method.
        // This method passes the MenuItem selected. You can identify the item by calling getItemId(),
        // which returns the unique ID for the menu item (defined by the android:id attribute in the menu
        // resource or with an integer given to the add() method)
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
