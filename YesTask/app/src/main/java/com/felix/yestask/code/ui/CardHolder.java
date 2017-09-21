package com.felix.yestask.code.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.felix.yestask.R;
import com.felix.yestask.code.util.InteractionAdapter;

/**
 * Created by rafael on 15/11/16.
 */

public class CardHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private InteractionAdapter interactionAdapter;

    public TextView title;

    public TextView category;

    public TextView timeClock;

    public ImageView imgCheck;

    public CardHolder(View itemView, InteractionAdapter interactionAdapter) {
        super(itemView);
        this.interactionAdapter = interactionAdapter;
        this.title = itemView.findViewById(R.id.title);
        this.category = itemView.findViewById(R.id.category);
        this.timeClock = itemView.findViewById(R.id.timeClock);
        this.imgCheck = itemView.findViewById(R.id.imgCheck);
        this.imgCheck.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        interactionAdapter.onClickItem(view, getAdapterPosition());
    }
}