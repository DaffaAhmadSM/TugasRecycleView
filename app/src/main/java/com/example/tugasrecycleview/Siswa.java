package com.example.tugasrecycleview;

public class Siswa {
    private String nama;
    private String nim;
    private String email;

    public Siswa(String nama, String nim, String email) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
