package com.tcodng.kuraps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetStartedAct extends AppCompatActivity {
    Animation bottom_to_top,top_to_bottom,fade_in;
    ImageView app_logo, get_start_illu;
    TextView version, get_start_title;
    Button btn_register,btn_login;
    View overlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        bottom_to_top = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        top_to_bottom = AnimationUtils.loadAnimation(this, R.anim.top_to_bottom);
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        overlay  = findViewById(R.id.overlay);
        app_logo  = findViewById(R.id.app_logo);
        get_start_illu  = findViewById(R.id.get_start_illu);
        version  = findViewById(R.id.version);
        get_start_title  = findViewById(R.id.get_start_title);
        btn_login  = findViewById(R.id.btn_login);
        btn_register  = findViewById(R.id.btn_register);

        app_logo.startAnimation(top_to_bottom);
        get_start_illu.startAnimation(top_to_bottom);
        get_start_title.startAnimation(top_to_bottom);

        btn_login.startAnimation(bottom_to_top);
        btn_register.startAnimation(bottom_to_top);
        version.startAnimation(bottom_to_top);

        overlay.startAnimation(fade_in);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn = new Intent(GetStartedAct.this, SignInAct.class);
                startActivity(signIn);
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regist = new Intent(GetStartedAct.this, RegisterAct.class);
                startActivity(regist);
            }
        });


    }
}