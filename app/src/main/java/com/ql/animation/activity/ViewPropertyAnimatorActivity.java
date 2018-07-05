package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ql.animation.PropertyAnimation.ViewPropertyAnimator;
import com.ql.animation.R;

public class ViewPropertyAnimatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_property_animator);

        View view = findViewById(R.id.view);

        ViewPropertyAnimator viewPropertyAnimator = new ViewPropertyAnimator();
        viewPropertyAnimator.animate(view);
    }
}
