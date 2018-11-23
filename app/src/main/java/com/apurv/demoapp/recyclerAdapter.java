package com.apurv.demoapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.apurv.demoapp.pojos.Photo;
import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.recentsViewHolder> {

    ArrayList<Photo> arr;
    Context context;
    public recyclerAdapter(Context context, ArrayList<Photo> arr) {
    this.context=context;
    this.arr=arr;
    }

    @NonNull
    @Override
    public recentsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        view=inflater.inflate(R.layout.layout_recents,viewGroup,false);
        return new recentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recentsViewHolder recentsViewHolder, int i) {
        if(arr.get(i).getUrlS()!=null) {
            Uri uri = Uri.parse(arr.get(i).getUrlS());
            Log.d("t2", uri.toString());
            Glide.with(context)
                    .load(uri)
                    .into(recentsViewHolder.image);
            recentsViewHolder.title.setText("Id:"+arr.get(i).getId());
        }
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class recentsViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        ImageView image;
        public recentsViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.recentImage);
            title=itemView.findViewById(R.id.title);
        }
    }


}
