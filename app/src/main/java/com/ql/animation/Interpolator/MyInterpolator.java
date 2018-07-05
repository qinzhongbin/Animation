package com.ql.animation.Interpolator;

import android.animation.TimeInterpolator;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: 自定义插值器
 * 动画的原理和精髓(插值器 估值器):
 * getInterpolation(float input)的返回值会传给估值器的fraction().
 * View根据估值器的evaluate(float fraction, Object startValue, Object endValue)的返回值进行动画.
 */
public class MyInterpolator implements TimeInterpolator {
    @Override
    public float getInterpolation(float input) {
//        balabla
        return 0;
    }
}