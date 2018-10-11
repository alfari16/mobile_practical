package io.github.alfari16.m06_16650029_alif_i;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnCategory = (Button) view.findViewById(R.id.btnCategory);
        btnCategory.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.btnCategory){
            CategoryFragment categoryFragment = new CategoryFragment();

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.frameContainer, categoryFragment, CategoryFragment.class.getSimpleName());
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

}
