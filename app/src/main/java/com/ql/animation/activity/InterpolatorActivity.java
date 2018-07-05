package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ql.animation.Interpolator.BaseInterpolator;
import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: 插值器
 */
public class InterpolatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpolator);

        TextView tv = findViewById(R.id.tv);
        BaseInterpolator baseInterpolator = new BaseInterpolator();
//        tv.animate().x(900).setDuration(3000).setInterpolator(baseInterpolator.linear());
//        tv.animate().x(900).setDuration(3000).setInterpolator(baseInterpolator.accelerate());
//        tv.animate().translationX(400).setDuration(1000 * 2).setInterpolator(baseInterpolator.overshoot());
//        tv.animate().translationX(400).setDuration(1000 * 2).setInterpolator(baseInterpolator.accelerateDecelerate());
//        tv.animate().translationX(400).setDuration(1000 * 2).setInterpolator(baseInterpolator.anticipateInterpolator());
        tv.animate().translationX(300).setDuration(1000 * 5).setInterpolator(baseInterpolator.path(1f, 2f));
    }
}