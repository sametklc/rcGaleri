package com.sametklc.rcgaleri.Activity;

import android.content.Context;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.sametklc.rcgaleri.Adapter.AdapterResim;
import com.sametklc.rcgaleri.Model.Resim;
import com.sametklc.rcgaleri.R;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rlGaleri;
    private AdapterResim adapterResim;
    private ArrayList<Resim> listResim = new ArrayList<>();
    Context context = this;
    private GridLayoutManager gridLayoutManager = new GridLayoutManager(context,2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlGaleri = findViewById(R.id.rlGaleri);
        adapterResim = new AdapterResim(getApplicationContext(),listResim);

        konumdakiDosyalarinTumu();

        rlGaleri.setLayoutManager(gridLayoutManager);
        rlGaleri.setItemAnimator(new DefaultItemAnimator());
        rlGaleri.setAdapter(adapterResim);
    }


    public void konumdakiDosyalarinTumu(){
        File dosya = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM+"/Camera");
        File[] dosyalar = dosya.listFiles();
        for (int i = 0; i<dosyalar.length; i++){
            listResim.add(new Resim(dosyalar[i]));
        }
    }
}
