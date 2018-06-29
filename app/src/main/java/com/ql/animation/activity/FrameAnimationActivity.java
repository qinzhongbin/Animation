package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.ql.animation.R;
import com.ql.animation.ViewAnimation.FrameAnimation;

/**
 * Author: ql
 * Date: 2018/6/29
 * Desc: 帧动画
 */
public class FrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fram_animation);

        ImageView iv = findViewById(R.id.iv);


        FrameAnimation frameAnimation = new FrameAnimation();

//        frameAnimation.xml(iv);
        frameAnimation.java(iv, this);
    }
}