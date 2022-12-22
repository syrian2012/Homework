package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ItQ2Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q2WA1It;
    RadioButton rb_Q2WA2It;
    RadioButton rb_Q2WA3It;
    RadioButton rb_Q2RAIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q2);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q2WA1It = findViewById(R.id.rb_Q2WA1It);
        rb_Q2WA2It = findViewById(R.id.rb_Q2WA2It);
        rb_Q2WA3It = findViewById(R.id.rb_Q2WA3It);
        rb_Q2RAIt = findViewById(R.id.rb_Q2RAIt);
    }
    public void btnClickNext(View V){
        mp.start();
        if (!rb_Q2WA1It.isChecked()&&!rb_Q2WA2It.isChecked()&&!rb_Q2WA3It.isChecked()&&!rb_Q2RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ3Activity.class);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q2WA1It.isChecked()&&!rb_Q2WA2It.isChecked()&&!rb_Q2WA3It.isChecked()&&!rb_Q2RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ1Activity.class);
            startActivity(i);
        }
    }
}