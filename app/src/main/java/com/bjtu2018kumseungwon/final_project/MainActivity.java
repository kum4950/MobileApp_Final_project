package com.bjtu2018kumseungwon.final_project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title1, title2;
    ImageButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title1 =findViewById(R.id.title1);
        title2 =findViewById(R.id.title2);
        button =findViewById(R.id.imageButton);
        MediaPlayer mp = MediaPlayer.create(getBaseContext(),R.raw.car);
        mp.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(getApplicationContext(),MainActivity2.class );
                startActivity(go);
                finish();
            }
        });


    }



}
