package com.ql.animation.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: ObjectAnimatorActivity
 */
public class ObjectAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);

        com.ql.animation.PropertyAnimation.ObjectAnimator objectAnimator = new com.ql.animation.PropertyAnimation.ObjectAnimator();
//        TextView textView = findViewById(R.id.tv);
//        objectAnimator.xml(this, textView);
//        objectAnimator.java(textView);
//        objectAnimator.custom_getAndSet_customView((ObjectAnimatorCircle) findViewById(R.id.circle));
        objectAnimator.custom_getAndSet_wrapperView((Button) findViewById(R.id.bt));
    }
}