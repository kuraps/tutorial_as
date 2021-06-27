package com.tcodng.kuraps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {
    Animation fade_in;
    ImageView app_logo;
    TextView app_desc, app_version;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        app_logo = findViewById(R.id.app_logo);
        app_desc = findViewById(R.id.app_desc);
        app_version = findViewById(R.id.app_version);

        app_logo.startAnimation(fade_in);
        app_desc.startAnimation(fade_in);
        app_version.startAnimation(fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainAct = new Intent(SplashAct.this, GetStartedAct.class);
                startActivity(mainAct);
                finish();
            }
        }, 2000);

    }
}