package com.sandyz.fragmentsassignment2;

import android.app.FragmentTransaction;import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        fragment1.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().add(R.id.activity_main,fragment1).commit();
    }

    @Override
    public void onItemclicked(String title) {

        OutputFragment outputFragment = new OutputFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Title",title);
        outputFragment.setArguments(bundle);
     FragmentTransaction transaction = getFragmentManager().beginTransaction();


        transaction.replace(R.id.activity_main,outputFragment);
        transaction.addToBackStack(null);
        transaction.commit();




    }
}
