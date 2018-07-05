package com.ql.animation.PropertyAnimation;

import android.view.View;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: 装饰者模式,给View自定义get和set.
 */
public class ViewWrapper {
    private View target;

    public ViewWrapper(View target) {
        this.target = target;
    }

    public int getWidth() {
        return target.getLayoutParams().width;
    }

    public void setWidth(int width) {
        target.getLayoutParams().width = width;
        target.requestLayout();
    }
}