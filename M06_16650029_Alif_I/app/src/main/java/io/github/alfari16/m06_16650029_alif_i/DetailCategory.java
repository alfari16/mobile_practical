package io.github.alfari16.m06_16650029_alif_i;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailCategory extends Fragment implements View.OnClickListener {
    TextView txtName, txtDescription;
    Button btnProfile, btnDialog;

    static String extra_name = "extra_name";
    private String description;

    public DetailCategory() {
        // Required empty public constructor
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail_category, container, false);
        txtName = (TextView) view.findViewById(R.id.txtName);
        txtDescription = (TextView) view.findViewById(R.id.txtDescription);
        btnProfile = (Button) view.findViewById(R.id.btnProfile);
        btnDialog = (Button) view.findViewById(R.id.btnDialog);

        btnProfile.setOnClickListener(this);
        btnDialog.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnProfile :
                startActivity(new Intent(getActivity(), ProfileActivity.class));
                break;
            case R.id.btnDialog :
                OptionDialogFragment optionDialogFragment = new OptionDialogFragment();
                optionDialogFragment.setOnOptionDialogListener(new OptionDialogFragment.OnOptionDialogListener() {
                    @Override
                    public void onOptionChoosen(String text) {
                        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
                    }
                });
                FragmentManager fm = getChildFragmentManager();
                optionDialogFragment.show(fm, OptionDialogFragment.class.getSimpleName());
                break;
        }
    }

    @Override
    public void onActivityCreated(Bundle bundle){
        super.onActivityCreated(bundle);
        String categoryName = getArguments().getString(extra_name);
        txtName.setText(categoryName);
        txtDescription.setText(getDescription());
    }
}
