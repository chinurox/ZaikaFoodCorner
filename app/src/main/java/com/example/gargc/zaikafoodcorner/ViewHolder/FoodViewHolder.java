package com.example.gargc.zaikafoodcorner.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gargc.zaikafoodcorner.Interface.ItemClickListener;
import com.example.gargc.zaikafoodcorner.R;

/**
 * Created by gargc on 26-09-2017.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView food_name;
    public ImageView food_image;

    private ItemClickListener itemClickListener;

    public FoodViewHolder(View itemView) {
        super(itemView);

        food_image=(ImageView) itemView.findViewById(R.id.food_image);
        food_name=(TextView) itemView.findViewById(R.id.food_name);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
