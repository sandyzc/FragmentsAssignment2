package com.sandyz.fragmentsassignment2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class OutputFragment extends Fragment {

    TextView textView;

    public OutputFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_output,container,false);
    }

    @Override
    public void onStart() {

        Bundle bundle = getArguments();

        if (bundle != null){

            textView=(TextView)getActivity().findViewById(R.id.putputext);
            textView.setText(bundle.getString("Title"));

        }





        super.onStart();
    }
}
