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

public class ChemistryQ2Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q2WA1Chemistry;
    RadioButton rb_Q2WA2Chemistry;
    RadioButton rb_Q2WA3Chemistry;
    RadioButton rb_Q2RAChemistry;
    boolean Q1Answer;
    boolean Q2Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q2);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q2WA1Chemistry = findViewById(R.id.rb_Q2WA1Chemistry);
        rb_Q2WA2Chemistry = findViewById(R.id.rb_Q2WA2Chemistry);
        rb_Q2WA3Chemistry = findViewById(R.id.rb_Q2WA3Chemistry);
        rb_Q2RAChemistry = findViewById(R.id.rb_Q2RAChemistry);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if(!rb_Q2WA1Chemistry.isChecked()&&!rb_Q2WA2Chemistry.isChecked()&&!rb_Q2WA3Chemistry.isChecked()&&!rb_Q2RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q2Answer = rb_Q2RAChemistry.isChecked();
            Intent i = new Intent(this,ChemistryQ3Activity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("username",username);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
        if(!rb_Q2WA1Chemistry.isChecked()&&!rb_Q2WA2Chemistry.isChecked()&&!rb_Q2WA3Chemistry.isChecked()&&!rb_Q2RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ1Activity.class);
            startActivity(i);
        }
    }
}