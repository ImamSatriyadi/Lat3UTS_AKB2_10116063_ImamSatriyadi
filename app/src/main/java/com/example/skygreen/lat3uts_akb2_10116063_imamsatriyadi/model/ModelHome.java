package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model;

/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : MINGGU 21 APRIL 2019
 * MEMBUAT MODEL HOME
 * */


public class ModelHome {
    private String nimKelas;
    private String nama;
    private String jurusan;
    private String deskripsi;
    private String halLain;
    private int foto;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNimKelas() {
        return nimKelas;
    }

    public void setNimKelas(String nimKelas) {
        this.nimKelas = nimKelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHalLain() {
        return halLain;
    }

    public void setHalLain(String halLain) {
        this.halLain = halLain;
    }
}
