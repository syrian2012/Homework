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

public class ItQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q1WA1It;
    RadioButton rb_Q1WA2It;
    RadioButton rb_Q1WA3It;
    RadioButton rb_Q1RAIt;
    boolean Q1Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q1);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q1WA1It = findViewById(R.id.rb_Q1WA1It);
        rb_Q1WA2It = findViewById(R.id.rb_Q1WA2It);
        rb_Q1WA3It = findViewById(R.id.rb_Q1WA3It);
        rb_Q1RAIt = findViewById(R.id.rb_Q1RAIt);
        username = getIntent().getStringExtra("username");
    }

    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q1WA1It.isChecked()&&!rb_Q1WA2It.isChecked()&&!rb_Q1WA3It.isChecked()&&!rb_Q1RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ2Activity.class);
            Q1Answer = rb_Q1RAIt.isChecked();
            i.putExtra("username",username);
            i.putExtra("Q1Answer", Q1Answer);
            startActivity(i);
        }
    }
}