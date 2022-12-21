package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MathQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_q5);
        mp = MediaPlayer.create(this, R.raw.soho);
    }
    public void btnClickBack(View V){
        mp.start();
        Intent i = new Intent(this,MathQ4Activity.class);
        startActivity(i);
    }
    public void btnClickFinish(View V){
        mp.start();
        Intent i = new Intent(this,FinishActivity.class);
        startActivity(i);
    }
}