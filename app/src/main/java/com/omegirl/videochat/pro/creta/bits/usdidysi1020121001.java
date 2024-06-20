package com.omegirl.videochat.pro.creta.bits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.omegirl.videochat.pro.R;

import java.util.ArrayList;

public class usdidysi1020121001 extends RecyclerView.Adapter<usdidysi1020121001.ButtonsViewHolder> {
    private ArrayList<cbxcbjhcxc001201201> mList = new ArrayList<>();
    private ItemClickListener onItemClickListener;

    public interface ItemClickListener {
        void onItemClick(View view, int i);
    }

    public void setData(ArrayList<cbxcbjhcxc001201201> arrayList) {
        mList = arrayList;
        notifyDataSetChanged();
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        onItemClickListener = itemClickListener;
    }

    @Override
    public ButtonsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ButtonsViewHolder(
            LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cyan_item_winner, viewGroup, false)
        );
    }

    @Override
    public void onBindViewHolder(ButtonsViewHolder buttonsViewHolder, int i) {
        buttonsViewHolder.txt1.setText(mList.get(i).winner_name);
        buttonsViewHolder.txt2.setText(mList.get(i).winner_amount);
        buttonsViewHolder.txt3.setText(mList.get(i).winner_title);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ButtonsViewHolder extends RecyclerView.ViewHolder {
        private TextView txt1;
        private TextView txt2;
        private TextView txt3;

        public ButtonsViewHolder(View view) {
            super(view);
            txt1 = view.findViewById(R.id.txt1);
            txt2 = view.findViewById(R.id.txt2);
            txt3 = view.findViewById(R.id.txt3);
        }
    }
}

