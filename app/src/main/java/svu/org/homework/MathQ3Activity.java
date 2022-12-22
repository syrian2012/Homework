package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ3Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q3WA1Math;
    RadioButton rb_Q3WA2Math;
    RadioButton rb_Q3WA3Math;
    RadioButton rb_Q3RAMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q3);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q3WA1Math = findViewById(R.id.rb_Q3WA1Math);
        rb_Q3WA2Math = findViewById(R.id.rb_Q3WA2Math);
        rb_Q3WA3Math = findViewById(R.id.rb_Q3WA3Math);
        rb_Q3RAMath = findViewById(R.id.rb_Q3RAMath);
    }
    public void btnClickNext(View V){
        mp.start();
        if (!rb_Q3WA1Math.isChecked()&&!rb_Q3WA2Math.isChecked()&&!rb_Q3WA3Math.isChecked()&&!rb_Q3RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q3WA1Math.isChecked()&&!rb_Q3WA2Math.isChecked()&&!rb_Q3WA3Math.isChecked()&&!rb_Q3RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ2Activity.class);
            startActivity(i);
        }
    }
}