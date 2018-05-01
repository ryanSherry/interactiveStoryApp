package com.teamtreehouse.interactivestory.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.teamtreehouse.interactivestory.R;
import com.teamtreehouse.interactivestory.model.Page;


public class StoryActivity extends AppCompatActivity {

    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);
        String name = intent.getStringExtra(key);
        if (name == null || name.isEmpty()) {
            name = "Friend";
        }
        Log.d(TAG, name);

    }
}
