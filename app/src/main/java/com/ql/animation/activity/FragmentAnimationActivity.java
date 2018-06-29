package com.ql.animation.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/gif_6/26
 * Desc: fragment出入动画
 * getSupportFragmentManager.setCustomAnimations(int enter, int exit)
 */
public class FragmentAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_animation);

        FragmentManager sfm = getSupportFragmentManager();
        final FragmentTransaction ft = sfm.beginTransaction();

        ft.setCustomAnimations(R.anim.slide_in_from_right, R.anim.slide_out_to_left);

        final BlankFragment blankFragment = new BlankFragment();

        ft.add(R.id.container, blankFragment);
        ft.commit();

        // TODO: 2018/gif_6/28 Fragment使用

//        blankFragment.getView().setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ft.remove(blankFragment);
//            }
//        });


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                ft.remove(blankFragment);
//
//                    }
//                });
//            }
//        }, 2000);
    }
}