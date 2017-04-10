package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә", R.drawable.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        // Create a Listener for the Item Click in our ListView
        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_father);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 1:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_mother);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 2:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_son);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 3:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_daughter);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 4:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_older_brother);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 5:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_younger_brother);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 6:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_older_sister);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 7:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_younger_sister);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 8:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_grandmother);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                    case 9:
                        // Assign to the object the audio file
                        mediaPlayer = MediaPlayer.create(FamilyActivity.this, R.raw.family_grandfather);
                        // Play the audio file!
                        mediaPlayer.start();
                        break;
                }
            }
        });
    }
}
