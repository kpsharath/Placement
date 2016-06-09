package com.example.sanjukh.placement;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kp on 14-04-2016.
 */

public class Aptitude_frag extends Fragment implements FragmentManager.OnBackStackChangedListener{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        //System.out.println("YUP");
        View v =  inflater.inflate(R.layout.activity_main,container,false);
        // return super.onCreateView(inflater,container,savedInstanceState);
        Button b = (Button) v.findViewById(R.id.aptitest1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Aptitest1.class));
               //  v =  inflater.inflate(R.layout.activity_main,container,false);
            }
        });

        b = (Button) v.findViewById(R.id.aptitest2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Aptitest2.class));

            }
        });

        b = (Button) v.findViewById(R.id.aptitest3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Aptitest3.class));
            }
        });

        b = (Button) v.findViewById(R.id.aptitest4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Aptitest4.class));
            }
        });

        b = (Button) v.findViewById(R.id.aptitest5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Aptitest5.class));
            }
        });


        return v;
    }

    @Override
    public void onBackStackChanged() {
        startActivity(new Intent(getActivity(), Aptitest1.class));
    }
}

