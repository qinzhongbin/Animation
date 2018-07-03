package com.ql.animation.PropertyAnimation;

import android.animation.AnimatorInflater;
import android.widget.TextView;

import com.ql.animation.R;
import com.ql.animation.TypeEvaluator.PointEvaluator;
import com.ql.animation.activity.ValueAnimatorActivity;

/**
 * Author: ql
 * Date: 2018/6/29
 * Desc: ValueAnimator
 */
public class ValueAnimator {

    public void ofInt_xml(ValueAnimatorActivity activity, final TextView tv) {
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) AnimatorInflater.loadAnimator(activity, R.animator.of_int);

        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                tv.getLayoutParams().width = (int) animation.getAnimatedValue();
                tv.requestLayout();
            }
        });

        valueAnimator.start();
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

    public void ofFloat_xml(ValueAnimatorActivity activity, final TextView tv) {
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) AnimatorInflater.loadAnimator(activity, R.animator.of_float);

        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                float animatedValue = (float) animation.getAnimatedValue();
                tv.setText(String.valueOf(animatedValue));
            }
        });

        valueAnimator.start();
    }

    public void ofFloat_java(final TextView tv) {
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


    public android.animation.ValueAnimator ofObject() {
        return android.animation.ValueAnimator.ofObject(new PointEvaluator(), new Point(100, 100), new Point(400, 900));
    }

    public static class Point {
        float x;
        float y;

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }
    }
}