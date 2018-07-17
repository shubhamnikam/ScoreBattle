package com.theappnerds.shubham.scorebattle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mScoreATeam, mScoreBTeam;
    private int threePoints = 3;
    private int twoPoints = 2;
    private int onePoint = 1;
    private int totalScoreA = 0, totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreATeam = (TextView) findViewById(R.id.score_a_team);
        mScoreBTeam = (TextView) findViewById(R.id.score_b_team);
    }

    private void displayScoreA(int mAdditionPoints) {
        totalScoreA = totalScoreA + mAdditionPoints;
        mScoreATeam.setText(""+totalScoreA);

    }

    private void displayScoreB(int mAdditionPoints) {
        totalScoreB = totalScoreB + mAdditionPoints;
        mScoreBTeam.setText(""+totalScoreB);

    }


    public void threePointsA(View view){
        displayScoreA(threePoints);
    }

    public void twoPointsA(View view) {
        displayScoreA(twoPoints);
    }

    public void onePointA(View view) {
        displayScoreA(onePoint);
    }


    public void threePointsB(View view){
        displayScoreB(threePoints);
    }

    public void twoPointsB(View view) {
        displayScoreB(twoPoints);
    }

    public void onePointB(View view) {
        displayScoreB(onePoint);
    }

    public void resetButton(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        displayScoreA(totalScoreA);
        displayScoreB(totalScoreB);


    }
}
