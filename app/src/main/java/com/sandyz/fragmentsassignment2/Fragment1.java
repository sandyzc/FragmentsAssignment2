package com.sandyz.fragmentsassignment2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;


public class Fragment1 extends Fragment implements View.OnClickListener {

    OnFragmentListener mlistner;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;


    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        mlistner=(OnFragmentListener) this.getActivity();

        button1= (Button)view.findViewById(R.id.btn1);
        button2= (Button)view.findViewById(R.id.btn2);
        button3= (Button)view.findViewById(R.id.btn3);
        button4= (Button)view.findViewById(R.id.btn4);
        button5= (Button)view.findViewById(R.id.btn5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }






    @Override
    public void onClick(View v) {

        String text = "";
         switch(v.getId())
         {
             case R.id.btn1:
                 text = ((Button)v.findViewById(R.id.btn1)).getText().toString();
                 break;
             case R.id.btn2:
                 text = ((Button)v.findViewById(R.id.btn2)).getText().toString();
                 break;
             case R.id.btn3:
                 text = ((Button)v.findViewById(R.id.btn3)).getText().toString();
                 break;
             case R.id.btn4:
                 text = ((Button)v.findViewById(R.id.btn4)).getText().toString();
                 break;
             case R.id.btn5:
                 text = ((Button)v.findViewById(R.id.btn5)).getText().toString();
                 break;
         }
        mlistner.onItemclicked(text);

    }


    public interface OnFragmentListener {

        public void onItemclicked(String title);

        // TODO: Update argument type and name

    }

    public static OnFragmentListener xyz = new OnFragmentListener() {
        @Override
        public void onItemclicked(String title) {

        }
    };
}
