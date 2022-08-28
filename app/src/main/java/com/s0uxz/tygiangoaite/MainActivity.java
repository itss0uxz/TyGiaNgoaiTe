package com.s0uxz.tygiangoaite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.s0uxz.tygiangoaite.adapter.AdapterTyGia;
import com.s0uxz.tygiangoaite.model.TyGia;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    AdapterTyGia adapterTyGia;
    ArrayList<TyGia> dsTyGia;

    private void addControls()
    {
        listview = findViewById(R.id.listview);
        dsTyGia = new ArrayList<>();
        dsTyGia.add(new TyGia(R.drawable.vietnam, "Viet Nam",13245l,12345l,12345l,12345l));
        dsTyGia.add(new TyGia(R.drawable.japan, "Japan",13245l,12345l,12345l,12345l));
        dsTyGia.add(new TyGia(R.drawable.south_korea, "South Korea",12345l,12345l,12345l,12345l));
        dsTyGia.add(new TyGia(R.drawable.china, "China",12345l,12345l,13245l,12345l));
        adapterTyGia = new AdapterTyGia(
                MainActivity.this,R.layout.item,dsTyGia
        );
        listview.setAdapter(adapterTyGia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }
}