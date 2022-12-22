package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q1WA1Math;
    RadioButton rb_Q1WA2Math;
    RadioButton rb_Q1WA3Math;
    RadioButton rb_Q1RAMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q1);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q1WA1Math = findViewById(R.id.rb_Q1WA1Math);
        rb_Q1WA2Math = findViewById(R.id.rb_Q1WA2Math);
        rb_Q1WA3Math = findViewById(R.id.rb_Q1WA3Math);
        rb_Q1RAMath = findViewById(R.id.rb_Q1RAMath);
    }
    public void btnClickNext(View V){
        mp.start();
        if (!rb_Q1WA1Math.isChecked()&&!rb_Q1WA2Math.isChecked()&&!rb_Q1WA3Math.isChecked()&&!rb_Q1RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ2Activity.class);
            startActivity(i);
        }
    }
}