package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ChemistryQ3Activity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q3);
        mp = MediaPlayer.create(this, R.raw.soho);
    }
    public void btnClickNext(View V){
        mp.start();
        Intent i = new Intent(this,ChemistryQ2Activity.class);
        startActivity(i);
    }
}