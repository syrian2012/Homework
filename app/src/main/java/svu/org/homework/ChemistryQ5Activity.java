package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ChemistryQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1Chemistry;
    RadioButton rb_Q5WA2Chemistry;
    RadioButton rb_Q5WA3Chemistry;
    RadioButton rb_Q5RAChemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q5);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1Chemistry = findViewById(R.id.rb_Q5WA1Chemistry);
        rb_Q5WA2Chemistry = findViewById(R.id.rb_Q5WA2Chemistry);
        rb_Q5WA3Chemistry = findViewById(R.id.rb_Q5WA3Chemistry);
        rb_Q5RAChemistry = findViewById(R.id.rb_Q5RAChemistry);
    }
    public void btnClickBack(View V){
        mp.start();
        if(!rb_Q5WA1Chemistry.isChecked()&&!rb_Q5WA2Chemistry.isChecked()&&!rb_Q5WA3Chemistry.isChecked()&&!rb_Q5RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ4Activity.class);
            startActivity(i);
        }
    }
    public void btnClickFinish(View V){
        mp.start();
        if(!rb_Q5WA1Chemistry.isChecked()&&!rb_Q5WA2Chemistry.isChecked()&&!rb_Q5WA3Chemistry.isChecked()&&!rb_Q5RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to finish exam",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, FinishActivity.class);
            startActivity(i);
        }
    }
}