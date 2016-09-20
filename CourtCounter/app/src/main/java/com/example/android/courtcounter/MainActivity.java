package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayForTeamA(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView teamAScore = (TextView) findViewById(R.id.team_b_score);
        teamAScore.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void threePointerA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void twoPointerA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void threePointerB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void twoPointerB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
}
