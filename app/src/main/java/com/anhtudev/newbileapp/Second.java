package com.anhtudev.newbileapp;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView txtketQua;
    Button btnThoat;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtketQua = findViewById(R.id.txtKetQua);
        btnThoat = findViewById(R.id.btnThoat);
        String hoten = getIntent().getExtras().getString("ht");
        String namsinh = getIntent().getExtras().getString("ns");
        Calendar calendar = Calendar.getInstance();
        int tuoi = calendar.getTime().getYear() - 1900 - Integer.parseInt(namsinh);
        String st = "";
        st += "Ho va ten: " + hoten;
        st += "\nNam sinh: " + namsinh;
        st += "\nTuoi: " + tuoi;
        txtketQua.setText(st);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
