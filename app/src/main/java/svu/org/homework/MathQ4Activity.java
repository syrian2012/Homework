package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ4Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q4WA1Math;
    RadioButton rb_Q4WA2Math;
    RadioButton rb_Q4WA3Math;
    RadioButton rb_Q4RAMath;
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q4);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1Math = findViewById(R.id.rb_Q4WA1Math);
        rb_Q4WA2Math = findViewById(R.id.rb_Q4WA2Math);
        rb_Q4WA3Math = findViewById(R.id.rb_Q4WA3Math);
        rb_Q4RAMath = findViewById(R.id.rb_Q4RAMath);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        Q3Answer = getIntent().getBooleanExtra("Q3Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q4WA1Math.isChecked()&&!rb_Q4WA2Math.isChecked()&&!rb_Q4WA3Math.isChecked()&&!rb_Q4RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q4Answer = rb_Q4RAMath.isChecked();
            Intent i = new Intent(this, MathQ5Activity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("Q3Answer",Q3Answer);
            i.putExtra("Q4Answer",Q4Answer);
            i.putExtra("username",username);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
            Intent i = new Intent(this, MathQ3Activity.class);
            setResult(RESULT_OK,i);
            finish();
    }

    public void rb_choose(View v){
        if(sound){
            mp.start();
        }
    }
}