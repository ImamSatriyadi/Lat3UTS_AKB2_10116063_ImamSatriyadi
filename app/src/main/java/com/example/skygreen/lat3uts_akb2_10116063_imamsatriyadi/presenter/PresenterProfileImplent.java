package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelProfile;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceProfil;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;

import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT PRESENETER IMPLEMENT PROFIL
 * */
public class PresenterProfileImplent implements PresenterProfile {
    private InterfaceProfil interfaceProfil;
    private List<ModelProfile> modelProfiles    = new ArrayList<>();

    public PresenterProfileImplent(InterfaceProfil interfaceProfil){
        this.interfaceProfil    = interfaceProfil;
        sendData();
    }

    private void sendData(){
        ModelProfile modelProfile   = new ModelProfile();
        modelProfile.setNimKelas("10116063 (AKB-2/IF-2)");
        modelProfile.setNama("IMAM SATRIYADI");
        modelProfile.setJurusan("TEKNIK INFORMATIKA");
        modelProfile.setTanggalLahir("Purworejo, 18 Juni 1998");
        modelProfile.setNoTelepon("081279402884");
        modelProfile.setUrlFb("https://facebook.com/imamsatriyadi.Kunir.IT");
        modelProfile.setEmail("imamsatriyadi.kunir.it@gmail.com");
        modelProfile.setDeskripsi("Imam lahir di Purworejo pada tanggal 18 Juni 1998. Tempat tinggal imam di Perum GPI Jl Safir 3 No 7 Padalarang. Saat ini Imam sedang mengambil studi di Universitas Komputer Indonesia Jurusan Teknik Informatika dan saat ini berada pada tingkat 3 atau semester 6");
        modelProfile.setFoto(R.drawable.img_1016063);
        modelProfiles.add(modelProfile);
    }

    @Override
    public void load() {
        interfaceProfil.onLoad(modelProfiles);
    }
}
