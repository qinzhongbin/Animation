package com.ql.animation.ViewAnimation;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/gif_6/25
 * Desc: 补间动画
 * gif_1.旋转
 * AnimationUtils.loadAnimation(Context context, @AnimRes int id) --> translateAnimation.set... --> View.startAnimation(Animation animation)
 * new TranslateAnimation(float fromXDelta, float toXDelta, float fromYDelta, float toYDelta) --> translateAnimation.set... --> View.startAnimation(Animation animation)
 * gif_2.缩放
 * AnimationUtils.loadAnimation(Context context, @AnimRes int id) --> scaleAnimation.set... --> View.startAnimation(Animation animation)
 * new ScaleAnimation(float fromX, float toX, float fromY, float toY, int pivotXType, float pivotXValue, int pivotYType, float pivotYValue) --> scaleAnimation.set... --> View.startAnimation(Animation animation)
 * gif_3.旋转
 * AnimationUtils.loadAnimation(Context context, @AnimRes int id) --> rotateAnimation.set... --> View.startAnimation(Animation animation)
 * new RotateAnimation(float fromDegrees, float toDegrees, int pivotXType, float pivotXValue,int pivotYType, float pivotYValue) --> rotateAnimation.set... --> View.startAnimation(Animation animation)
 * gif_4.透明度
 * AnimationUtils.loadAnimation(Context context, @AnimRes int id) --> alphaAnimation.set... --> View.startAnimation(Animation animation)
 * new AlphaAnimation(float fromAlpha, float toAlpha) --> alphaAnimation.set... --> View.startAnimation(Animation animation)
 * <p>
 * 组合
 * AnimationUtils.loadAnimation(Context context, @AnimRes int id) --> animationSet.set... --> View.startAnimation(Animation animation)
 * new AnimationSet(boolean shareInterpolator) --> animationSet.addAnimation(Animation a)... --> animationSet.set... --> View.startAnimation(Animation animation)
 */
public class TweenAnimation {
    private final Context context;

    public TweenAnimation(Context context) {
        this.context = context;
    }

    public Animation set_java() {
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translate_java());
        animationSet.addAnimation(scale_java());
        animationSet.addAnimation(rotate_java());
        animationSet.addAnimation(alpha_java());
        return animationSet;
    }

    public Animation set_xml() {
        return AnimationUtils.loadAnimation(context, R.anim.set);
    }

    public Animation alpha_java() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(1000 * 3);
        return alphaAnimation;
    }

    public Animation alpha_xml() {
        return AnimationUtils.loadAnimation(context, R.anim.alpha);
    }

    public Animation rotate_java() {
        RotateAnimation rotateAnimation = new RotateAnimation(0f, 270f, 20f, 20f);
        rotateAnimation.setDuration(1000 * 3);
        return rotateAnimation;
    }

    public Animation rotate_xml() {
        return AnimationUtils.loadAnimation(context, R.anim.rotate);
    }

    public Animation scale_java() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 3, 0, 3, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(1000 * 2);
        return scaleAnimation;
    }

    public Animation scale_xml() {
        return AnimationUtils.loadAnimation(context, R.anim.scale);
    }

    public Animation translate_java() {
        TranslateAnimation translateAnimation = new TranslateAnimation(200, 600, 500, 1000);
        translateAnimation.setDuration(1000 * 3);
        return translateAnimation;
    }

    public Animation translate_xml() {
        return AnimationUtils.loadAnimation(context, R.anim.translate);
    }
}