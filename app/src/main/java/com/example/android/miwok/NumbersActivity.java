package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    // Create a MediaPlayer Object.
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo’e", R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        // Create a Listener for the Item Click in our ListView
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 1:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_two);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 2:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_three);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 3:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_four);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 4:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_five);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 5:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_six);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 6:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_seven);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 7:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_eight);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 8:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_nine);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 9:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_ten);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                }
            }
        });

    }
}
