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

public class ChemistryQ3Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q3WA1Chemistry;
    RadioButton rb_Q3WA2Chemistry;
    RadioButton rb_Q3WA3Chemistry;
    RadioButton rb_Q3RAChemistry;
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q3);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q3WA1Chemistry = findViewById(R.id.rb_Q3WA1Chemistry);
        rb_Q3WA2Chemistry = findViewById(R.id.rb_Q3WA2Chemistry);
        rb_Q3WA3Chemistry = findViewById(R.id.rb_Q3WA3Chemistry);
        rb_Q3RAChemistry = findViewById(R.id.rb_Q3RAChemistry);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if(!rb_Q3WA1Chemistry.isChecked()&&!rb_Q3WA2Chemistry.isChecked()&&!rb_Q3WA3Chemistry.isChecked()&&!rb_Q3RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q3Answer = rb_Q3RAChemistry.isChecked();
            Intent i = new Intent(this,ChemistryQ4Activity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("Q3Answer",Q3Answer);
            i.putExtra("username",username);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
        if(!rb_Q3WA1Chemistry.isChecked()&&!rb_Q3WA2Chemistry.isChecked()&&!rb_Q3WA3Chemistry.isChecked()&&!rb_Q3RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ2Activity.class);
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