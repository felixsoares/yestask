package com.felix.yestask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.felix.yestask.code.model.UserModel;
import com.felix.yestask.code.ui.CardAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private CardAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new CardAdapter(getList());
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<UserModel> getList(){
        List<UserModel> list = new ArrayList<>();
        list.add(new UserModel("Felix", "Anápolis", "é caindo que se aprende a andar", 23));
        list.add(new UserModel("Teste 1", "Anápolis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eu placerat lectus, ullamcorper porttitor leo. Nunc quis hendrerit mi, nec viverra nisl.", 23));
        list.add(new UserModel("Teste 2", "Anápolis", "Vivamus vitae vulputate orci", 23));
        list.add(new UserModel("Teste 3", "Anápolis", "Vivamus porta lacinia nisi, eleifend blandit massa lobortis non. Nunc quis velit id lorem aliquam convallis.", 23));
        list.add(new UserModel("Teste 4", "Anápolis", "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", 23));
        list.add(new UserModel("Felix", "Anápolis", "é caindo que se aprende a andar", 23));
        list.add(new UserModel("Teste 1", "Anápolis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eu placerat lectus, ullamcorper porttitor leo. Nunc quis hendrerit mi, nec viverra nisl.", 23));
        list.add(new UserModel("Teste 2", "Anápolis", "Vivamus vitae vulputate orci", 23));
        list.add(new UserModel("Teste 3", "Anápolis", "Vivamus porta lacinia nisi, eleifend blandit massa lobortis non. Nunc quis velit id lorem aliquam convallis.", 23));
        list.add(new UserModel("Teste 4", "Anápolis", "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", 23));
        return list;
    }
}
