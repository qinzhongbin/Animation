package com.ql.animation.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.ql.animation.PropertyAnimation.ValueAnimator;

/**
 * Author: ql
 * Date: 2018/7/3
 * Desc: 自定义的动画圆
 */
public class AnimatorCircle extends View {

    private Paint paint;
    private ValueAnimator.Point currentPoint;

    public AnimatorCircle(Context context) {
        this(context, null);
    }

    public AnimatorCircle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimatorCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setAntiAlias(true);

        android.animation.ValueAnimator animator = new ValueAnimator().ofObject();
        animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(android.animation.ValueAnimator animation) {
                currentPoint = (ValueAnimator.Point) animation.getAnimatedValue();
                invalidate();
            }
        });
        animator.setDuration(1000 * 3);
        animator.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(currentPoint.getX(), currentPoint.getY(), 50, paint);
    }
}