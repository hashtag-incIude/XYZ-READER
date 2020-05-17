package com.ak.xyzreader.container;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.ak.xyzreader.R;

import java.util.ArrayList;
import java.util.List;

public class BodyAdapter extends RecyclerView.Adapter<BodyAdapter.BodyHolder> {
    private List<String> list = new ArrayList<>();

    @Override
    public BodyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.text_item, parent, false);
        return new BodyHolder(v);
    }

    @Override
    public void onBindViewHolder(BodyHolder holder, int position) {
        holder.bodyView.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        if(list==null){
            return 0;
        }
        //Log.d("Test","Size Test:"+ list.size());
        return list.size();
    }

    public void setViewData(List<String> strings) {
        list.addAll(strings);
        notifyDataSetChanged();
    }

    public class BodyHolder extends RecyclerView.ViewHolder{
        TextView bodyView;
        public BodyHolder(View itemView) {
            super(itemView);
            bodyView = (TextView) itemView.findViewById(R.id.article_body);
            bodyView.setTypeface(Typeface.createFromAsset(itemView.getResources().getAssets(), "Historia-Demo.ttf"));
        }
    }
}

