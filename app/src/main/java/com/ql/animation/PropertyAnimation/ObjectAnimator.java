package com.ql.animation.PropertyAnimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.widget.Button;
import android.widget.TextView;

import com.ql.animation.CustomView.ObjectAnimatorCircle;
import com.ql.animation.R;
import com.ql.animation.TypeEvaluator.WidthEvaluator;
import com.ql.animation.activity.ObjectAnimatorActivity;

/**
 * Author: ql
 * Date: 2018/7/4
 * Desc: ObjectAnimator
 * ObjectAnimator先改变值,然后自动赋值给对象的属性从而实现动画.
 * 自动赋值的本质是调用该对象属性的get和set方法.若View本身没有这两个方法或者不能实现动画,有两种处理方式:
 * 1.继承原始类,直接给类加上该属性的get和set.
 * 2.包装对象,间接给对象加上该属性的get和set.
 * <p>
 * ofInt(Object target, String propertyName, int... values)
 * ofFloat(Object target, String propertyName, float... values)
 * ofObject(Object target, String propertyName, TypeEvaluator evaluator, Object... values)  没有默认估值器, 需实现.
 */
public class ObjectAnimator {
    public void xml(ObjectAnimatorActivity activity, TextView textView) {
//        不用强转
        Animator animator = AnimatorInflater.loadAnimator(activity, R.animator.obj);
        animator.setTarget(textView);
        animator.start();
    }

    public void java(TextView textView) {
        ValueAnimator animator = android.animation.ObjectAnimator.ofFloat(textView, "scaleX", 0f, 2f, 1f);
        animator.setDuration(3000);
        animator.start();
    }

    public void custom_getAndSet_customView(ObjectAnimatorCircle circle) {
        android.animation.ObjectAnimator.ofFloat(circle, "r", 0f, 300f, 100f).setDuration(1000 * 3).start();
    }

    public void custom_getAndSet_wrapperView(Button bt) {
        ViewWrapper viewWrapper = new ViewWrapper(bt);
        android.animation.ObjectAnimator.ofObject(viewWrapper, "width", new WidthEvaluator(), 0, 500, 200).setDuration(3000).start();
    }
}