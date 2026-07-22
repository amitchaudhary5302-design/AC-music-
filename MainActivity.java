package com.example.acmusic;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;

public class MainActivity extends Activity {

    MediaPlayer player;
    Button play, pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);

        player = MediaPlayer.create(this, R.raw.music);

        play.setOnClickListener(v -> {
            player.start();
        });

        pause.setOnClickListener(v -> {
            player.pause();
        });
    }
}