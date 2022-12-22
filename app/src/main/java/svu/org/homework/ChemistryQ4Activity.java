package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ChemistryQ4Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q4WA1Chemistry;
    RadioButton rb_Q4WA2Chemistry;
    RadioButton rb_Q4WA3Chemistry;
    RadioButton rb_Q4RAChemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q4);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1Chemistry = findViewById(R.id.rb_Q4WA1Chemistry);
        rb_Q4WA2Chemistry = findViewById(R.id.rb_Q4WA2Chemistry);
        rb_Q4WA3Chemistry = findViewById(R.id.rb_Q4WA3Chemistry);
        rb_Q4RAChemistry = findViewById(R.id.rb_Q4RAChemistry);
    }
    public void btnClickNext(View V){
        mp.start();
        if(!rb_Q4WA1Chemistry.isChecked()&&!rb_Q4WA2Chemistry.isChecked()&&!rb_Q4WA3Chemistry.isChecked()&&!rb_Q4RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this,ChemistryQ5Activity.class);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if(!rb_Q4WA1Chemistry.isChecked()&&!rb_Q4WA2Chemistry.isChecked()&&!rb_Q4WA3Chemistry.isChecked()&&!rb_Q4RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ3Activity.class);
            startActivity(i);
        }
    }
}