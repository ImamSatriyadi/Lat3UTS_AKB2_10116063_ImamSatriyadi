package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter.RecyclerViewAdapterGallery;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelGallery;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterFriendImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterGallery;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterGalleryImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceGallery;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT FRAGMENT GALLERY
 * */
public class GalleryFragment extends Fragment implements InterfaceGallery {
    private RecyclerView recyclerView;
    private RecyclerViewAdapterGallery recyclerViewAdapterGallery;
    private List<ModelGallery> modelGalleries   = new ArrayList<>();
    private PresenterGallery presenterGallery;

    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        presenterGallery = new PresenterGalleryImplement(this);
        recyclerView    = view.findViewById(R.id.recycler_3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2));


        recyclerViewAdapterGallery  = new RecyclerViewAdapterGallery(modelGalleries);
        recyclerView.setAdapter(recyclerViewAdapterGallery);

        presenterGallery.load();

        return view;
    }

    @Override
    public void onLoad(List<ModelGallery> gallery) {
        modelGalleries.clear();
        modelGalleries.addAll(gallery);
    }
}
