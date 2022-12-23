package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {
    Switch sw_sound;
    SharedPreferences sp;
    boolean sound;
    String style;
    RadioButton rb_style1,rb_style2,rb_style3;
    Button bt_apply;
    TextView tv_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        sw_sound = findViewById(R.id.sw_sound);
        sw_sound.setChecked(sound);
        rb_style1 = findViewById(R.id.rb_style1);
        rb_style2 = findViewById(R.id.rb_style2);
        rb_style3 = findViewById(R.id.rb_style3);
        bt_apply = findViewById(R.id.bt_apply);
        tv_settings = findViewById(R.id.tv_settings);
        switch(sp.getString("Style","Style1")){
            case "Style1":
                rb_style1.setChecked(true);
                sw_sound.setTextColor(getColor(R.color.gold));
                rb_style1.setTextColor(getColor(R.color.gold));
                rb_style2.setTextColor(getColor(R.color.gold));
                rb_style3.setTextColor(getColor(R.color.gold));
                bt_apply.setBackgroundColor(getColor(R.color.gold));
                tv_settings.setTextColor(getColor(R.color.gold));
                break;
            case "Style2":
                rb_style2.setChecked(true);
                sw_sound.setTextColor(getColor(R.color.cyan));
                rb_style1.setTextColor(getColor(R.color.cyan));
                rb_style2.setTextColor(getColor(R.color.cyan));
                rb_style3.setTextColor(getColor(R.color.cyan));
                bt_apply.setBackgroundColor(getColor(R.color.cyan));
                tv_settings.setTextColor(getColor(R.color.cyan));
                break;
            case "Style3":
                rb_style3.setChecked(true);
                sw_sound.setTextColor(getColor(R.color.brown));
                rb_style1.setTextColor(getColor(R.color.brown));
                rb_style2.setTextColor(getColor(R.color.brown));
                rb_style3.setTextColor(getColor(R.color.brown));
                bt_apply.setBackgroundColor(getColor(R.color.brown));
                tv_settings.setTextColor(getColor(R.color.brown));
                break;
        }
        sw_sound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor = sp.edit();
                editor.putBoolean("Sound",sw_sound.isChecked());
                editor.apply();
            }
        });

        bt_apply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (rb_style2.isChecked())style="Style2";
                else if (rb_style3.isChecked())style="Style3";
                else style="Style1";
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Style",style);
                editor.apply();
                recreate();
            }
        });

    }

}