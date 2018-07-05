package com.ql.animation.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author: ql
 * Date: 2018/7/5
 * Desc: 使用ObjectAnimatorCircle自定义的动画圆
 */
public class ObjectAnimatorCircle extends View {

    float r;
    private Paint paint;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
        invalidate();
    }

    public ObjectAnimatorCircle(Context context) {
        this(context, null);
    }

    public ObjectAnimatorCircle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ObjectAnimatorCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(500, 800, r, paint);
    }
}