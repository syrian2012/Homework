package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ChemistryQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q1WA1Chemistry;
    RadioButton rb_Q1WA2Chemistry;
    RadioButton rb_Q1WA3Chemistry;
    RadioButton rb_Q1RAChemistry;
    boolean Q1Answer;
    String username;
    boolean sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q1);
        sound=false;
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q1WA1Chemistry = findViewById(R.id.rb_Q1WA1Chemistry);
        rb_Q1WA2Chemistry = findViewById(R.id.rb_Q1WA2Chemistry);
        rb_Q1WA3Chemistry = findViewById(R.id.rb_Q1WA3Chemistry);
        rb_Q1RAChemistry = findViewById(R.id.rb_Q1RAChemistry);
        username = getIntent().getStringExtra("username");
    }

    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q1WA1Chemistry.isChecked()&&!rb_Q1WA2Chemistry.isChecked()&&!rb_Q1WA3Chemistry.isChecked()&&!rb_Q1RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
        Intent i = new Intent(this,ChemistryQ2Activity.class);
            Q1Answer = rb_Q1RAChemistry.isChecked();
            i.putExtra("username",username);
            i.putExtra("Q1Answer", Q1Answer);
        startActivity(i);}
    }
}