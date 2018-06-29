package com.ql.animation.PropertyAnimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.widget.TextView;

import com.ql.animation.R;
import com.ql.animation.activity.ValueAnimatorActivity;

/**
 * Author: ql
 * Date: 2018/6/29
 * Desc: ValueAnimator
 */
public class ValueAnimator {

    public void ofInt_xml(ValueAnimatorActivity activity) {
        Animator animator = AnimatorInflater.loadAnimator(activity, R.animator.of_int);
        // TODO: 2018/6/29 怎么让tv动起来
    }

    public void ofInt_java(final TextView tv) {
        android.animation.ValueAnimator animator = android.animation.ValueAnimator.ofInt(0, 300);
        animator.setDuration(1000 * 3);
        animator.setStartDelay(0);
        animator.setRepeatCount(2);
        animator.setRepeatMode(android.animation.ValueAnimator.RESTART);
        animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                tv.getLayoutParams().width = (int) animation.getAnimatedValue();
                tv.requestLayout();
            }
        });

        animator.start();
    }

    public void ofFloat(final TextView tv) {
        android.animation.ValueAnimator animator = android.animation.ValueAnimator.ofFloat(0f, 1000f);
        animator.setDuration(1000 * 3);
        animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {

                tv.getLayoutParams().height = (int) (float) animation.getAnimatedValue();
                tv.requestLayout();
            }
        });

        animator.start();
    }
}