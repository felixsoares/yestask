package com.felix.yestask.code.ui;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.felix.yestask.R;
import com.felix.yestask.code.model.UserModel;
import com.felix.yestask.code.util.InteractionAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CardAdapter extends RecyclerView.Adapter<CardHolder> {

    private final List<UserModel> mUsers;
    private InteractionAdapter interactionAdapter;
    private Context context;

    public CardAdapter(Context context, List<UserModel> users, InteractionAdapter interactionAdapter) {
        this.context = context;
        this.mUsers = users;
        this.interactionAdapter = interactionAdapter;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CardHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_line_view, parent, false), interactionAdapter);
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        UserModel user = mUsers.get(position);

        holder.title.setText(user.getDescription());
        holder.category.setText(user.getCity());
        holder.timeClock.setText(user.getAge()+":00");

        if(user.isCheck()){
            holder.imgCheck.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.circle_2));
        }else{
            holder.imgCheck.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.circle_1));
        }
    }

    @Override
    public int getItemCount() {
        return mUsers != null ? mUsers.size() : 0;
    }

    private void insertItem(UserModel user) {
        mUsers.add(user);
        notifyItemInserted(getItemCount());
    }

    private void updateItem(int position) {
        mUsers.get(position).incrementAge();
        notifyItemChanged(position);
    }

    private void removerItem(int position) {
        mUsers.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mUsers.size());
    }

    public void updateList(UserModel user) {
        insertItem(user);
    }

    public void checkUncheck(int position){
        if (mUsers.get(position) != null){
            if(mUsers.get(position).isCheck()){
                mUsers.get(position).setCheck(false);
            }else{
                mUsers.get(position).setCheck(true);
            }
            notifyItemChanged(position);
        }
    }

}

