package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceMusic;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;

import java.util.ArrayList;
import java.util.List;
/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 4 MEI 2019
 * MEMBUAT PRESENTER IMPLEMENT MUSIC AND VIDEO
 * */
public class PresenterMusicImplement implements PresenterMusic {
    private InterfaceMusic interfaceMusic;
    private List<ModelMusic> modelMusics    = new ArrayList<>();

    public PresenterMusicImplement(InterfaceMusic interfaceMusic){
        this.interfaceMusic = interfaceMusic;
        sendData();
    }

    private void sendData(){
        ModelMusic modelMusic   = new ModelMusic();
        modelMusic.setMusik(R.raw.pergilah_kasih);
        modelMusic.setJudul("Pergilah Kasih");
        modelMusics.add(modelMusic);

        ModelMusic modelMusic2   = new ModelMusic();
        modelMusic2.setMusik(R.raw.armada);
        modelMusic2.setJudul("Asal Kau Bahagia");
        modelMusics.add(modelMusic2);
    }
    @Override
    public void load() {
        interfaceMusic.onLoad(modelMusics);
    }
}
