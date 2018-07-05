package com.ql.animation.Interpolator;

import android.animation.TimeInterpolator;
import android.os.Build;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: 系统内置插值器
 * 参考:https://blog.csdn.net/lgaojiantong/article/details/39451243
 * 参考:https://blog.csdn.net/u013279866/article/details/70142976
 */
public class BaseInterpolator {
    //    匀速
    public TimeInterpolator linear() {
        return new LinearInterpolator();
    }

    //    加速
    public TimeInterpolator accelerate() {
        return new AccelerateInterpolator();
    }

    //    减速
    public TimeInterpolator decelerate() {
        return new DecelerateInterpolator();
    }

    //    先加速再减速
    public TimeInterpolator accelerateDecelerate() {
        return new AccelerateDecelerateInterpolator();
    }

    //    回弹
    public TimeInterpolator bounce() {
        return new BounceInterpolator();
    }

    //    先后退再甩出
    public TimeInterpolator anticipateInterpolator() {
        return new AnticipateInterpolator();
    }

    //    先甩出到达终点后再返回一小段
    public TimeInterpolator overshoot() {
        return new OvershootInterpolator();
    }

    //    先后退再甩出到达终点后再返回一小段
    public TimeInterpolator anticipateOvershoot() {
        return new AnticipateOvershootInterpolator();
    }

    //    速度随正弦函数变化, cycles为循环次数.
    public TimeInterpolator cycle(float cycles) {
        return new CycleInterpolator(cycles);
    }

    //    速度随贝塞尔曲线变化
    public TimeInterpolator path(float controlX, float controlY) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return new PathInterpolator(controlX, controlY);
        }
        return null;
    }
}