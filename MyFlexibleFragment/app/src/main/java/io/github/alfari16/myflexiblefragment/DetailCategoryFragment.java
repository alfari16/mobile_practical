package io.github.alfari16.myflexiblefragment;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailCategoryFragment extends AppCompatActivity {

    private TextView tvCategoryName;
    private TextView getTvCategoryDescription;
    private Button btnprofile;
    private Button btnShowDialog;
    public static String Extra_Name = "extra_name";
    private String description;

    public DetailCategoryFragment() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_detail_category_fragment, container, false);
        tvCategoryName = (TextView) view.findViewById(R.id.tv_category_description);
        btnprofile = (Button) view.findViewById(R.id.btn_profile);
        btnprofile.setOnClickListener(this);
        btnShowDialog = (Button) view.findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(this);
        return view;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String categoryName = getArguments().getString(Extra_Name);
        tvCategoryName.setText(categoryName);
        getTvCategoryDescription.setText(getDescription());
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_profile:
                break;
            case R.id.btn_show_dialog:
                OptionDialogFragment moptionDialogFragment = new OptionDialogFragment();
                moptionDialogFragment.OnOptionDialogListener() {

            }

        }
    }

    @Override
    public void onOptionChoosen(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }};
    FragmentManeger mFragmentMeneger = getChildFragmentMeneger();
    mOptionDialogFragment.show(mFragmentManeger, OptionDialogFragment.class.getSimpleName());
    break;



