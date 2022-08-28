package com.s0uxz.tygiangoaite.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.s0uxz.tygiangoaite.R;
import com.s0uxz.tygiangoaite.model.TyGia;

import java.util.List;

public class AdapterTyGia extends ArrayAdapter<TyGia> {
    Activity context;
    int resource;
    @NonNull List<TyGia> objects;
    public AdapterTyGia(@NonNull Activity context, int resource, @NonNull List<TyGia> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        row  = layoutInflater.inflate(this.resource,null);
        ImageView img = row.findViewById(R.id.id_img);
        TextView _KiHieu = row.findViewById(R.id.txtKiHieu);
        TextView _MuaTM = row.findViewById(R.id.txtMuaTM);
        TextView _BanTM = row.findViewById(R.id.txtBanTM);
        TextView _MuaCK = row.findViewById(R.id.txtMuaCK);
        TextView _BanCK = row.findViewById(R.id.txtBanCK);
        TyGia tyGia = this.objects.get(position);
        img.setImageResource(tyGia.getID_Img());
        _KiHieu.setText(tyGia.getKihieu());
        _MuaTM.setText(String.valueOf(tyGia.getMuaTM()));
        _MuaCK.setText(String.valueOf(tyGia.getMuaCK()));
        _BanTM.setText(String.valueOf(tyGia.getBanTM()));
        _BanCK.setText(String.valueOf(tyGia.getBanCK()));
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Ban chon: "+objects.get(position).getKihieu(), Toast.LENGTH_SHORT).show();
            }
        });
        return row;
    }
}
