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

public class ItQ1Activity extends AppCompatActivity {
    MediaPlayer mp;
    RadioButton rb_Q1WA1It;
    RadioButton rb_Q1WA2It;
    RadioButton rb_Q1WA3It;
    RadioButton rb_Q1RAIt;
    boolean Q1Answer;
    String username;
    boolean sound;
    SharedPreferences sp;
    TextView tv_1,tv_2,tv_3;
    Button bt_next;
    ConstraintLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_q1);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        rb_Q1WA1It = findViewById(R.id.rb_Q1WA1It);
        rb_Q1WA2It = findViewById(R.id.rb_Q1WA2It);
        rb_Q1WA3It = findViewById(R.id.rb_Q1WA3It);
        rb_Q1RAIt = findViewById(R.id.rb_Q1RAIt);
        username = getIntent().getStringExtra("username");
        tv_1=findViewById(R.id.textView);
        tv_2=findViewById(R.id.textView5);
        tv_3=findViewById(R.id.textView6);
        bt_next = findViewById(R.id.bt_nextQ1It);
        rl =  findViewById(R.id.my_layout);
        switch(sp.getString("Style","Style1")){
            case "Style1":
                rb_Q1WA1It.setTextColor(getColor(R.color.gold));
                rb_Q1WA2It.setTextColor(getColor(R.color.gold));
                rb_Q1WA3It.setTextColor(getColor(R.color.gold));
                rb_Q1RAIt.setTextColor(getColor(R.color.gold));
                tv_1.setTextColor(getColor(R.color.gold));
                tv_2.setTextColor(getColor(R.color.gold));
                tv_3.setTextColor(getColor(R.color.gold));
                bt_next.setBackgroundColor(getColor(R.color.gold));
                rl.setBackgroundColor(getColor(R.color.white));
                break;
            case "Style2":
                rb_Q1WA1It.setTextColor(getColor(R.color.cyan));
                rb_Q1WA2It.setTextColor(getColor(R.color.cyan));
                rb_Q1WA3It.setTextColor(getColor(R.color.cyan));
                rb_Q1RAIt.setTextColor(getColor(R.color.cyan));
                tv_1.setTextColor(getColor(R.color.cyan));
                tv_2.setTextColor(getColor(R.color.cyan));
                tv_3.setTextColor(getColor(R.color.cyan));
                bt_next.setBackgroundColor(getColor(R.color.cyan));
                rl.setBackgroundColor(getColor(R.color.black));
                break;
            case "Style3":
                rb_Q1WA1It.setTextColor(getColor(R.color.brown));
                rb_Q1WA2It.setTextColor(getColor(R.color.brown));
                rb_Q1WA3It.setTextColor(getColor(R.color.brown));
                rb_Q1RAIt.setTextColor(getColor(R.color.brown));
                tv_1.setTextColor(getColor(R.color.brown));
                tv_2.setTextColor(getColor(R.color.brown));
                tv_3.setTextColor(getColor(R.color.brown));
                bt_next.setBackgroundColor(getColor(R.color.brown));
                rl.setBackgroundColor(getColor(R.color.blue));
                break;
        }
    }

    public void btnClickNext(View V){
        if(sound){
        mp.start();}
        if (!rb_Q1WA1It.isChecked()&&!rb_Q1WA2It.isChecked()&&!rb_Q1WA3It.isChecked()&&!rb_Q1RAIt.isChecked()){
            Toast.makeText(getApplicationContext(),"Please choose an answer to go to another question",Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(this, ItQ2Activity.class);
            Q1Answer = rb_Q1RAIt.isChecked();
            i.putExtra("username",username);
            i.putExtra("Q1Answer", Q1Answer);
            startActivity(i);
        }
    }
    public void rb_choose(View v){
        if(sound){
            mp.start();
        }
    }
}