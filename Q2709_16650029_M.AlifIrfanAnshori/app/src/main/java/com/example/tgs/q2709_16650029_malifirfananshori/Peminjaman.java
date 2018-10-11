package com.example.tgs.q2709_16650029_malifirfananshori;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Peminjaman extends AppCompatActivity {
    TextView txtNo, txtJumlah, txtTotal;
    EditText no, judul, jumlah, biaya, denda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman);

        txtNo = (TextView) findViewById(R.id.txtNo);
        txtJumlah = (TextView) findViewById(R.id.txtJumlah);
        txtTotal = (TextView) findViewById(R.id.txtTotal);

        no = (EditText) findViewById(R.id.no);
        judul = (EditText) findViewById(R.id.judul);
        jumlah = (EditText) findViewById(R.id.jumlah);
        biaya = (EditText) findViewById(R.id.biaya);
        denda = (EditText) findViewById(R.id.denda);
    }

    public void hitung(View view){
        try{
            int jumlah = Integer.parseInt(this.jumlah.getText().toString());
            int biaya =  Integer.parseInt(this.biaya.getText().toString());
            int denda = Integer.parseInt(this.denda.getText().toString());

            int total = jumlah+biaya+denda;

            txtNo.setText("No Anggota: "+no.getText().toString());
            txtJumlah.setText("Judul Buku: "+this.judul.getText().toString());
            txtTotal.setText("Total Biaya: "+total);
        }catch(Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            txtNo.setText(e.getMessage());
        }
    }
}
