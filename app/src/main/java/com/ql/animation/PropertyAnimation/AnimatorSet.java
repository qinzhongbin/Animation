package com.ql.animation.PropertyAnimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.widget.Button;

import com.ql.animation.R;
import com.ql.animation.activity.AnimatorSetActivity;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: AnimatorSet
 * AnimatorSet.play(Animator anim)
 * Builder.with(Animator anim)
 * Builder.after(long delay)
 * Builder.after(Animator anim)
 * Builder.before(Animator anim)
 */
public class AnimatorSet {
    public void set_java(Button bt) {
        ObjectAnimator translationX = ObjectAnimator.ofFloat(bt, "translationX", 0f, 900f);
        ObjectAnimator rotation = ObjectAnimator.ofFloat(bt, "rotation", 0f, 270f);
        ObjectAnimator alpha = ObjectAnimator.ofFloat(bt, "alpha", 0f, 1f, 0f, 1f);

        android.animation.AnimatorSet set = new android.animation.AnimatorSet();
        set.play(translationX).with(rotation).before(alpha);
        set.setDuration(5000).start();
    }

    public void set_xml(AnimatorSetActivity activity, Button bt) {
        Animator animator = AnimatorInflater.loadAnimator(activity, R.animator.set);
        animator.setTarget(bt);
        animator.start();
    }
}
