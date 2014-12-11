package com.jackmiddlebrook.pixarmoviefacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private MovieList mMovieList = new MovieList();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View Variables and assign them the Views from our layout
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final TextView movieLabel = (TextView) findViewById(R.id.movieNameTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFact);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked so update the fact and movie strings
                String fact = mFactBook.getFact();
                String movie = mMovieList.getMovie();
                int color = mColorWheel.getColor();

                // Update the fact and movie labels with the next values
                factLabel.setText(fact);
                movieLabel.setText(movie);

                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };

        showFactButton.setOnClickListener(listener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}