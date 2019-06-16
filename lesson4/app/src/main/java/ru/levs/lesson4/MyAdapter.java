package ru.levs.lesson4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
   // private String[] mDataset;
    //private LayoutInflater inflater;
    private List<Block> blocks;

    MyAdapter(Context context, List<Block> blocks){
        this.blocks = blocks;
        //this.inflater = LayoutInflater.from(context);
    }

        @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_text, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //holder.textView.setText(mDataset[position]);
        Block block = blocks.get(position);
        holder.imageView.setImageResource(block.getImage());
        holder.textTitleView.setText(block.getTextTitle());
        holder.textNotifyView.setText(block.getTextNotify());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return blocks.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

       final ImageView imageView;
       final TextView textTitleView, textNotifyView;

        public MyViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.image);
            textTitleView = v.findViewById(R.id.textViewTitle);
            textNotifyView = v.findViewById(R.id.textViewNot);
        }

       // public void bind(String data) {
       //     textView.setText(data);
       // }
    }

   // public MyAdapter(String[] myDataset) {
   //     mDataset = myDataset;
   // }
}