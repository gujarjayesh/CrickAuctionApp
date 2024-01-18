package com.js.crickauctionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.icspl.crickauctionapp.R;
import com.js.crickauctionapp.RegisterActivity.RegistrationActivity;

public class SplashActivity extends AppCompatActivity {

    ImageView autionSplashImg;
    TextView splashCrikAutionTxt;
    ObjectAnimator animator;
    LottieAnimationView splashHammer;
    private static final int SPLASH_TIMEOUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        autionSplashImg = findViewById(R.id.autionSplashImg);
        splashCrikAutionTxt = findViewById(R.id.splashCrikAutionTxt);
        splashHammer = findViewById(R.id.splashHammer);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the splash timeout
                Intent intent = new Intent(SplashActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
    @Override
    protected void onStart() {
        super.onStart();

        animator = ObjectAnimator.ofFloat(splashCrikAutionTxt, "translationY", -1050f);
        animator.setDuration(2000);
        animator.start();
        splashHammer.animate().getStartDelay();
    }
}