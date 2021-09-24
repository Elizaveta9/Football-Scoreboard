package com.example.footballscoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer counterLeft = 0;
    private Integer counterRight = 0;
    public static final String TAG = "Logs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }

    public void AddOneRight(View view) {
        counterRight++;
        TextView scoreView = (TextView) findViewById(R.id.score_right);
        scoreView.setText(counterRight.toString());
        Toast.makeText(this, "AddOneRight()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "AddOneRight()");
    }

    public void AddOneLeft(View view) {
        counterLeft++;
        TextView scoreView = (TextView) findViewById(R.id.score_left);
        scoreView.setText(counterLeft.toString());
        Toast.makeText(this, "AddOneLeft()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "AddOneLeft()");
    }

    public void Reset(View view) {
        counterLeft = 0;
        counterRight = 0;
        TextView scoreLView = (TextView) findViewById(R.id.score_left);
        scoreLView.setText(counterLeft.toString());
        TextView scoreRView = (TextView) findViewById(R.id.score_right);
        scoreRView.setText(counterRight.toString());
        Toast.makeText(this, "Reset()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Reset()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        resetUI();
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outstate) {
        super.onSaveInstanceState(outstate);
        outstate.putInt("countL", counterLeft);
        outstate.putInt("countR", counterRight);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("countL") &&
                savedInstanceState.containsKey("countR")) {
            counterLeft = savedInstanceState.getInt("countL");
            counterRight = savedInstanceState.getInt("countR");
        }
        Log.d(TAG, "onRestoreInstanceState");
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.score_left)).setText(counterLeft.toString());
        ((TextView) findViewById(R.id.score_right)).setText(counterRight.toString());
        Log.d(TAG, "resetUI");
        Toast.makeText(this, "resetUI()", Toast.LENGTH_LONG).show();
    }

}
