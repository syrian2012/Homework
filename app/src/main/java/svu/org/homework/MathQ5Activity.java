package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MathQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1Math;
    RadioButton rb_Q5WA2Math;
    RadioButton rb_Q5WA3Math;
    RadioButton rb_Q5RAMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q5);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1Math = findViewById(R.id.rb_Q5WA1Math);
        rb_Q5WA2Math = findViewById(R.id.rb_Q5WA2Math);
        rb_Q5WA3Math = findViewById(R.id.rb_Q5WA3Math);
        rb_Q5RAMath = findViewById(R.id.rb_Q5RAMath);
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q5WA1Math.isChecked()&&!rb_Q5WA2Math.isChecked()&&!rb_Q5WA3Math.isChecked()&&!rb_Q5RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, MathQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickFinish(View V){
        mp.start();
        if (!rb_Q5WA1Math.isChecked()&&!rb_Q5WA2Math.isChecked()&&!rb_Q5WA3Math.isChecked()&&!rb_Q5RAMath.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to finish exam",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, FinishActivity.class);
            startActivity(i);
        }
    }
}