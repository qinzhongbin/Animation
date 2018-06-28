package com.ql.animation.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;

import com.ql.animation.R;

/**
 * Author: ql
 * Date: 2018/6/28
 * Desc: ViewGroup子元素动画
 * 1.XML
 * 2.Java
 */
public class ViewGroupChildAnimationActivity extends AppCompatActivity {
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group_child_animation);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter() {

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new VH(getLayoutInflater().inflate(android.R.layout.simple_list_item_1, null, false));
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                VH h = (VH) holder;

                h.text.setText(String.valueOf(++i));
            }

            @Override
            public int getItemCount() {
                return 100;
            }
        });

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.child_anim);
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animation);
        layoutAnimationController.setOrder(LayoutAnimationController.ORDER_REVERSE);
        layoutAnimationController.setDelay(0.5f);
        recyclerView.setLayoutAnimation(layoutAnimationController);
    }

    class VH extends RecyclerView.ViewHolder {
        TextView text;

        VH(View itemView) {
            super(itemView);
            text = itemView.findViewById(android.R.id.text1);
        }
    }
}