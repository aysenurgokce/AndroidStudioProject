package com.example.kitabeviotomasyonu;

import java.util.ArrayList;

public class AG_Veritabani {
    static ArrayList<AG_KITAP> ag_myBook=new ArrayList<>();

    public static ArrayList<AG_KITAP> getAg_myBook() {
        return ag_myBook;
    }

    public static void setAg_myBook(ArrayList<AG_KITAP> ag_mybook) {
        AG_Veritabani.ag_myBook = ag_mybook;
    }
}
