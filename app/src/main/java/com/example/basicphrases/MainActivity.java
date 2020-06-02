package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Log.i("Info", "Button Pressed");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        mediaPlayer.start();
    }
    public void clickFuncionEv(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayer.start();

    }
    public void clickFuncionHe(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.hello);
        mediaPlayer.start();

    }
    public void clickFuncionHo(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
        mediaPlayer.start();

    }
    public void clickFuncionIl(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
        mediaPlayer.start();

    }
    public void clickFuncionMy(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
        mediaPlayer.start();

    }
    public void clickFuncionPl(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.please);
        mediaPlayer.start();

    }
    public void clickFuncionWe(View view)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
        mediaPlayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
