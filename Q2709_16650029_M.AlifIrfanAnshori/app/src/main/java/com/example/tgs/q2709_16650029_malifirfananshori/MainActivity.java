package com.example.tgs.q2709_16650029_malifirfananshori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void peminjaman(View view){
        startActivity(new Intent(this, Peminjaman.class));
    }

    public void about(View view){
        startActivity(new Intent(this, About.class));
    }

    public void logout(View view){
        finish();
    }
}
