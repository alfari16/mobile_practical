package io.github.alfari16.m06_16650029_alif_i;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        ft.add(R.id.frameContainer, homeFragment, HomeFragment.class.getSimpleName());

        Log.d("MyFlexibleFragment", "FragmentName: "+HomeFragment.class.getSimpleName());
        ft.commit();
    }
}
