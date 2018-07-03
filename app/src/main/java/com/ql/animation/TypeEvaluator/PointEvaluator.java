package com.ql.animation.TypeEvaluator;

import android.animation.TypeEvaluator;

import com.ql.animation.PropertyAnimation.ValueAnimator;

/**
 * Author: ql
 * Date: 2018/7/3
 * Desc: 自定义的圆点坐标估值器
 */
public class PointEvaluator implements TypeEvaluator<ValueAnimator.Point> {
    @Override
    public ValueAnimator.Point evaluate(float fraction, ValueAnimator.Point startValue, ValueAnimator.Point endValue) {
        float x = startValue.getX() + fraction * (endValue.getX() - startValue.getX());
        float y = startValue.getY() + fraction * (endValue.getY() - startValue.getY());
        return new ValueAnimator.Point(x, y);
    }
}