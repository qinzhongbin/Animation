package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/6/26
 * Desc: activity出入动画
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}