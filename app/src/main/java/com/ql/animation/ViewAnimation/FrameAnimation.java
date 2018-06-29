package com.ql.animation.ViewAnimation;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.ql.animation.R;
import com.ql.animation.activity.FrameAnimationActivity;

/**
 * Author: ql
 * Date: 2018/gif_6/26
 * Desc: 帧动画
 * 1.XML
 * 2.Java
 */
public class FrameAnimation {

    public void xml(ImageView iv) {
        iv.setImageResource(R.drawable.anim_frame);
        AnimationDrawable animationDrawable = (AnimationDrawable) iv.getDrawable();
        animationDrawable.start();
    }

    public void java(ImageView iv, FrameAnimationActivity activity) {
        AnimationDrawable animationDrawable = new AnimationDrawable();

        for (int i = 1; i < 15; i++) {
            int id = activity.getResources().getIdentifier("gif_" + i, "drawable", activity.getPackageName());
            Drawable drawable = activity.getResources().getDrawable(id);
            animationDrawable.addFrame(drawable, 100);
        }

        iv.setImageDrawable(animationDrawable);
        animationDrawable.setOneShot(true);
        animationDrawable.start();
    }
}