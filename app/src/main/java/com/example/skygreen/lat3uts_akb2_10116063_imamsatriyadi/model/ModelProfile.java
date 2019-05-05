package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi.model;
/*
 * NIM   : 10116063
 * NAMA  : IMAM SATRIYADI
 * KELAS : AKB-2 / IF-2
 *
 * CHANGE LOG : KAMIS 2 MEI 2019
 * MEMBUAT MODEL PROFIL
 * */
public class ModelProfile {
    private String nimKelas;
    private String nama;
    private String jurusan;
    private String tanggalLahir;
    private String noTelepon;
    private String urlFb;
    private String email;
    private String deskripsi;
    private int foto;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getUrlFb() {
        return urlFb;
    }

    public void setUrlFb(String urlFb) {
        this.urlFb = urlFb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
