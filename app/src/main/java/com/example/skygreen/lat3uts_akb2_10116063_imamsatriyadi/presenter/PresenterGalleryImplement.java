package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.presenter;

import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.R;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model.ModelGallery;
import com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.view.InterfaceGallery;

import java.util.ArrayList;
import java.util.List;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT PRESENTER IMPLEMENT GALLERY
 * */
public class PresenterGalleryImplement implements PresenterGallery {
    private InterfaceGallery interfaceGallery;
    private List<ModelGallery> modelGalleries   = new ArrayList<>();

    public PresenterGalleryImplement(InterfaceGallery interfaceGallery){
        this.interfaceGallery   = interfaceGallery;
        sendData();
    }

    private void sendData(){
        ModelGallery modelGallery   = new ModelGallery();
        modelGallery.setId(1);
        modelGallery.setImage(R.drawable.img_1016063);
        modelGallery.setDesc("Imam Satriyadi");
        modelGalleries.add(modelGallery);

        ModelGallery modelGallery1   = new ModelGallery();
        modelGallery1.setId(2);
        modelGallery1.setImage(R.drawable.foto2_png);
        modelGallery1.setDesc("Imam Satriyadi");
        modelGalleries.add(modelGallery1);

        ModelGallery modelGallery2   = new ModelGallery();
        modelGallery2.setId(3);
        modelGallery2.setImage(R.drawable.foto3_png);
        modelGallery2.setDesc("Kelulusan");
        modelGalleries.add(modelGallery2);

        ModelGallery modelGallery3   = new ModelGallery();
        modelGallery3.setId(4);
        modelGallery3.setImage(R.drawable.foto4_png);
        modelGallery3.setDesc("PRAKERIN");
        modelGalleries.add(modelGallery3);

        ModelGallery modelGallery4   = new ModelGallery();
        modelGallery4.setId(5);
        modelGallery4.setImage(R.drawable.foto5_png);
        modelGallery4.setDesc("PRAKERIN");
        modelGalleries.add(modelGallery4);

        ModelGallery modelGallery5   = new ModelGallery();
        modelGallery5.setId(6);
        modelGallery5.setImage(R.drawable.foto6_png);
        modelGallery5.setDesc("HUT SMK");
        modelGalleries.add(modelGallery5);

        ModelGallery modelGallery6   = new ModelGallery();
        modelGallery6.setId(7);
        modelGallery6.setImage(R.drawable.foto7_png);
        modelGallery6.setDesc("PRAKERIN");
        modelGalleries.add(modelGallery6);

        ModelGallery modelGallery7   = new ModelGallery();
        modelGallery7.setId(8);
        modelGallery7.setImage(R.drawable.foto8_png);
        modelGallery7.setDesc("PRAKERIN");
        modelGalleries.add(modelGallery7);

        ModelGallery modelGallery8   = new ModelGallery();
        modelGallery8.setId(9);
        modelGallery8.setImage(R.drawable.foto8_png);
        modelGallery8.setDesc("Bus Favorit");
        modelGalleries.add(modelGallery8);
    }
    @Override
    public void load() {
        interfaceGallery.onLoad(modelGalleries);
    }
}
