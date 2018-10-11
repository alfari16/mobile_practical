package io.github.alfari16.myflexiblefragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CategoryFragment extends AppCompatActivity implements View.OnClickListener {

    private Button btnDetailCategory;

    public CategoryFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_category, container, false);
        btnDetailCategory = (Button) view.findViewById(R.id.btn_detail_category);
        btnDetailCategory.setOnClickListener(this);
        return view;
    }


    public void onclick(View v) {
        if (v.getId() == R.id.btn_detail_category) {

        }
    }

    @Override
    public void onClick(View v) {

    }
}
