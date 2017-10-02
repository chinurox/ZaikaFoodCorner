

package com.example.gargc.zaikafoodcorner.ViewHolder;

        import android.content.Context;
        import android.graphics.Color;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.amulyakhare.textdrawable.TextDrawable;
        import com.example.gargc.zaikafoodcorner.Interface.ItemClickListener;
        import com.example.gargc.zaikafoodcorner.Model.Order;
        import com.example.gargc.zaikafoodcorner.R;

        import java.text.NumberFormat;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Locale;

/**
 * Created by gargc on 27-09-2017.
 */

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CardViewHolder>{

    List<Order> listData=new ArrayList<>();

    public CartAdapter(List<Order> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    Context context;


    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.cartlayout,parent,false);
        return  new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        TextDrawable drawable= TextDrawable.builder().buildRound(""+listData.get(position).getQuantity(), Color.RED);
        holder.imag_cart_count.setImageDrawable(drawable);

        Locale locale=new Locale("en","US");
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance(locale);
        int price=(Integer.parseInt(listData.get(position).getPrice()))*(Integer.parseInt(listData.get(position).getQuantity()));
        holder.txt_price.setText(numberFormat.format(price));
        holder.txt_cart_name.setText(listData.get(position).getProductName());



    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txt_cart_name, txt_price;
    public ImageView imag_cart_count;

    ItemClickListener itemClickListener;

    public void setTxt_cart_name(TextView txt_cart_name) {
        this.txt_cart_name = txt_cart_name;
    }


    public CardViewHolder(View itemView) {
        super(itemView);
        txt_cart_name = (TextView) itemView.findViewById(R.id.cart_item_name);
        txt_price = (TextView) itemView.findViewById(R.id.cart_item_Price);
        imag_cart_count = (ImageView) itemView.findViewById(R.id.card_item_count);
    }

    @Override
    public void onClick(View view) {

    }
}


}
