package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelHome;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterHome;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterHomeImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceHome;

import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : MINGGU 21 APRIL 2019
 * MEMBUAT FRAGMENT HOME
 * */

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements InterfaceHome {
    private TextView txtNimKelas;
    private TextView txtNama;
    private TextView txtJurusan;
    private TextView txtDeskripsi;
    private TextView txtHalLain;
    private List<ModelHome> modelHomes = new ArrayList<>();
    private PresenterHome presenterHome;
    private ImageView profil;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view       = inflater.inflate(R.layout.fragment_home, container, false);
        presenterHome   = new PresenterHomeImplement(this);
        txtNimKelas     = view.findViewById(R.id.txt_nim);
        txtNama         = view.findViewById(R.id.txt_nama);
        txtJurusan      = view.findViewById(R.id.txt_jurusan);
        txtDeskripsi    = view.findViewById(R.id.txt_content_desc);
        txtHalLain      = view.findViewById(R.id.txt_content_interest);
        profil          = view.findViewById(R.id.img_profil);
        presenterHome.load();

        return view;
    }


    public void onLoad(List<ModelHome> homes){
        modelHomes.clear();
        modelHomes.addAll(homes);
        txtNimKelas.setText(homes.get(0).getNimKelas());
        txtNama.setText(homes.get(0).getNama());
        txtJurusan.setText(homes.get(0).getJurusan());
        txtDeskripsi.setText(homes.get(0).getDeskripsi());
        txtHalLain.setText(homes.get(0).getHalLain());
        profil.setImageResource(homes.get(0).getFoto());
    }

}
