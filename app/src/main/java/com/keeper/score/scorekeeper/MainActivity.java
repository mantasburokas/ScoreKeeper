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
        TextView textView = (TextView) findViewById(R.id.goals_left_team);

        textView.setText(++goalsLeftTeam + "");
    }

    protected void addFoulLeftTeam(View view) {
        TextView textView = (TextView) findViewById(R.id.fouls_left_team);

        textView.setText(++foulsLeftTeam + "");
    }

    protected void addGoalRightTeam(View view) {
        TextView textView = (TextView) findViewById(R.id.goals_right_team);

        textView.setText(++goalsRightTeam + "");
    }

    protected void addFoulRightTeam(View view) {
        TextView textView = (TextView) findViewById(R.id.fouls_right_team);

        textView.setText(++foulsRightTeam + "");
    }

    protected void reset(View view) {
        goalsLeftTeam = 0;
        foulsLeftTeam = 0;

        goalsRightTeam = 0;
        foulsRightTeam = 0;

        resetById(R.id.goals_left_team);
        resetById(R.id.fouls_left_team);
        resetById(R.id.goals_right_team);
        resetById(R.id.fouls_right_team);
    }

    protected void resetById(int id) {
        TextView textView = (TextView) findViewById(id);

        textView.setText(0 + "");
    }
}
