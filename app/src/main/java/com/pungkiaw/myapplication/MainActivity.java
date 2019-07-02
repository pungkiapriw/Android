package com.pungkiaw.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nik,nama,no_kk,alamat;
    Button btn_daftar;
    TextView hasildaftar;
    Spinner spinnerPilihan;
    String[]pilihanhitung = {"Kelas Pagi","Kelas Sore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nik = findViewById(R.id.nik);
        nama = findViewById(R.id.nama);
        no_kk = findViewById(R.id.no_kk);
        alamat = findViewById(R.id.alamat);
        spinnerPilihan = findViewById(R.id.spinnerPilihan);
        btn_daftar = findViewById(R.id.btn_daftar);
        hasildaftar = findViewById(R.id.hasildaftar);

     btn_daftar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             if(spinnerPilihan.getSelectedItem().toString().equals(pilihanhitung[0])){
                hasildaftar.setText("Akhwan,Harus bisa membaca Alquran");
             }else{
                 hasildaftar.setText("Akhwat,Harus bisa membaca Alquran");
             }
         }
     });
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,pilihanhitung);
        spinnerPilihan.setAdapter(adapter);

    }
}
