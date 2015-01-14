package com.wordpress.webdevrn.kidsjokes;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class KidsJokes extends Activity {
    private JokeBook mJokeBook = new JokeBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_jokes);

        MediaPlayer mediaPlayer = MediaPlayer.create(KidsJokes.this,R.raw.avanote);
        mediaPlayer.start();
        //declare our View variables and assign Views from layout file
        final TextView jokeLabel = (TextView) findViewById(R.id.showJoke);
        final Button showJokeButton = (Button) findViewById(R.id.next_joke);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String joke = mJokeBook.getJoke();

                jokeLabel.setText(joke);
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showJokeButton.setTextColor(color);
            }
        };
        showJokeButton.setOnClickListener(listener);
        Toast.makeText(this, "Welcome to Ava\'s app of fun jokes!", Toast.LENGTH_LONG).show();
    }
// add music on off switch buttons






}
