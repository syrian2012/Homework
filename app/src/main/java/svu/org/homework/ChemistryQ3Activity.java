package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ChemistryQ3Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q3WA1Chemistry;
    RadioButton rb_Q3WA2Chemistry;
    RadioButton rb_Q3WA3Chemistry;
    RadioButton rb_Q3RAChemistry;
    boolean ChemistryQ1Answer;
    boolean ChemistryQ2Answer;
    boolean ChemistryQ3Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q3);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q3WA1Chemistry = findViewById(R.id.rb_Q3WA1Chemistry);
        rb_Q3WA2Chemistry = findViewById(R.id.rb_Q3WA2Chemistry);
        rb_Q3WA3Chemistry = findViewById(R.id.rb_Q3WA3Chemistry);
        rb_Q3RAChemistry = findViewById(R.id.rb_Q3RAChemistry);
        ChemistryQ1Answer = getIntent().getBooleanExtra("ChemistryQ1Answer",false);
        ChemistryQ2Answer = getIntent().getBooleanExtra("ChemistryQ2Answer",false);
    }
    public void btnClickNext(View V){
        mp.start();
        if(!rb_Q3WA1Chemistry.isChecked()&&!rb_Q3WA2Chemistry.isChecked()&&!rb_Q3WA3Chemistry.isChecked()&&!rb_Q3RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            ChemistryQ3Answer = rb_Q3RAChemistry.isChecked();
            Intent i = new Intent(this,ChemistryQ4Activity.class);
            i.putExtra("ChemistryQ1Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ2Answer",ChemistryQ1Answer);
            i.putExtra("ChemistryQ3Answer",ChemistryQ1Answer);
            startActivity(i);
        }
    }
    public void btnClickBack(View V){
        mp.start();
        if(!rb_Q3WA1Chemistry.isChecked()&&!rb_Q3WA2Chemistry.isChecked()&&!rb_Q3WA3Chemistry.isChecked()&&!rb_Q3RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ChemistryQ2Activity.class);
            startActivity(i);
        }
    }
}