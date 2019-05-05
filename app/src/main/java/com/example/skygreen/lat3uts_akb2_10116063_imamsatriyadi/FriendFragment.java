package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter.RecycleViewAdapterFriend;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.adapter.RecyclerViewAdapter;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelFriendList;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterFriend;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter.PresenterFriendImplement;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceFriend;

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
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT FRAGMENT FRIEND LIST
 * */
public class FriendFragment extends Fragment implements InterfaceFriend {
    private RecyclerView recyclerView;
    private RecycleViewAdapterFriend recycleViewAdapterFriend;
    private PresenterFriend presenterFriend;
    private List<ModelFriendList> modelFriendLists = new ArrayList<>();


    public FriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friend, container, false);
        presenterFriend = new PresenterFriendImplement(this);
        recyclerView    = view.findViewById(R.id.recycler_2);
        //final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 1);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        recycleViewAdapterFriend = new RecycleViewAdapterFriend(modelFriendLists);
        recyclerView.setAdapter(recycleViewAdapterFriend);

        presenterFriend.load();
        return view;

    }

    @Override
    public void onLoad(List<ModelFriendList> friend) {
        modelFriendLists.clear();
        modelFriendLists.addAll(friend);
    }
}
