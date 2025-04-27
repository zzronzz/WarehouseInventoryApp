package com.zybooks.ronniecorpuzinventoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find the ImageView
        ImageView logoImage = findViewById(R.id.ivSplashLogo);

        // Load and apply the scale animation
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        if (scaleAnimation != null) {
            logoImage.startAnimation(scaleAnimation);
        } else {
            // If animation isn't loading, we'd see this in logcat
            System.out.println("Animation failed to load");
        }

        // Delay for 2 seconds, then start LoginActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 2 second delay
    }
}