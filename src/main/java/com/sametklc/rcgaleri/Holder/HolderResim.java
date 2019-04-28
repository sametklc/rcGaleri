package com.sametklc.rcgaleri.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.sametklc.rcgaleri.R;

public class HolderResim extends RecyclerView.ViewHolder {

    public ImageView ivResim;

    public HolderResim(@NonNull View itemView) {
        super(itemView);

        ivResim = itemView.findViewById(R.id.ivResim);

    }
}
