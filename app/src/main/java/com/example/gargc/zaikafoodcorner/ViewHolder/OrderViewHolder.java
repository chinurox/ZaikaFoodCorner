package com.example.gargc.zaikafoodcorner.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.gargc.zaikafoodcorner.Interface.ItemClickListener;
import com.example.gargc.zaikafoodcorner.R;

/**
 * Created by gargc on 27-09-2017.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txt_OrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;

    ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txt_OrderId=(TextView) itemView.findViewById(R.id.order_id);
        txtOrderAddress=(TextView) itemView.findViewById(R.id.orderaddress);
        txtOrderStatus=(TextView)  itemView.findViewById(R.id.orderstatus);
        txtOrderPhone=(TextView) itemView.findViewById(R.id.orderphone);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}
