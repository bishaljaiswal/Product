package com.example.hp.product;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 07-12-2016.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {
    ArrayList<Data> arrayList;
    Context context;

    public Adapter(ArrayList<Data> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.second, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        Data data = arrayList.get(position);
        holder.btnTab.setText(data.getNo());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        Button btnTab;
        public MyHolder(View itemView) {
            super(itemView);

            btnTab = (Button) itemView.findViewById(R.id.btnTab);
        }
    }
}
