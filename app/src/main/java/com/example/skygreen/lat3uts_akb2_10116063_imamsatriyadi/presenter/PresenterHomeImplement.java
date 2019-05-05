package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelHome;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceHome;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;

import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : MINGGU 21 APRIL 2019
 * MEMBUAT PRESENTER IMPLEMENT HOME
 * */

public class PresenterHomeImplement implements PresenterHome {
    private InterfaceHome interfaceHome;
    private List<ModelHome> modelHomes = new ArrayList<>();

    public PresenterHomeImplement(InterfaceHome interfaceHome){
        this.interfaceHome = interfaceHome;
        setData();
    }


    private void setData(){
        ModelHome modelHome = new ModelHome();
        modelHome.setNimKelas("10116063 (AKB-2/IF-2)");
        modelHome.setFoto(R.drawable.img_1016063);
        modelHome.setNama("IMAM SATRIYADI");
        modelHome.setJurusan("TEKNIK INFORMATIKA");
        modelHome.setDeskripsi("Imam lahir di Purworejo pada tanggal 18 Juni 1998. Tempat tinggal imam di Perum GPI Jl Safir 3 No 7 Padalarang. Saat ini Imam sedang mengambil studi di Universitas Komputer Indonesia Jurusan Teknik Informatika dan saat ini berada pada tingkat 3 atau semester 6");
        modelHome.setHalLain("Hobby imam memancing untuk lebih dekat dengan alam :). makanan kesukaan Imam yang pasti makanan Indonesia saja begitu juga untuk minumannya :). Cita-cita ingin menjadi manusia yang berguna untuk masyarakat.");
        modelHomes.add(modelHome);
    }

    @Override
    public void load() {
        interfaceHome.onLoad(modelHomes);
    }

}
