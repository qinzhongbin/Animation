package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ql.animation.PropertyAnimation.AnimatorSet;
import com.ql.animation.R;

public class AnimatorSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator_set);


        Button bt = (Button) findViewById(R.id.bt);

        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.set_java(bt);
        animatorSet.set_xml(this, bt);
    }
}