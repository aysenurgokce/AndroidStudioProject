package com.example.kitabeviotomasyonu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AG_KitapAdapter  extends ArrayAdapter<AG_KITAP> {
    Context context;
    public AG_KitapAdapter(@NonNull Context context, int resource, @NonNull List<AG_KITAP> objects) {
        super(context, resource, objects);
        this.context=context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =LayoutInflater.from(context);
        convertView=inflater.inflate(R.layout.ag_kitap_satir,parent,false);

        AG_KITAP ag_kitap = getItem(position);
        TextView ag_isim=convertView.findViewById(R.id.ag_txt_kitap_adi);
        TextView ag_yazarisim=convertView.findViewById(R.id.ag_txt_kitap_yazari);
        TextView ag_fiyat=convertView.findViewById(R.id.ag_txt_kitap_fiyat);
        TextView ag_kdili =convertView.findViewById(R.id.ag_txt_kitap_dili);
        TextView ag_stokdurumu =convertView.findViewById(R.id.ag_txt_kitap_stogu);
        TextView ag_kitap_tur=convertView.findViewById(R.id.ag_txt_kturu);
        ImageView ag_foto_goster = convertView.findViewById(R.id.ag_iv_kitap_resim);
        Button ag_kitapekle4=convertView.findViewById(R.id.ag_btn_kitap_ekle2);

        ag_isim.setText(ag_kitap.getAg_kitapadi());
        ag_yazarisim.setText(ag_kitap.getAg_kitapyazari());
        ag_fiyat.setText(String.valueOf(ag_kitap.getAg_kitapfiyati()));
        ag_kdili.setText(ag_kitap.getAg_kitapdili());
        ag_stokdurumu.setText(ag_kitap.getAg_kitapstok());
        ag_kitap_tur.setText(ag_kitap.getAg_kitapturu());
        ag_foto_goster.setImageBitmap(ag_kitap.getAg_resim());

        ag_kitapekle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, ag_kitap.getAg_kitapadi()+ " : Kütüphaneye Eklenmiştir.", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}

