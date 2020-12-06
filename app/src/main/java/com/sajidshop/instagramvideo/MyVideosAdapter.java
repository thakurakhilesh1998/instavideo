package com.sajidshop.instagramvideo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.allattentionhere.autoplayvideos.AAH_CustomViewHolder;
import com.allattentionhere.autoplayvideos.AAH_VideosAdapter;

import java.util.ArrayList;

public class MyVideosAdapter extends AAH_VideosAdapter {

    private ArrayList<String> list;
    Context context;

    public  class MyViewHolder extends AAH_CustomViewHolder
    {
        final ImageView img_vol;

        public MyViewHolder(View x) {
            super(x);
            img_vol=x.findViewById(R.id.img_vol);
        }
    }
    public MyVideosAdapter(Context context, ArrayList<String> list)
    {
        this.list=list;
        this.context=context;
    }

    @Override
    public AAH_CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.video_view, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AAH_CustomViewHolder holder, int position) {
           holder.setImageUrl("https://picsum.photos/200");
           holder.setVideoUrl(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }
}

