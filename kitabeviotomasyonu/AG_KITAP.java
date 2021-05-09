package com.example.kitabeviotomasyonu;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import java.io.Serializable;

public class AG_KITAP implements Serializable {
    private String ag_kitapadi;
    private String ag_kitapyazari;
    private String ag_kitapturu;
    private String ag_kitapstok;
    private String ag_kitapdili;
    private Double ag_kitapfiyati;
    private Bitmap ag_resim;
    Context context;

    public AG_KITAP() {

    }

    public AG_KITAP(Context context,String ag_kitapadi, String ag_kitapyazari, String ag_kitapturu, String ag_kitapstok, String ag_kitapdili, double ag_kitapfiyati ,Bitmap ag_resim ) {
        this.context = context;
        this.ag_kitapadi = ag_kitapadi;
        this.ag_kitapyazari = ag_kitapyazari;
        this.ag_kitapturu = ag_kitapturu;
        this.ag_kitapstok = ag_kitapstok;
        this.ag_kitapdili = ag_kitapdili;
        this.ag_kitapfiyati = ag_kitapfiyati;
        this.ag_resim = ag_resim;
    }

    public String getAg_kitapadi() {
        return ag_kitapadi;
    }

    public String getAg_kitapyazari() {
        return ag_kitapyazari;
    }

    public String getAg_kitapturu() {
        return ag_kitapturu;
    }

    public String getAg_kitapstok() {
        return ag_kitapstok;
    }

    public String getAg_kitapdili() {
        return ag_kitapdili;
    }

    public double getAg_kitapfiyati() {
        return ag_kitapfiyati;
    }

    public Bitmap getAg_resim() {
        return ag_resim;
    }

    public void setAg_resim(Bitmap ag_resim) {
        this.ag_resim = ag_resim;
    }

    public void setAg_kitapadi(String ag_kitapadi) {
        this.ag_kitapadi = ag_kitapadi;
    }

    public void setAg_kitapyazari(String ag_kitapyazari) {
        this.ag_kitapyazari = ag_kitapyazari;
    }

    public void setAg_kitapturu(String ag_kitapturu) {
        this.ag_kitapturu = ag_kitapturu;
    }

    public void setAg_kitapstok(String ag_kitapstok) {
        this.ag_kitapstok = ag_kitapstok;
    }

    public void setAg_kitapdili(String ag_kitapdili) {
        this.ag_kitapdili = ag_kitapdili;
    }

    public void setAg_kitapfiyati(Double ag_kitapfiyati) {
        if(ag_kitapfiyati < 0) {
            if (context != null) {
                Toast.makeText(context, "ürün fiyatı negatif olamaz", Toast.LENGTH_SHORT).show();
            }
            this.ag_kitapfiyati=0.0;
        }
        else {
            this.ag_kitapfiyati = ag_kitapfiyati;
        }
    }
    public void setContext(Context context) {
        this.context = context;
    }
}
