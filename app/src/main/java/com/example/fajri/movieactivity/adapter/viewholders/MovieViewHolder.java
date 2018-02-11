package com.example.fajri.movieactivity.adapter.viewholders;

/**
 * Created by fajri on 1/28/18.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.fajri.movieactivity.R;


public class MovieViewHolder extends RecyclerView.ViewHolder {


    public ImageView gambar_movie;
    public LinearLayout layout_parent;

    public MovieViewHolder(View itemView) {
        super(itemView);
        gambar_movie = (ImageView) itemView.findViewById(R.id.gambar_movie);
        layout_parent = (LinearLayout) itemView.findViewById(R.id.layout_parent);
    }

    public LinearLayout getItem() {
        return layout_parent;
    }
}
