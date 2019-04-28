package com.sametklc.rcgaleri.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.sametklc.rcgaleri.Holder.HolderResim;
import com.sametklc.rcgaleri.Model.Resim;
import com.sametklc.rcgaleri.R;

import java.io.File;
import java.util.ArrayList;

public class AdapterResim extends RecyclerView.Adapter<HolderResim> {

    private Context context;
    private ArrayList<Resim> listResim = new ArrayList<>();

    public AdapterResim() {
    }

    public AdapterResim(Context context, ArrayList<Resim> listResim) {
        this.context = context;
        this.listResim = listResim;
    }

    @NonNull
    @Override
    public HolderResim onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // adapterın satır görüntüsünü layouta bağama işlemini yapar.

        View v = LayoutInflater.from(context).inflate(R.layout.resim_satirgorunutusu,viewGroup,false);

        return new HolderResim(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderResim holderResim, int i) {
        // satır görüntüsünde bulunan nesnelere ulaşmak için kullanılır.
        // nesnelere erişip metodlarına ulaşabilirsiniz.
        // varsayılan değer ataamması yapılabilir örn: setText().
        // Arraylistten gelen değeri atayabiliriz.

        Glide.with(holderResim.itemView).load(listResim.get(i).getDosya()).into(holderResim.ivResim);

    }

    @Override
    public int getItemCount() {
        return listResim.size();
    }
}
