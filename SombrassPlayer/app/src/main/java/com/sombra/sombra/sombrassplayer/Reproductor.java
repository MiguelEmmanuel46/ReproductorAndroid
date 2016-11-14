package com.sombra.sombra.sombrassplayer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Reproductor extends AppCompatActivity {
    public int candor = 1;
     MediaPlayer mp;
    String song22;
    ImageButton botonplay, botonpause, botonstop;
    ImageView foto;
    Bitmap bmp1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botonplay = (ImageButton) findViewById(R.id.btnplay);
        botonpause = (ImageButton) findViewById(R.id.btnpause);
        botonstop = (ImageButton) findViewById(R.id.btnstop);

        foto = (ImageView) findViewById(R.id.imageView2);
        final TextView teat = (TextView) findViewById(R.id.textView);
         song22 = getIntent().getStringExtra("songs");

        switch (song22) {
            case "aboutagirl":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.nirvana1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.roadhouseblues);
                break;
            case "backinblack":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.fon2);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.backinblack);
                break;
            case "breakonthrough":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.thedoors1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.breakonthrough);
                break;
            case "dustinthewind":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.scorpions1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.dustinthewind);
                break;
            case "heartshapedbox":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.nirvana1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.heartshapedbox);
                break;
            case "highwaytohell":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.fon2);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.highwaytohell);
                break;
            case "lightmyfire":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.thedoors1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.lightmyfire);
                break;
            case "lithium":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.nirvana1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.lithium);
                break;
            case "rhythmoflove":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.scorpions1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.rhythmoflove);
                break;
            case "roadhouseblues":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.scorpions1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.roadhouseblues);
                break;
            case "thunderstruck":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.fon2);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.thunderstruck);
                break;
            case "windofchange":
                bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.scorpions1);
                foto.setImageBitmap(bmp1);
                mp = MediaPlayer.create(this, R.raw.windofchange);

                break;
        }







        /*imageButton*/
        botonplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*if (candor == 1) {*/
                    mp.start();
                    /*candor = 0;
                } else {
                    candor = 1;
                    mp.pause();
                }*/

                teat.setText(song22);


            }
        });

        botonpause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    mp.pause();
            }
        });

        botonstop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mp.stop();
            }
        });




    }


}
