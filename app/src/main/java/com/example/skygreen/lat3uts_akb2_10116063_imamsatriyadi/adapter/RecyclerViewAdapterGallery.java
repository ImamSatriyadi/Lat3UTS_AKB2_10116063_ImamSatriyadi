package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelGallery;

import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT ADAPTER GALLERY
 * */
public class RecyclerViewAdapterGallery extends RecyclerView.Adapter<RecyclerViewAdapterGallery.ViewHolder> {
    private List<ModelGallery> modelGalleries;


    public RecyclerViewAdapterGallery(List<ModelGallery> modelGalleries){
        this.modelGalleries = modelGalleries;
    }



    class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtDesc;
        ImageView imgDesc;

        public ViewHolder(View v) {
            super(v);

            txtDesc = v.findViewById(R.id.txt_image_desc);
            imgDesc = v.findViewById(R.id.img_gallery);
        }


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_gallery, viewGroup, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
       ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ModelGallery modelGallery   = modelGalleries.get(i);
        viewHolder.txtDesc.setText(modelGallery.getDesc());
        viewHolder.imgDesc.setImageResource(modelGallery.getImage());
    }

    @Override
    public int getItemCount() {
        return modelGalleries.size();
    }



}
