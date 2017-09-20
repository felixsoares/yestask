package com.felix.yestask.code.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.felix.yestask.R;

/**
 * Created by rafael on 15/11/16.
 */

public class CardHolder extends RecyclerView.ViewHolder {

    public TextView title;

    public TextView desc;

    public ImageButton moreButton;

    public ImageButton deleteButton;

    public CardHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        desc = itemView.findViewById(R.id.desc);
        moreButton = itemView.findViewById(R.id.moreButton);
        deleteButton = itemView.findViewById(R.id.deleteButton);
    }
}