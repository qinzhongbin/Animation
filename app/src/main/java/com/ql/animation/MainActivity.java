package com.ql.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.animationView);

        view.startAnimation(viewAnimation());
    }

    private Animation viewAnimation() {
        ViewAnimation viewAnimation = new ViewAnimation(this);

//        return viewAnimation.translate_xml();
//        return viewAnimation.rotate_xml();
//        return viewAnimation.scale_java();
//        return viewAnimation.alpha_java();
        return viewAnimation.set_xml();
    }

    @Override
    public void finish() {
        super.finish();
    }
}