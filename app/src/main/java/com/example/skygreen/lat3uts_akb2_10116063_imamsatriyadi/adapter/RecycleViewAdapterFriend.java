package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelFriendList;

import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT ADAPTER FRIEND LIST
 * */

public class RecycleViewAdapterFriend extends RecyclerView.Adapter<RecycleViewAdapterFriend.ViewHolder> {
    private List<ModelFriendList> modelFriendLists;

    public RecycleViewAdapterFriend(List<ModelFriendList> modelFriendLists){
        this.modelFriendLists   = modelFriendLists;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView txtNama;
        public ImageView foto;


        public ViewHolder(View v) {
            super(v);
            txtNama = (TextView) v.findViewById(R.id.txt_nama_teman);
            foto    = (ImageView) v.findViewById(R.id.ic_user);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friend_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ModelFriendList modelFriendList = modelFriendLists.get(i);
        viewHolder.txtNama.setText(modelFriendList.getNama());
        viewHolder.foto.setImageResource(modelFriendList.getFoto());
    }



    @Override
    public int getItemCount() {
        return modelFriendLists.size();
    }
}
