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
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_username;
    EditText et_password;
    MediaPlayer mp;
    boolean sound;
    SharedPreferences sp;
    Button bt_tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = getSharedPreferences("Settings", Context.MODE_PRIVATE);
        sound = sp.getBoolean("Sound",true);
        mp = MediaPlayer.create(this, R.raw.soho);
        bt_tip = findViewById(R.id.bt_tip);
        bt_tip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Any username will works with only '12345' password",Toast.LENGTH_LONG).show();
            }
        });
    }


    public void onClickLogin(View v){
        if(sound){
        mp.start();}
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        if ((et_password.getText().toString()).equals("12345") && !et_username.getText().toString().isEmpty()){
            Intent i = new Intent(this,HomeActivity.class);
            i.putExtra("username",et_username.getText().toString());
            startActivity(i);
            Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_LONG).show();
        }
    }
}