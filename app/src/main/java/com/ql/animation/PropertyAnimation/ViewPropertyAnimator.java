package com.ql.animation.PropertyAnimation;

import android.view.View;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: ViewPropertyAnimator
 * 简便的View属性动画,平移旋转缩放透明度.
 * 链式调用,同时进行.
 * 自动开始.
 */
public class ViewPropertyAnimator {
    public void animate(View view) {
//        view.animate().translationX(600);
        view.animate().x(600).y(600).alpha(0.5f).scaleX(0.5f).scaleY(0.5f).setDuration(3000);
    }
}