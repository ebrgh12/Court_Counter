package com.example.android.court_counter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* Global varibles score*/
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /* This method is called when +3 POINTS buton is pressed by the team A to update the scoreTeamA variable by +3 and display method is called*/
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /* This method is called when +2 POINTS button is pressed by the team A to update the scoreTeamA variable by +2 and display method is called*/
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /* This method is called when +1 POINTS button is pressed by the team A to update the scoreTeamA variable by +1 and display method is called*/
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /* This method is called when +3 POINTS button is pressed by the team B to update the scoreTeamB variable by +3 and display method is called*/
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /* This method is called when +2 POINTS button is pressed by the team B to update the scoreTeamB variable by +2 and display method is called*/
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /* This method is called when +1 POINTS button is pressed by the team B to update the scoreTeamB variable by +1 and display method is called*/
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
   /* This method is called when the reset button is pressed, the score variable of both the team is set to zero and displayed*/
    public void gameReset(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
   /* This method is called when we click the Finish button, As the game finishes the result is being displayed as which team won */
    public void gameFinish(View v){
        if(scoreTeamA==scoreTeamB){
            Toast.makeText(MainActivity.this, " Result= Match tied",
                Toast.LENGTH_LONG).show();
        }
        else if(scoreTeamA<scoreTeamB)
        {
        Toast.makeText(MainActivity.this, "Result = TEAM B WINS",
                Toast.LENGTH_LONG).show();
        }
        else
        {
        Toast.makeText(MainActivity.this, "Result = TEAM A WINS",
                Toast.LENGTH_LONG).show();
        }
    }
}
