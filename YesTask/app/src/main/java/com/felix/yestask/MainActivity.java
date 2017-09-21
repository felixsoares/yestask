package com.felix.yestask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.felix.yestask.code.model.UserModel;
import com.felix.yestask.code.ui.CardAdapter;
import com.felix.yestask.code.util.InteractionAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements InteractionAdapter{

    private RecyclerView mRecyclerView;
    private CardAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);

        //StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, layoutManager.getOrientation()));

        int resId = R.anim.layout_animation_from_bottom;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(this, resId);
        mRecyclerView.setLayoutAnimation(animation);

        mAdapter = new CardAdapter(this, getList(), this);
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<UserModel> getList(){
        List<UserModel> list = new ArrayList<>();
        list.add(new UserModel("Felix", "Anápolis", "é caindo que se aprende a andar", 23, false));
        list.add(new UserModel("Teste 1", "Anápolis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eu placerat lectus, ullamcorper porttitor leo. Nunc quis hendrerit mi, nec viverra nisl.", 23, true));
        list.add(new UserModel("Teste 2", "Anápolis", "Vivamus vitae vulputate orci", 23, true));
        list.add(new UserModel("Teste 3", "Anápolis", "Vivamus porta lacinia nisi, eleifend blandit massa lobortis non. Nunc quis velit id lorem aliquam convallis.", 2, false));
        list.add(new UserModel("Teste 4", "Anápolis", "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", 23, true));
        list.add(new UserModel("Felix", "Anápolis", "é caindo que se aprende a andar", 23, false));
        return list;
    }

    @Override
    public void onClickItem(View view, int position) {
        mAdapter.checkUncheck(position);
    }
}
