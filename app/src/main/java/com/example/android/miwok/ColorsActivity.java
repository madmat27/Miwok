package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("green", "chokokki", R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        // Create a Listener for the Item Click in our ListView
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_red);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 1:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_green);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 2:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_brown);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 3:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_gray);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 4:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_black);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 5:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_white);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 6:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_dusty_yellow);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 7:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(ColorsActivity.this, R.raw.color_mustard_yellow);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                }
            }
        });
    }
}
