package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class PhysicsQ4Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q4WA1Physics;
    RadioButton rb_Q4WA2Physics;
    RadioButton rb_Q4WA3Physics;
    RadioButton rb_Q4RAPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_q4);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1Physics = findViewById(R.id.rb_Q4WA1Physics);
        rb_Q4WA2Physics = findViewById(R.id.rb_Q4WA2Physics);
        rb_Q4WA3Physics = findViewById(R.id.rb_Q4WA3Physics);
        rb_Q4RAPhysics = findViewById(R.id.rb_Q4RAPhysics);
    }
    public void btnClickNext(View V){
        mp.start();
        if (!rb_Q4WA1Physics.isChecked()&&!rb_Q4WA2Physics.isChecked()&&!rb_Q4WA3Physics.isChecked()&&!rb_Q4RAPhysics.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, PhysicsQ5Activity.class);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q4WA1Physics.isChecked()&&!rb_Q4WA2Physics.isChecked()&&!rb_Q4WA3Physics.isChecked()&&!rb_Q4RAPhysics.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, PhysicsQ3Activity.class);
            startActivity(i);
        }
    }
}