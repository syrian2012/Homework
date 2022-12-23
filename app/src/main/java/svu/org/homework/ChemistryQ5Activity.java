package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ChemistryQ5Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q5WA1Chemistry;
    RadioButton rb_Q5WA2Chemistry;
    RadioButton rb_Q5WA3Chemistry;
    RadioButton rb_Q5RAChemistry;
    boolean Q1Answer;
    boolean Q2Answer;
    boolean Q3Answer;
    boolean Q4Answer;
    boolean Q5Answer;
    String username;
    boolean sound;
    SharedPreferences sp;
    TextView tv_1,tv_2,tv_3;
    Button bt_next;
    Button bt_back;
    ConstraintLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_q5);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q5WA1Chemistry = findViewById(R.id.rb_Q5WA1Chemistry);
        rb_Q5WA2Chemistry = findViewById(R.id.rb_Q5WA2Chemistry);
        rb_Q5WA3Chemistry = findViewById(R.id.rb_Q5WA3Chemistry);
        rb_Q5RAChemistry = findViewById(R.id.rb_Q5RAChemistry);
        Q1Answer = getIntent().getBooleanExtra("Q1Answer",false);
        Q2Answer = getIntent().getBooleanExtra("Q2Answer",false);
        Q3Answer = getIntent().getBooleanExtra("Q3Answer",false);
        Q4Answer = getIntent().getBooleanExtra("Q4Answer",false);
        username = getIntent().getStringExtra("username");
        tv_1=findViewById(R.id.textView);
        tv_2=findViewById(R.id.textView5);
        tv_3=findViewById(R.id.textView6);
        bt_next = findViewById(R.id.bt_nextQ5Chemistry);
        bt_back = findViewById(R.id.bt_backQ5Chemistry);
        rl =  findViewById(R.id.my_layout);
        switch(sp.getString("Style","Style1")){
            case "Style1":
                rb_Q5WA1Chemistry.setTextColor(getColor(R.color.gold));
                rb_Q5WA2Chemistry.setTextColor(getColor(R.color.gold));
                rb_Q5WA3Chemistry.setTextColor(getColor(R.color.gold));
                rb_Q5RAChemistry.setTextColor(getColor(R.color.gold));
                tv_1.setTextColor(getColor(R.color.gold));
                tv_2.setTextColor(getColor(R.color.gold));
                tv_3.setTextColor(getColor(R.color.gold));
                bt_next.setBackgroundColor(getColor(R.color.gold));
                bt_back.setBackgroundColor(getColor(R.color.gold));
                rl.setBackgroundColor(getColor(R.color.white));
                break;
            case "Style2":
                rb_Q5WA1Chemistry.setTextColor(getColor(R.color.cyan));
                rb_Q5WA2Chemistry.setTextColor(getColor(R.color.cyan));
                rb_Q5WA3Chemistry.setTextColor(getColor(R.color.cyan));
                rb_Q5RAChemistry.setTextColor(getColor(R.color.cyan));
                tv_1.setTextColor(getColor(R.color.cyan));
                tv_2.setTextColor(getColor(R.color.cyan));
                tv_3.setTextColor(getColor(R.color.cyan));
                bt_next.setBackgroundColor(getColor(R.color.cyan));
                bt_back.setBackgroundColor(getColor(R.color.cyan));
                rl.setBackgroundColor(getColor(R.color.black));
                break;
            case "Style3":
                rb_Q5WA1Chemistry.setTextColor(getColor(R.color.brown));
                rb_Q5WA2Chemistry.setTextColor(getColor(R.color.brown));
                rb_Q5WA3Chemistry.setTextColor(getColor(R.color.brown));
                rb_Q5RAChemistry.setTextColor(getColor(R.color.brown));
                tv_1.setTextColor(getColor(R.color.brown));
                tv_2.setTextColor(getColor(R.color.brown));
                tv_3.setTextColor(getColor(R.color.brown));
                bt_next.setBackgroundColor(getColor(R.color.brown));
                bt_back.setBackgroundColor(getColor(R.color.brown));
                rl.setBackgroundColor(getColor(R.color.blue));
                break;
        }
    }
    public void btnClickBack(View V){
        if(sound){
        mp.start();}
            Intent i = new Intent(this, ChemistryQ4Activity.class);
            setResult(RESULT_OK,i);
            finish();
    }
    public void btnClickFinish(View V){
        if(sound){
        mp.start();}
        if(!rb_Q5WA1Chemistry.isChecked()&&!rb_Q5WA2Chemistry.isChecked()&&!rb_Q5WA3Chemistry.isChecked()&&!rb_Q5RAChemistry.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to finish exam",Toast.LENGTH_LONG).show();
        }
        else {
            Q5Answer = rb_Q5RAChemistry.isChecked();
            Intent i = new Intent(this, FinishActivity.class);
            i.putExtra("Q1Answer",Q1Answer);
            i.putExtra("Q2Answer",Q2Answer);
            i.putExtra("Q3Answer",Q3Answer);
            i.putExtra("Q4Answer",Q4Answer);
            i.putExtra("Q5Answer",Q5Answer);
            i.putExtra("username",username);
            i.putExtra("Type","Chemistry");
            startActivity(i);
        }
    }
    public void rb_choose(View v){
        if(sound){
            mp.start();
        }
    }
}