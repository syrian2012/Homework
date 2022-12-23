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

public class ItQ2Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q2WA1It;
    RadioButton rb_Q2WA2It;
    RadioButton rb_Q2WA3It;
    RadioButton rb_Q2RAIt;
    boolean Q1Answer;
    boolean Q2Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q2);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q2WA1It = findViewById(R.id.rb_Q2WA1It);
        rb_Q2WA2It = findViewById(R.id.rb_Q2WA2It);
        rb_Q2WA3It = findViewById(R.id.rb_Q2WA3It);
        rb_Q2RAIt = findViewById(R.id.rb_Q2RAIt);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q2WA1It.isChecked()&&!rb_Q2WA2It.isChecked()&&!rb_Q2WA3It.isChecked()&&!rb_Q2RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q2Answer = rb_Q2RAIt.isChecked();
            Intent i = new Intent(this, ItQ3Activity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("username",username);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
        if (!rb_Q2WA1It.isChecked()&&!rb_Q2WA2It.isChecked()&&!rb_Q2WA3It.isChecked()&&!rb_Q2RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ1Activity.class);
            setResult(RESULT_OK,i);
            finish();
        }
    }
    public void rb_choose(View v){
        if(sound){
            mp.start();
        }
    }
}