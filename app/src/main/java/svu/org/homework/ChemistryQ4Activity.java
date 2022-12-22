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
    boolean ChemistryQ1Answer;
    boolean ChemistryQ2Answer;
    boolean ChemistryQ3Answer;
    boolean ChemistryQ4Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q4);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q4WA1Chemistry = findViewById(R.id.rb_Q4WA1Chemistry);
        rb_Q4WA2Chemistry = findViewById(R.id.rb_Q4WA2Chemistry);
        rb_Q4WA3Chemistry = findViewById(R.id.rb_Q4WA3Chemistry);
        rb_Q4RAChemistry = findViewById(R.id.rb_Q4RAChemistry);
        ChemistryQ1Answer = getIntent().getBooleanExtra("ChemistryQ1Answer",false);
        ChemistryQ2Answer = getIntent().getBooleanExtra("ChemistryQ2Answer",false);
        ChemistryQ3Answer = getIntent().getBooleanExtra("ChemistryQ3Answer",false);
    }
    public void btnClickNext(View V){
        mp.start();
        if(!rb_Q4WA1Chemistry.isChecked()&&!rb_Q4WA2Chemistry.isChecked()&&!rb_Q4WA3Chemistry.isChecked()&&!rb_Q4RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            ChemistryQ4Answer = rb_Q4RAChemistry.isChecked();
            Intent i = new Intent(this,ChemistryQ5Activity.class);
            i.putExtra("ChemistryQ1Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ2Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ3Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ4Answer",ChemistryQ4Answer);
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