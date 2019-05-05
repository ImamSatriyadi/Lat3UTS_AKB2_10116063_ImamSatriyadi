package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : SABTU 27 APRIL 2019
 * MEMBUAT MODEL DAILIY ACTIVITY
 * */
public class ModelDaily {
    private String waktu;
    private String kegiatan;
    private int icon;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }
}
