package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;

import com.ql.animation.R;
import com.ql.animation.ViewAnimation.TweenAnimation;

/**
 * Author: ql
 * Date: 2018/gif_6/26
 * Desc: 补间动画
 */
public class TweenAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        View view = findViewById(R.id.animationView);

        view.startAnimation(viewAnimation());
    }

    private Animation viewAnimation() {
        TweenAnimation tweenAnimation = new TweenAnimation(this);

//        return tweenAnimation.translate_xml();
//        return tweenAnimation.rotate_xml();
//        return tweenAnimation.scale_java();
//        return tweenAnimation.alpha_java();
        return tweenAnimation.set_xml();
    }
}