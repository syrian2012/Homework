package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ItQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1It;
    RadioButton rb_Q5WA2It;
    RadioButton rb_Q5WA3It;
    RadioButton rb_Q5RAIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q5);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1It = findViewById(R.id.rb_Q5WA1It);
        rb_Q5WA2It = findViewById(R.id.rb_Q5WA2It);
        rb_Q5WA3It = findViewById(R.id.rb_Q5WA3It);
        rb_Q5RAIt = findViewById(R.id.rb_Q5RAIt);
    }
    public void btnClickBack(View V){
        mp.start();
        if (!rb_Q5WA1It.isChecked()&&!rb_Q5WA2It.isChecked()&&!rb_Q5WA3It.isChecked()&&!rb_Q5RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickFinish(View V){
        mp.start();
            if (!rb_Q5WA1It.isChecked()&&!rb_Q5WA2It.isChecked()&&!rb_Q5WA3It.isChecked()&&!rb_Q5RAIt.isChecked()){
                Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this, FinishActivity.class);
                startActivity(i);
            }
    }
}