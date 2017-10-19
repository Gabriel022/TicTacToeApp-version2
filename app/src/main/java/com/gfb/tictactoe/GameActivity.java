package com.gfb.tictactoe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    //declare array

    //declare methods of the game


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
       //         Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
       //                 .setAction("Action", null).show();
      //      }
    //    });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {

    }


}
