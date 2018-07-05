package com.ql.animation.TypeEvaluator;

import android.animation.TypeEvaluator;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: view宽度的估值器
 */
public class WidthEvaluator implements TypeEvaluator<Integer> {
    @Override
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int diff = endValue - startValue;
        return ((int) (startValue + diff * fraction));
    }
}