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

public class PhysicsQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q1WA1Physics;
    RadioButton rb_Q1WA2Physics;
    RadioButton rb_Q1WA3Physics;
    RadioButton rb_Q1RAPhysics;
    boolean Q1Answer;
    String username;
    boolean sound;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_q1);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q1WA1Physics = findViewById(R.id.rb_Q1WA1Physics);
        rb_Q1WA2Physics = findViewById(R.id.rb_Q1WA2Physics);
        rb_Q1WA3Physics = findViewById(R.id.rb_Q1WA3Physics);
        rb_Q1RAPhysics = findViewById(R.id.rb_Q1RAPhysics);
        username = getIntent().getStringExtra("username");
    }
    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q1WA1Physics.isChecked()&&!rb_Q1WA2Physics.isChecked()&&!rb_Q1WA3Physics.isChecked()&&!rb_Q1RAPhysics.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, PhysicsQ2Activity.class);
            Q1Answer = rb_Q1RAPhysics.isChecked();
            i.putExtra("username",username);
            i.putExtra("Q1Answer", Q1Answer);
            startActivity(i);
        }
    }
}