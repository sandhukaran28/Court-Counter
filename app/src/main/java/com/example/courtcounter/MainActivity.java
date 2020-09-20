package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_a=0;
    int score_b=0;
    public void add_one(View view)
    {
       displayForTeamA(++score_a);
    }
    public void add_two(View view)
    {
        score_a+=2;
        displayForTeamA(score_a);
    }
    public void add_three(View view)
    {
        score_a+=3;
        displayForTeamA(score_a);
    }
    public void add_oneB(View view)
    {
        displayForTeamB(++score_b);
    }
    public void add_twoB(View view)
    {
        score_b+=2;
        displayForTeamB(score_b);
    }
    public void add_threeB(View view)
    {
        score_b+=3;
        displayForTeamB(score_b);
    }
    public void reset_score(View view)
    {
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}