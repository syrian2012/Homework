package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ItQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q1);
        mp = MediaPlayer.create(this, R.raw.soho);
    }

    public void btnClickNext(View V){
        mp.start();
        Intent i = new Intent(this,ItQ2Activity.class);
        startActivity(i);
    }
}