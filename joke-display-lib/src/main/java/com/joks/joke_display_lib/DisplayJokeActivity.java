package com.joks.joke_display_lib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by mukesh on 1/9/16.
 */
public class DisplayJokeActivity extends AppCompatActivity {

    public final static String EXTRA_INTENT_JOKE = "extra_intent_joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        // Processing the joke intent
        String joke = getIntent().getStringExtra(EXTRA_INTENT_JOKE);
        TextView textViewJoke = (TextView) findViewById(R.id.joke_tv);
        if (textViewJoke != null) {
            textViewJoke.setText(joke);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
