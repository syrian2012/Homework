package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class PhysicsQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1Physics;
    RadioButton rb_Q5WA2Physics;
    RadioButton rb_Q5WA3Physics;
    RadioButton rb_Q5RAPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_q5);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1Physics = findViewById(R.id.rb_Q5WA1Physics);
        rb_Q5WA2Physics = findViewById(R.id.rb_Q5WA2Physics);
        rb_Q5WA3Physics = findViewById(R.id.rb_Q5WA3Physics);
        rb_Q5RAPhysics = findViewById(R.id.rb_Q5RAPhysics);
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q5WA1Physics.isChecked()&&!rb_Q5WA2Physics.isChecked()&&!rb_Q5WA3Physics.isChecked()&&!rb_Q5RAPhysics.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, PhysicsQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickFinish(View V){
        mp.start();
            if (!rb_Q5WA1Physics.isChecked()&&!rb_Q5WA2Physics.isChecked()&&!rb_Q5WA3Physics.isChecked()&&!rb_Q5RAPhysics.isChecked()){
                Toast.makeText(getApplicationContext(),"Please choose an answer to finish exam",Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, FinishActivity.class);
                startActivity(i);
            }
    }
}