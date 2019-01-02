package com.bjtu2018kumseungwon.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    ImageButton push,guide,weight,exit,mp3,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        push=findViewById(R.id.push);
        guide=findViewById(R.id.guide);
        weight=findViewById(R.id.weight);
        exit=findViewById(R.id.exit);
        mp3=findViewById(R.id.music);
        login =findViewById(R.id.login);

        push.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go1 = new Intent(getApplicationContext(),MainActivity2_1.class );
                Toast.makeText(getApplicationContext(),"Push up!",Toast.LENGTH_SHORT ).show();
                startActivity(go1);
            }
        });
        guide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go2 = new Intent(getApplicationContext(),MainActivity2_2.class );
                Toast.makeText(getApplicationContext(),"Workout!",Toast.LENGTH_SHORT).show();
                startActivity(go2);
            }
        });
        weight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent go3 = new Intent(getApplicationContext(),MainActivity2_3.class );
                Toast.makeText(getApplicationContext(),"Manage weight!",Toast.LENGTH_SHORT).show();
                startActivity(go3);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Exit",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        mp3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent go4 =new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.melon.com/"));
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.netease.cloudmusic");
                if(launchIntent != null){
                    startActivity(launchIntent);
                }

                Toast.makeText(getApplicationContext(),"Play Music!",Toast.LENGTH_SHORT ).show();
                //startActivity(go4);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(getApplicationContext(),LoginActivity.class );
                Toast.makeText(getApplicationContext(),"Login",Toast.LENGTH_SHORT).show();
                startActivity(LoginIntent);
            }
        });

    }

}
