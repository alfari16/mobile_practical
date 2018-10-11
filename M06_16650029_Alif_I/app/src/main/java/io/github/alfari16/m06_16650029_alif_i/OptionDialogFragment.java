package io.github.alfari16.m06_16650029_alif_i;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class OptionDialogFragment extends DialogFragment implements  View.OnClickListener{
    Button btnClose, btnPilih;
    RadioGroup radioGroup;
    RadioButton radioSir, radioJose, radioLouis, radioDavid;
    OnOptionDialogListener onOptionDialogListener;


    public OptionDialogFragment() {
        // Required empty public constructor
    }

    OnOptionDialogListener getOnOptionDialogListener(){
        return onOptionDialogListener;
    }

    public void setOnOptionDialogListener(OnOptionDialogListener newOne){
        this.onOptionDialogListener = newOne;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_option_dialog, container, false);
        btnClose = (Button) view.findViewById(R.id.btnClose);
        btnPilih = (Button) view.findViewById(R.id.btnPilih);
        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioSir = (RadioButton) view.findViewById(R.id.radioSir);
        radioJose= (RadioButton) view.findViewById(R.id.radioJose);
        radioLouis = (RadioButton) view.findViewById(R.id.radioLouis);
        radioDavid = (RadioButton) view.findViewById(R.id.radioDavid);

        btnClose.setOnClickListener(this);
        btnPilih.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnClose:
                getDialog().cancel();
                break;
            case R.id.btnPilih:
                int checkedRadioButton = radioGroup.getCheckedRadioButtonId();
                if(checkedRadioButton != -1){
                    String coach = null;
                    switch(checkedRadioButton){
                        case R.id.radioSir:
                            coach = radioSir.getText().toString().trim();
                            break;
                        case R.id.radioLouis:
                            coach = radioLouis.getText().toString().trim();
                            break;
                        case R.id.radioDavid:
                            coach = radioDavid.getText().toString().trim();
                            break;
                        case R.id.radioJose:
                            coach = radioJose.getText().toString().trim();
                            break;


                    }
                    getOnOptionDialogListener().onOptionChoosen(coach);
                    getDialog().cancel();
                }

                break;
        }
    }

    public interface OnOptionDialogListener {
        void onOptionChoosen(String text);
    }
}
