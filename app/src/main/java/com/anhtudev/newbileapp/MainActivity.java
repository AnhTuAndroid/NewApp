package com.anhtudev.newbileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtHoten, txtNamSinh ;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHoten = findViewById(R.id.txtHoTen);
        txtNamSinh = findViewById(R.id.txtNamSinh);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = txtHoten.getText().toString();
                String namsinh = txtNamSinh.getText().toString();
                Intent i = new Intent(MainActivity.this, Second.class);
                i.putExtra("ht", new String(hoten));
                i.putExtra("ns", new String(namsinh));
                startActivity(i);
            }
        });

    }

}
