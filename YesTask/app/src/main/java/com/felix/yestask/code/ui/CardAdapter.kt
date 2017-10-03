package com.felix.yestask.code.ui

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.felix.yestask.R
import com.felix.yestask.code.model.TestModel
import com.felix.yestask.code.util.InteractionAdapter

/**
 * Created by user on 03/10/2017.
 */
class CardAdapter(private var context: Context, private var mUsers: MutableList<TestModel>, private var interactionAdapter: InteractionAdapter) : RecyclerView.Adapter<CardHolder>() {

    override fun getItemCount(): Int {
        return mUsers.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CardHolder {
        return CardHolder(LayoutInflater.from(parent?.context).inflate(R.layout.main_line_view, parent, false), interactionAdapter)
    }

    override fun onBindViewHolder(holder: CardHolder?, position: Int) {
        val user = mUsers[position]

        holder?.title?.text = user.description
        holder?.category?.text = user.city
        holder?.timeClock?.text = user.age.toString() + ":00"

        if (user.check) {
            holder?.imgCheck?.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.circle_2))
        } else {
            holder?.imgCheck?.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.circle_1))
        }
    }

    private fun insertItem(user: TestModel) {
        mUsers.add(user)
        notifyItemInserted(itemCount)

        updateCheckedPositions()
    }

    private fun updateItem(position: Int, testModel: TestModel) {
        mUsers.add(position, testModel)
        notifyItemChanged(position)

        updateCheckedPositions()
    }

    private fun removerItem(position: Int) {
        mUsers.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, mUsers.size)

        updateCheckedPositions()
    }

    fun checkUncheck(position: Int) {
        mUsers[position].check = !mUsers[position].check
        notifyItemChanged(position)

        updateCheckedPositions()
    }

    fun updateCheckedPositions(){
        mUsers.sortBy { it.check }
        notifyDataSetChanged()
    }


}