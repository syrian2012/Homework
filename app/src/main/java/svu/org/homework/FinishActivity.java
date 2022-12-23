package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    boolean Q5Answer;
    String username;
    String Type;
    SharedPreferences sp;
    ConstraintLayout rl;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        TextView tv_result= findViewById(R.id.tv_showresult);
        TextView tv_username= findViewById(R.id.tv_showusername);
        username = getIntent().getStringExtra("username");
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        rl =  findViewById(R.id.my_layout);
        Type = getIntent().getStringExtra("Type");
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
        tv_result.setText("Your degree is "+result+" of 100");
        tv_username.setText(Type+ "'s exam has been finished "+ username);
        switch(sp.getString("Style","Style1")){
            case "Style1":
                tv_username.setTextColor(getColor(R.color.gold));
                tv_result.setTextColor(getColor(R.color.gold));
                rl.setBackgroundColor(getColor(R.color.white));
                break;
            case "Style2":
                tv_username.setTextColor(getColor(R.color.cyan));
                tv_result.setTextColor(getColor(R.color.cyan));
                rl.setBackgroundColor(getColor(R.color.black));
                break;
            case "Style3":
                tv_username.setTextColor(getColor(R.color.brown));
                tv_result.setTextColor(getColor(R.color.brown));
                rl.setBackgroundColor(getColor(R.color.blue));
                break;
        }
    }
}