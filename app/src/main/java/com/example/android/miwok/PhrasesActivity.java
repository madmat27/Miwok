package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create an ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus?"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә?"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        // Create a Listener for the Item Click in our ListView
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_where_are_you_going);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 1:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_what_is_your_name);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 2:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_my_name_is);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 3:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_how_are_you_feeling);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 4:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_feeling_good);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 5:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_are_you_coming);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 6:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_yes_im_coming);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 7:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_im_coming);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 8:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_lets_go);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 9:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(PhrasesActivity.this, R.raw.phrase_come_here);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                }
            }
        });

    }
}
