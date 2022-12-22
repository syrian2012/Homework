package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ4Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q4WA1Math;
    RadioButton rb_Q4WA2Math;
    RadioButton rb_Q4WA3Math;
    RadioButton rb_Q4RAMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q4);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1Math = findViewById(R.id.rb_Q4WA1Math);
        rb_Q4WA2Math = findViewById(R.id.rb_Q4WA2Math);
        rb_Q4WA3Math = findViewById(R.id.rb_Q4WA3Math);
        rb_Q4RAMath = findViewById(R.id.rb_Q4RAMath);
    }
    public void btnClickNext(View V){
        mp.start();
        if (!rb_Q4WA1Math.isChecked()&&!rb_Q4WA2Math.isChecked()&&!rb_Q4WA3Math.isChecked()&&!rb_Q4RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ5Activity.class);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q4WA1Math.isChecked()&&!rb_Q4WA2Math.isChecked()&&!rb_Q4WA3Math.isChecked()&&!rb_Q4RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ3Activity.class);
            startActivity(i);
        }
    }
}