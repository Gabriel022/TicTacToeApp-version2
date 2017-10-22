package com.gfb.tictactoe;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import static android.R.attr.button;
import static com.gfb.tictactoe.R.id.button1;

public class GameActivity extends AppCompatActivity implements View.OnClickListener  {

    //declare array
    Button buttons[][] = new Button[3][3];
    private boolean xMove;

    TextView label;

    //Declare some variables for the sound effect
    private SoundPool soundPool;
    int sample1 = -1;

    int soundHolder;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        label = (TextView) findViewById(R.id.moveTextView);






        SharedPreferences preferences = getSharedPreferences("soundInfo", MODE_PRIVATE);
        boolean soundIsOn = preferences.getBoolean("Sound",true);

        if(soundIsOn)
        {
            soundHolder = 1;
        }
        else
        {
            soundHolder = 0;
        }



        //button1 = (Button) findViewById(R.id.button1);
        buttons[0][0] = (Button) findViewById(R.id.button1);
        buttons[0][1] = (Button) findViewById(R.id.button2);
        buttons[0][2] = (Button) findViewById(R.id.button3);
        buttons[1][0] = (Button) findViewById(R.id.button4);
        buttons[1][1] = (Button) findViewById(R.id.button5);
        buttons[1][2] = (Button) findViewById(R.id.button6);
        buttons[2][0] = (Button) findViewById(R.id.button7);
        buttons[2][1] = (Button) findViewById(R.id.button8);
        buttons[2][2] = (Button) findViewById(R.id.button9);







        //this code in the onCreate method to load the sound into memory
        //
         soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC,0);
        try {
            AssetManager assetManager = getAssets();
            AssetFileDescriptor descriptor;
            descriptor = assetManager.openFd("sound1.ogg");
            sample1 = soundPool.load(descriptor, 0);
        } catch (IOException e) {
            //catch excpetion here
        }



        xMove = true;

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    //declaring methods of the game


    public void buttonAction(View v) {

        int x = 0;
        int y = 0;
        boolean empty = false;
        String compare ="  " ; //string use to compare with getText from button, to see if cell is empty or not.



        switch (v.getId()) {
            case R.id.button1:
                if(compare.equals(buttons[0][0].getText())) {
                    if (xMove == true) {
                        buttons[0][0].setText("X");
                        xMove = false;
                        label.setText("O move");



                    } else {
                        buttons[0][0].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }

                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
            case R.id.button2:
                if(compare.equals(buttons[0][1].getText())) {
                    if (xMove == true) {
                        buttons[0][1].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[0][1].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
            case R.id.button3:
                if(compare.equals(buttons[0][2].getText())) {
                    if (xMove == true) {
                        buttons[0][2].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[0][2].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
            case R.id.button4:
                if(compare.equals(buttons[1][0].getText())) {
                    if (xMove == true) {
                        buttons[1][0].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[1][0].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                 else
            {
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                dlgAlert.setMessage("This cell is not empty!");
                dlgAlert.setTitle("Error");
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return;

            }
                break;
            case R.id.button5:
                if(compare.equals(buttons[1][1].getText())) {
                    if (xMove == true) {
                        buttons[1][1].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[1][1].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }

                break;
            case R.id.button6:
                if(compare.equals(buttons[1][2].getText())) {
                    if (xMove == true) {
                        buttons[1][2].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[1][2].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                 else
            {
                AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                dlgAlert.setMessage("This cell is not empty!");
                dlgAlert.setTitle("Error");
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();
                return;

            }
                break;
            case R.id.button7:
                if(compare.equals(buttons[2][0].getText())) {
                    if (xMove == true) {
                        buttons[2][0].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[2][0].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
            case R.id.button8:
                if(compare.equals(buttons[2][1].getText())) {
                    if (xMove == true) {
                        buttons[2][1].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[2][1].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
            case R.id.button9:
                if(compare.equals(buttons[2][2].getText())) {
                    if (xMove == true) {
                        buttons[2][2].setText("X");
                        xMove = false;
                        label.setText("O move");
                    } else {
                        buttons[2][2].setText("O");
                        xMove = true;
                        label.setText("X move");
                    }
                }
                else
                {
                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("This cell is not empty!");
                    dlgAlert.setTitle("Error");
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    return;

                }
                break;
        }
        checkResult();



    }

    @Override
    public void onClick(View view) {

    }


     public void checkResult()
    {
        String xValue = "X";
        String oValue = "O";

        boolean empty = false;
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        //check horizontal lines
        for (int i = 0; i != 3; ++i)
        {
            if (xValue.equals(buttons[i][0].getText())  && xValue.equals(buttons[i][1].getText())  && xValue.equals(buttons[i][2].getText()))
            {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("congratulations");
                if(soundHolder == 1) {
                    soundPool.play(sample1, 1, 1, 0, 0, 1);
                }
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (oValue.equals(buttons[i][0].getText()) && oValue.equals(buttons[i][1].getText()) && oValue.equals(buttons[i][2].getText()))
            {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("congratulations");
                if(soundHolder == 1) {
                    soundPool.play(sample1, 1, 1, 0, 0, 1);
                }
                soundPool.play(sample1,1,1,0,0,1);
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }

        //check vertical lines
        for (int i = 0; i != 3; ++i)
        {
            if (xValue.equals(buttons[0][i].getText()) && xValue.equals(buttons[1][i].getText()) && xValue.equals(buttons[2][i].getText()))
            {
                dlgAlert.setMessage("X Player wins!");
                dlgAlert.setTitle("congratulations");
                if(soundHolder == 1) {
                    soundPool.play(sample1, 1, 1, 0, 0, 1);
                }
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
            if (oValue.equals(buttons[0][i].getText()) && oValue.equals(buttons[1][i].getText()) && oValue.equals(buttons[2][i].getText()))
            {
                dlgAlert.setMessage("O Player wins!");
                dlgAlert.setTitle("congratulations");
                if(soundHolder == 1) {
                    soundPool.play(sample1, 1, 1, 0, 0, 1);
                }
                dlgAlert.setCancelable(true);
                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
                dlgAlert.create().show();

            }
        }

        //check diagonals
        if (oValue.equals(buttons[0][0].getText()) && oValue.equals(buttons[1][1].getText()) && oValue.equals(buttons[2][2].getText()))
        {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("congratulations");
            if(soundHolder == 1) {
                soundPool.play(sample1, 1, 1, 0, 0, 1);
            }
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (xValue.equals(buttons[0][0].getText()) && xValue.equals(buttons[1][1].getText()) && xValue.equals(buttons[2][2].getText()))
        {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            if(soundHolder == 1) {
                soundPool.play(sample1, 1, 1, 0, 0, 1);
            }
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (oValue.equals(buttons[0][2].getText()) && oValue.equals(buttons[1][1].getText()) && oValue.equals(buttons[2][0].getText()))
        {
            dlgAlert.setMessage("O Player wins!");
            dlgAlert.setTitle("congratulations");
            if(soundHolder == 1) {
                soundPool.play(sample1, 1, 1, 0, 0, 1);
            }
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
        if (xValue.equals(buttons[0][2].getText()) && xValue.equals(buttons[1][1].getText()) && xValue.equals(buttons[2][0].getText()))
        {
            dlgAlert.setMessage("X Player wins!");
            dlgAlert.setTitle("congratulations");
            if(soundHolder == 1) {
                soundPool.play(sample1, 1, 1, 0, 0, 1);
            }
            dlgAlert.setCancelable(true);
            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            dlgAlert.create().show();

        }
    }


}




