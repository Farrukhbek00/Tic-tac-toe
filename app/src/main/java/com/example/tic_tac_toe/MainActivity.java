package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean state = true;
    boolean un00 = true;
    boolean un01 = true;
    boolean un02 = true;
    boolean un10 = true;
    boolean un11 = true;
    boolean un12 = true;
    boolean un20 = true;
    boolean un21 = true;
    boolean un22 = true;

    int count00 = 0;
    int count01 = 0;
    int count02 = 0;
    int count10 = 0;
    int count11 = 0;
    int count12 = 0;
    int count20 = 0;
    int count21 = 0;
    int count22 = 0;


    public void unvisible00(View view) {

        ImageView red00 = (ImageView) findViewById(R.id.red00);
        ImageView yellow00 = (ImageView) findViewById(R.id.yellow00);

        if (un00) {

            if (state) {
                red00.animate().translationYBy(3000).setDuration(2000);
                count00 = 1;
                state = false;
            } else {
                yellow00.animate().translationYBy(3000).setDuration(2000);
                count00 = 2;
                state = true;
            }
        }
        un00 = false;

    }

    public void unvisible01(View view) {

        ImageView red01 = (ImageView) findViewById(R.id.red01);
        ImageView yellow01 = (ImageView) findViewById(R.id.yellow01);

        if (un01) {

            if (state) {
                red01.animate().translationYBy(3000).setDuration(2000);
                count01 = 1;
                state = false;
            } else {
                yellow01.animate().translationYBy(3000).setDuration(2000);
                count01 = 2;
                state = true;
            }
        }

        un01 = false;

    }

    public void unvisible02(View view) {

        ImageView red02 = (ImageView) findViewById(R.id.red02);
        ImageView yellow02 = (ImageView) findViewById(R.id.yellow02);

        if (un02) {

            if (state) {
                red02.animate().translationYBy(3000).setDuration(2000);
                count02 = 1;
                state = false;
            } else {
                yellow02.animate().translationYBy(3000).setDuration(2000);
                count02 = 2;
                state = true;
            }
        }

        un02 = false;

    }

    public void unvisible10(View view) {

        ImageView red10 = (ImageView) findViewById(R.id.red10);
        ImageView yellow10 = (ImageView) findViewById(R.id.yellow10);

        if (un10) {

            if (state) {
                red10.animate().translationYBy(3000).setDuration(2000);
                count10 = 1;
                state = false;
            } else {
                yellow10.animate().translationYBy(3000).setDuration(2000);
                count10 = 2;
                state = true;
            }
        }

        un10 = false;

    }

    public void unvisible11(View view) {

        ImageView red11 = (ImageView) findViewById(R.id.red11);
        ImageView yellow11 = (ImageView) findViewById(R.id.yellow11);

        if (un11) {

            if (state) {
                red11.animate().translationYBy(3000).setDuration(2000);
                count11 = 1;
                state = false;
            } else {
                yellow11.animate().translationYBy(3000).setDuration(2000);
                count11 = 2;
                state = true;
            }
        }

        un11 = false;

    }

    public void unvisible12(View view) {

        ImageView red12 = (ImageView) findViewById(R.id.red12);
        ImageView yellow12 = (ImageView) findViewById(R.id.yellow12);

        if (un12) {

            if (state) {
                red12.animate().translationYBy(3000).setDuration(2000);
                count12 = 1;
                state = false;
            } else {
                yellow12.animate().translationYBy(3000).setDuration(2000);
                count12 = 2;
                state = true;
            }
        }

        un12 = false;

    }

    public void unvisible20(View view) {

        ImageView red20 = (ImageView) findViewById(R.id.red20);
        ImageView yellow20 = (ImageView) findViewById(R.id.yellow20);

        if (un20) {

            if (state) {
                red20.animate().translationYBy(3000).setDuration(2000);
                count20 = 0;
                state = false;
            } else {
                yellow20.animate().translationYBy(3000).setDuration(2000);
                count20 = 2;
                state = true;
            }
        }
        un20 = false;

    }

    public void unvisible21(View view) {

        ImageView red21 = (ImageView) findViewById(R.id.red21);
        ImageView yellow21 = (ImageView) findViewById(R.id.yellow21);

        if (un21) {

            if (state) {
                red21.animate().translationYBy(3000).setDuration(2000);
                count21 = 1;
                state = false;
            } else {
                yellow21.animate().translationYBy(3000).setDuration(2000);
                count21 = 2;
                state = true;
            }
        }

        un21 = false;

    }

    public void unvisible22(View view) {

        ImageView red22 = (ImageView) findViewById(R.id.red22);
        ImageView yellow22 = (ImageView) findViewById(R.id.yellow22);

        if (un22) {

            if (state) {
                red22.animate().translationYBy(3000).setDuration(2000);
                count22 = 1;
                state = false;
            } else {
                yellow22.animate().translationYBy(3000).setDuration(2000);
                count22 = 2;
                state = true;
            }
        }
        un22 = false;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView red00 = (ImageView) findViewById(R.id.red00);
        ImageView red01 = (ImageView) findViewById(R.id.red01);
        ImageView red02 = (ImageView) findViewById(R.id.red02);
        ImageView red10 = (ImageView) findViewById(R.id.red10);
        ImageView red11 = (ImageView) findViewById(R.id.red11);
        ImageView red12 = (ImageView) findViewById(R.id.red12);
        ImageView red20 = (ImageView) findViewById(R.id.red20);
        ImageView red21 = (ImageView) findViewById(R.id.red21);
        ImageView red22 = (ImageView) findViewById(R.id.red22);

        ImageView yellow00 = (ImageView) findViewById(R.id.yellow00);
        ImageView yellow01 = (ImageView) findViewById(R.id.yellow01);
        ImageView yellow02 = (ImageView) findViewById(R.id.yellow02);
        ImageView yellow10 = (ImageView) findViewById(R.id.yellow10);
        ImageView yellow11 = (ImageView) findViewById(R.id.yellow11);
        ImageView yellow12 = (ImageView) findViewById(R.id.yellow12);
        ImageView yellow20 = (ImageView) findViewById(R.id.yellow20);
        ImageView yellow21 = (ImageView) findViewById(R.id.yellow21);
        ImageView yellow22 = (ImageView) findViewById(R.id.yellow22);

        red00.setTranslationY(-3000);
        red01.setTranslationY(-3000);
        red02.setTranslationY(-3000);
        red10.setTranslationY(-3000);
        red11.setTranslationY(-3000);
        red12.setTranslationY(-3000);
        red20.setTranslationY(-3000);
        red21.setTranslationY(-3000);
        red22.setTranslationY(-3000);

        yellow00.setTranslationY(-3000);
        yellow01.setTranslationY(-3000);
        yellow02.setTranslationY(-3000);
        yellow10.setTranslationY(-3000);
        yellow11.setTranslationY(-3000);
        yellow12.setTranslationY(-3000);
        yellow20.setTranslationY(-3000);
        yellow21.setTranslationY(-3000);
        yellow22.setTranslationY(-3000);

        if (((count00 == 1) && (count11 == 1) && (count22 == 1)) || ((count02 == 1) && (count11 == 1) && (count20 == 1)) || ((count00 == 1) && (count01 == 1) && (count02 == 1))
                || ((count10 == 1) && (count11 == 1) && (count12 == 1)) || ((count20 == 1) && (count21 == 1) && (count22 == 1))
                || ((count00 == 1) && (count10 == 1) && (count20 == 1)) || ((count01 == 1) && (count11 == 1) && (count21 == 1)) || ((count02 == 1) && (count12 == 1) && (count22 == 1))) {
            Toast.makeText(this, "Red is winner!", Toast.LENGTH_SHORT).show();
        } else if (((count00 == 2) && (count11 == 2) && (count22 == 2)) || ((count02 == 2) && (count11 == 2) && (count20 == 2)) || ((count00 == 2) && (count01 == 2) && (count02 == 2))
                || ((count10 == 2) && (count11 == 2) && (count12 == 2)) || ((count20 == 2) && (count21 == 2) && (count22 == 2))
                || ((count00 == 2) && (count10 == 2) && (count20 == 2)) || ((count01 == 2) && (count11 == 2) && (count21 == 2)) || ((count02 == 2) && (count12 == 2) && (count22 == 2))) {
            Toast.makeText(this, "Yellow is winner!", Toast.LENGTH_SHORT).show();
        }


    }
}