package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ChemistryQ2Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q2WA1Chemistry;
    RadioButton rb_Q2WA2Chemistry;
    RadioButton rb_Q2WA3Chemistry;
    RadioButton rb_Q2RAChemistry;
    boolean ChemistryQ1Answer;
    boolean ChemistryQ2Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q2);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q2WA1Chemistry = findViewById(R.id.rb_Q2WA1Chemistry);
        rb_Q2WA2Chemistry = findViewById(R.id.rb_Q2WA2Chemistry);
        rb_Q2WA3Chemistry = findViewById(R.id.rb_Q2WA3Chemistry);
        rb_Q2RAChemistry = findViewById(R.id.rb_Q2RAChemistry);
        ChemistryQ1Answer = getIntent().getBooleanExtra("ChemistryQ1Answer",false);
    }
    public void btnClickNext(View V){
        mp.start();
        if(!rb_Q2WA1Chemistry.isChecked()&&!rb_Q2WA2Chemistry.isChecked()&&!rb_Q2WA3Chemistry.isChecked()&&!rb_Q2RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            ChemistryQ2Answer = rb_Q2RAChemistry.isChecked();
            Intent i = new Intent(this,ChemistryQ3Activity.class);
            i.putExtra("ChemistryQ1Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ2Answer",ChemistryQ2Answer);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if(!rb_Q2WA1Chemistry.isChecked()&&!rb_Q2WA2Chemistry.isChecked()&&!rb_Q2WA3Chemistry.isChecked()&&!rb_Q2RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ1Activity.class);
            startActivity(i);
        }
    }
}