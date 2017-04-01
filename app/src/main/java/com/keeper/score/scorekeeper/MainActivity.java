package com.keeper.score.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int goalsLeftTeam = 0;
    private int foulsLeftTeam = 0;

    private int goalsRightTeam = 0;
    private int foulsRightTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void addGoalLeftTeam(View view) {
        changeScoreTextView(R.id.goals_left_team, ++goalsLeftTeam);
    }

    protected void addFoulLeftTeam(View view) {
        changeScoreTextView(R.id.fouls_left_team, ++foulsLeftTeam);
    }

    protected void addGoalRightTeam(View view) {
        changeScoreTextView(R.id.goals_right_team, ++goalsRightTeam);
    }

    protected void addFoulRightTeam(View view) {
        changeScoreTextView(R.id.fouls_right_team, ++foulsRightTeam);
    }

    protected void changeScoreTextView(int id, int metric) {
        TextView textView = (TextView) findViewById(id);

        textView.setText(String.valueOf(metric));
    }

    protected void reset(View view) {
        goalsLeftTeam = 0;
        foulsLeftTeam = 0;

        goalsRightTeam = 0;
        foulsRightTeam = 0;

        changeScoreTextView(R.id.goals_left_team);
        changeScoreTextView(R.id.fouls_left_team);
        changeScoreTextView(R.id.goals_right_team);
        changeScoreTextView(R.id.fouls_right_team);
    }

    protected void changeScoreTextView(int id) {
        TextView textView = (TextView) findViewById(id);

        textView.setText(String.valueOf(0));
    }
}
