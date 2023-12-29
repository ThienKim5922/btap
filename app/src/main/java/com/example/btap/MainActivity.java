package com.example.btap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.btap.adapter.SanphamAdapter;
import com.example.btap.dao.SanPhamDAO;
import com.example.btap.model.SanPham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView sanphamListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sanphamListView = findViewById(R.id.sanphamListView);
        SanPhamDAO sanPhamDAO = new SanPhamDAO(this);
        ArrayList<SanPham> list = sanPhamDAO.getListSanPham();
        SanphamAdapter sanphamAdapter   = new SanphamAdapter(this, list);
        sanphamListView.setAdapter(sanPhamAdapter);
    }

}
