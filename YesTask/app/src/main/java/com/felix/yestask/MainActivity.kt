package com.felix.yestask

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.animation.AnimationUtils
import com.felix.yestask.code.model.TestModel
import com.felix.yestask.code.ui.CardAdapter
import com.felix.yestask.code.util.InteractionAdapter
import com.felix.yestask.scene.form.FormActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener ,InteractionAdapter {

    private lateinit var adapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mRecyclerView = findViewById(R.id.mRecyclerView) as RecyclerView

        val layoutManager = LinearLayoutManager(this)
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.addItemDecoration(DividerItemDecoration(this, layoutManager.orientation))

        val animation = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_from_bottom)
        mRecyclerView.layoutAnimation = animation

        adapter = CardAdapter(this, getList(), this)
        mRecyclerView.adapter = adapter

        fabAdd.setOnClickListener(this)
    }

    private fun getList(): MutableList<TestModel> {
        val list = mutableListOf<TestModel>()
        list.add(TestModel("Felix", "Anápolis", "é caindo que se aprende a andar", 14, false))
        list.add(TestModel("Teste 1", "Anápolis", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean eu placerat lectus, ullamcorper porttitor leo. Nunc quis hendrerit mi, nec viverra nisl.", 10, true))
        list.add(TestModel("Teste 2", "Anápolis", "Vivamus vitae vulputate orci", 23, true))
        list.add(TestModel("Teste 3", "Anápolis", "Vivamus porta lacinia nisi, eleifend blandit massa lobortis non. Nunc quis velit id lorem aliquam convallis.", 2, false))
        list.add(TestModel("Teste 4", "Anápolis", "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", 23, true))
        list.add(TestModel("Felix", "Anápolis", "é caindo que se aprende a andar", 80, false))
        return list
    }

    override fun onClickItem(view : View?, position: Int) {
        adapter.checkUncheck(position)
    }

    override fun onClick(p0: View?) {
        startActivity(Intent(this, FormActivity::class.java))
    }
}
