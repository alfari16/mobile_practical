package io.github.alfari16.m06_16650029_alif_i;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment implements View.OnClickListener{


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        Button btnCategory = (Button) view.findViewById(R.id.detailCategory);
        btnCategory.setOnClickListener(this);
        return view;
    }

    public void onClick(View view){
        if(view.getId() == R.id.detailCategory){
            DetailCategory dc = new DetailCategory();

            Bundle bundle = new Bundle();
            bundle.putString(DetailCategory.extra_name, "Lifestyle");

            String description = "Kategori ini akan berisi produk-produk lifestyle";
            dc.setArguments(bundle);
            dc.setDescription(description);

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameContainer, dc, DetailCategory.class.getSimpleName());
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

}
