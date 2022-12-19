package svu.org.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    MediaPlayer mp;
    TextView tv_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mp = MediaPlayer.create(this, R.raw.soho);
        tv_welcome = findViewById(R.id.tv_welcome);
        String username = getIntent().getStringExtra("username");
        tv_welcome.setText("Welcome"+" "+ username );
    }
    public void onClickExam(View v){
        mp.start();
        Button bt = (Button) v;
        String exam = bt.getText().toString();
        switch (exam){
            case "Math":
                Intent m = new Intent(this,MathQ1Activity.class);
                startActivity(m);
                break;
            case "Chemistry":
                Intent c = new Intent(this,ChemistryQ1Activity.class);
                startActivity(c);
                break;
            case "IT":
                Intent i = new Intent(this,ItQ1Activity.class);
                startActivity(i);
                break;
            case "Physics":
                Intent p = new Intent(this,PhysicsQ1Activity.class);
                startActivity(p);
                break;

        }

    }
}