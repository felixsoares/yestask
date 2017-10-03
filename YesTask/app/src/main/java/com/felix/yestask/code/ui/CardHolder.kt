package com.felix.yestask.code.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.felix.yestask.R
import com.felix.yestask.code.util.InteractionAdapter

/**
 * Created by user on 03/10/2017.
 */
class CardHolder(itemView: View, private val interactionAdapter: InteractionAdapter) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var title: TextView = itemView.findViewById(R.id.title)

    var category: TextView = itemView.findViewById(R.id.category)

    var timeClock: TextView = itemView.findViewById(R.id.timeClock)

    var imgCheck: ImageView = itemView.findViewById(R.id.imgCheck)

    init {
        this.imgCheck.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        interactionAdapter.onClickItem(view, adapterPosition)
    }
}
