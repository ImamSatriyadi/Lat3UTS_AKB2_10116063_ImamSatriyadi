package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelFriendList;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceFriend;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT PRESENTER IMPLEMENT FRIEND LIST
 * */

public class PresenterFriendImplement implements PresenterFriend {
    private InterfaceFriend interfaceFriend;
    private List<ModelFriendList> modelFriendLists  = new ArrayList<>();

    public PresenterFriendImplement(InterfaceFriend interfaceFriend){
        this.interfaceFriend    = interfaceFriend;
        sendData();
    }

    public void sendData(){
        ModelFriendList modelFriend = new ModelFriendList();
        modelFriend.setNama("Bilal");
        modelFriend.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend);

        ModelFriendList modelFriend1    = new ModelFriendList();
        modelFriend1.setNama("Sandi");
        modelFriend1.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend1);

        ModelFriendList modelFriend2    = new ModelFriendList();
        modelFriend2.setNama("Nosa");
        modelFriend2.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend2);

        ModelFriendList modelFriend3    = new ModelFriendList();
        modelFriend3.setNama("Tio");
        modelFriend3.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend3);

        ModelFriendList modelFriend4    = new ModelFriendList();
        modelFriend4.setNama("Fuad");
        modelFriend4.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend4);

        ModelFriendList modelFriend5    = new ModelFriendList();
        modelFriend5.setNama("Irfan");
        modelFriend5.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend5);

        ModelFriendList modelFriend6    = new ModelFriendList();
        modelFriend6.setNama("Fritson");
        modelFriend6.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend6);

        ModelFriendList modelFriend7    = new ModelFriendList();
        modelFriend7.setNama("Diki");
        modelFriend7.setFoto(R.drawable.ic_user_78);
        modelFriendLists.add(modelFriend7);
    }

    @Override
    public void load() {
        interfaceFriend.onLoad(modelFriendLists);
    }
}
