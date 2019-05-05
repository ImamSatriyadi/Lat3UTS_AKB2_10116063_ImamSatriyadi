package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter.RecyclerViewAdapter;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelDaily;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterDaily;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterDailyImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceDaily;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT FRAGMENT DAILIY ACTIVITY
 * */


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyActivityFragment extends Fragment implements InterfaceDaily{
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private PresenterDaily presenterDaily;
    private List<ModelDaily> modelDailies = new ArrayList<>();


    public DailyActivityFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view       = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        Fragment fragmentFriend = new FriendFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_friend, new FriendFragment()).commit();

        presenterDaily  = new PresenterDailyImplement(this);
        recyclerView    = view.findViewById(R.id.recycler);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(modelDailies);
        recyclerView.setAdapter(recyclerViewAdapter);

        presenterDaily.load();
        return view;
    }


    @Override
    public void onLoad(List<ModelDaily> daily) {
        modelDailies.clear();
        modelDailies.addAll(daily);
    }
}
