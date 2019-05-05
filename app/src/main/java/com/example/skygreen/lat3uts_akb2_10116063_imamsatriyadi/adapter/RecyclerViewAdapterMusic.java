package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelMusic;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 4 MEI 2019
 * MEMBUAT ADAPTER MUSIC
 *
 * *TIDAK DIGUNAKAN
 * */

public class RecyclerViewAdapterMusic extends RecyclerView.Adapter<RecyclerViewAdapterMusic.ViewHolder>{
    private List<ModelMusic> modelMusics;
    private OnCallbackListener listener;

    public RecyclerViewAdapterMusic(List<ModelMusic> modelMusics){
        this.modelMusics    = modelMusics;
    }

    public void setOnCallbackListener(OnCallbackListener listener){
        this.listener   = listener;
    }

    public interface OnCallbackListener{
        void onClick(ModelMusic musik);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView judulMusic;
        public TextView musik;

        public ViewHolder(View v) {
            super(v);
            judulMusic = (TextView) v.findViewById(R.id.txt_judul_musik);
            musik      = (TextView) v.findViewById(R.id.txt_musik);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(modelMusics.get(getAdapterPosition()));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ModelMusic modelMusic   = modelMusics.get(i);
        viewHolder.judulMusic.setText(modelMusic.getJudul());
        viewHolder.musik.setText(modelMusic.getMusik());
    }

    @Override
    public int getItemCount() {
      return modelMusics.size();
    }


}
