package com.example.sanjukh.placement;

import android.app.Fragment;
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

public class Java_frag extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        //System.out.println("YUP");
        //return inflater.inflate(R.layout.java_main,container,false);
        // return super.onCreateView(inflater,container,savedInstanceState);
        View v =  inflater.inflate(R.layout.java_main,container,false);
        // return super.onCreateView(inflater,container,savedInstanceState);
        Button b = (Button) v.findViewById(R.id.java1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Java1.class));
                //  v =  inflater.inflate(R.layout.activity_main,container,false);
            }
        });

        b = (Button) v.findViewById(R.id.java2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Java2.class));

            }
        });

        b = (Button) v.findViewById(R.id.java3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Java3.class));
            }
        });

        b = (Button) v.findViewById(R.id.java4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Java4.class));
            }
        });

        b = (Button) v.findViewById(R.id.java5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Java5.class));
            }
        });


        return v;

    }
}

