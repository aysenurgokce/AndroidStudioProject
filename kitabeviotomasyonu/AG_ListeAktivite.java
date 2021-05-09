package com.example.kitabeviotomasyonu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AG_ListeAktivite extends AppCompatActivity {
     ListView ag_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_aktivite);
        ag_list=findViewById(R.id.ag_liste);
        ArrayList<AG_KITAP> ag_kitaplar= AG_Veritabani.ag_myBook;
        Toast.makeText(AG_ListeAktivite.this,ag_kitaplar.get(0).getAg_kitapadi(),Toast.LENGTH_SHORT).show();
        AG_KitapAdapter ag_kitapAdapter=new AG_KitapAdapter(AG_ListeAktivite.this,0,ag_kitaplar);
        ag_list.setAdapter(ag_kitapAdapter);
    }
}