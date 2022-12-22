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

public class ItQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1It;
    RadioButton rb_Q5WA2It;
    RadioButton rb_Q5WA3It;
    RadioButton rb_Q5RAIt;
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    boolean Q5Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q5);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1It = findViewById(R.id.rb_Q5WA1It);
        rb_Q5WA2It = findViewById(R.id.rb_Q5WA2It);
        rb_Q5WA3It = findViewById(R.id.rb_Q5WA3It);
        rb_Q5RAIt = findViewById(R.id.rb_Q5RAIt);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        Q3Answer = getIntent().getBooleanExtra("Q3Answer",false);
        Q4Answer = getIntent().getBooleanExtra("Q4Answer",false);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
        if (!rb_Q5WA1It.isChecked()&&!rb_Q5WA2It.isChecked()&&!rb_Q5WA3It.isChecked()&&!rb_Q5RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickFinish(View V){
        if(sound){
        mp.start();}
            if (!rb_Q5WA1It.isChecked()&&!rb_Q5WA2It.isChecked()&&!rb_Q5WA3It.isChecked()&&!rb_Q5RAIt.isChecked()){
                Toast.makeText(getApplicationContext(),"Please choose an answer to finish exam",Toast.LENGTH_LONG).show();
            }
            else {
                Q5Answer = rb_Q5RAIt.isChecked();
                Intent i = new Intent(this, FinishActivity.class);
                i.putExtra("Q1Answer",Q1Answer);
                i.putExtra("Q2Answer",Q2Answer);
                i.putExtra("Q3Answer",Q3Answer);
                i.putExtra("Q4Answer",Q4Answer);
                i.putExtra("Q5Answer",Q5Answer);
                i.putExtra("username",username);
                i.putExtra("Type","Information technology");
                startActivity(i);
            }
    }
}