package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ2Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q2WA1Math;
    RadioButton rb_Q2WA2Math;
    RadioButton rb_Q2WA3Math;
    RadioButton rb_Q2RAMath;
    boolean Q1Answer;
    boolean Q2Answer;
    String username;
    boolean sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q2);
        sound = false;
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q2WA1Math = findViewById(R.id.rb_Q2WA1Math);
        rb_Q2WA2Math = findViewById(R.id.rb_Q2WA2Math);
        rb_Q2WA3Math = findViewById(R.id.rb_Q2WA3Math);
        rb_Q2RAMath = findViewById(R.id.rb_Q2RAMath);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q2WA1Math.isChecked()&&!rb_Q2WA2Math.isChecked()&&!rb_Q2WA3Math.isChecked()&&!rb_Q2RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q2Answer = rb_Q2RAMath.isChecked();
            Intent i = new Intent(this, MathQ3Activity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("username",username);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
        if (!rb_Q2WA1Math.isChecked()&&!rb_Q2WA2Math.isChecked()&&!rb_Q2WA3Math.isChecked()&&!rb_Q2RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ1Activity.class);
            startActivity(i);
        }
    }
}