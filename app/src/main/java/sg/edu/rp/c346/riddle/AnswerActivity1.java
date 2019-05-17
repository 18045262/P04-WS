package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        Log.d("AnswerActivity", "onCreate() called.");


        tv = findViewById(R.id.tv);
        // tv.setText("In second activity");
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tv.setText(questionSelected + " answer is Queue");
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("AnswerActivity", "onResume() called.");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("AnswerActivity", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("AnswerActivity", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("AnswerActivity", "onRestart() called.");
        super.onRestart();

    }
}
