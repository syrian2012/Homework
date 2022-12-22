package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {
    Switch sw_sound;
    SharedPreferences sp;
    boolean sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        sw_sound = findViewById(R.id.sw_sound);
        sw_sound.setChecked(sound);
        sw_sound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                SharedPreferences.Editor editor = sp.edit();
                editor.putBoolean("Sound",sw_sound.isChecked());
                editor.apply();
            }
        });
    }

}