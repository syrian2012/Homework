package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    boolean Q5Answer;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView tv_result= findViewById(R.id.tv_showresult);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        Q3Answer = getIntent().getBooleanExtra("Q3Answer",false);
        Q4Answer = getIntent().getBooleanExtra("Q4Answer",false);
        Q5Answer = getIntent().getBooleanExtra("Q5Answer",false);
        int result = 0;
        if(Q1Answer) result += 20;
        if(Q2Answer) result += 20;
        if(Q3Answer) result += 20;
        if(Q4Answer) result += 20;
        if(Q5Answer) result += 20;
        tv_result.setText(Integer.toString(result));
    }
}