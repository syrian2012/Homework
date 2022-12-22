package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ItQ4Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q4WA1It;
    RadioButton rb_Q4WA2It;
    RadioButton rb_Q4WA3It;
    RadioButton rb_Q4RAIt;
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    String username;
    boolean sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q4);
        sound = true;
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1It = findViewById(R.id.rb_Q4WA1It);
        rb_Q4WA2It = findViewById(R.id.rb_Q4WA2It);
        rb_Q4WA3It = findViewById(R.id.rb_Q4WA3It);
        rb_Q4RAIt = findViewById(R.id.rb_Q4RAIt);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        Q3Answer = getIntent().getBooleanExtra("Q3Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q4WA1It.isChecked()&&!rb_Q4WA2It.isChecked()&&!rb_Q4WA3It.isChecked()&&!rb_Q4RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Q4Answer = rb_Q4RAIt.isChecked();
            Intent i = new Intent(this, ItQ5Activity.class);
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
        if (!rb_Q4WA1It.isChecked()&&!rb_Q4WA2It.isChecked()&&!rb_Q4WA3It.isChecked()&&!rb_Q4RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ3Activity.class);
            startActivity(i);
        }
    }
}