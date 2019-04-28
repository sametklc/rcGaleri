package com.sametklc.rcgaleri.Model;

import java.io.File;

public class Resim {

    private File dosya;

    public Resim() {
    }

    public Resim(File dosya) {
        this.dosya = dosya;
    }

    public File getDosya() {
        return dosya;
    }

    public void setDosya(File dosya) {
        this.dosya = dosya;
    }
}
