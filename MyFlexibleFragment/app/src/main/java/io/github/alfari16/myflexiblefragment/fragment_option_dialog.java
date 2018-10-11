package io.github.alfari16.myflexiblefragment;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

public class fragment_option_dialog extends DialogFragment implements View.OnClickListener {

    private Button btnChoose, btnClose;
    private RadioGroup rgoptions;
    private OnOptionDialogListener onOptionDialogListener;
    public OptionDialogFragment(){

    }

    public OnOptionDialogListener getOnOptionDialogListener() {
        return onOptionDialogListener;
    }
    public void setOnOptionDialogListener(OnOptionDialogListener onOptionDialogListener){
        this.onOptionDialogListener = onOptionDialogListener;
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_fragment_option_dialog, container, false);
        btnChoose = (Button)view.findViewById(R.id.btn_choose);
        btnChoose.setOnClickListener(this);
        btnClose = (Button)view.findViewById(R.id.btn_close);
        btnClose.setOnClickListener(this);
        rgoptions = (RadioGroup) view.findViewById(R.id.rg_options);
        RadioGroup rbSaf = (RadioGroup) view.findViewById(R.id.rb_saf);
        RadioGroup rbLvg = (RadioGroup) view.findViewById(R.id.rb_lvg);
        RadioGroup rbMou = (RadioGroup) view.findViewById(R.id.rb_mou);
        RadioGroup rbMoyes = (RadioGroup) view.findViewById(R.id.rb_moyes);
        return view;
    }

    public void onClick(View v){
        switch (v.getId()){
            case  R.id.btn_close:
                break;
            case R.id.btn_choose:
                int checkedRadioButtonId = rgoptions.getCheckedRadioButtonId();
                if (checkedRadioButtonId != -1){
                    String coach = null;
                    switch (checkedRadioButtonId){
                        case R.id.rb_saf:
                            coach = rbSaf.getText().toString().trim();
                            break;
                        case R.id.rb_mou:
                            coach = rbMou.getText().toString().trim();
                            break;
                            case R.id.rb_lvg;
                            coach = rbLvg.getText().toString().trim();
                            break;
                        case R.id.rb_moyes:
                            coach = rbMoyes.getText().toString().trim();
                            break;
                    }
                    getOnOptionDialogListener().onOptionChoosen (coach);
                    getDialog().cancel();
                }
                break;
        }
    }
    public interface  OnOptionDialogListener{
        void onOptionChoosen(String text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_option_dialog);
    }

    @Override


    }
