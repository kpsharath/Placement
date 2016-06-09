package com.example.sanjukh.placement;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kp on 19-04-2016.
 */
public class Newsfeed_frag extends Fragment {
    private RecyclerView recyclerView;
    private Vivz_Adapter adapter;

    CardView cardView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.news_feed, container, false);
        recyclerView = (RecyclerView)layout.findViewById(R.id.drawerList);

        adapter = new Vivz_Adapter(getActivity(),getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        /*cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getFragmentManager(), "pressed on card 1", Toast.LENGTH_SHORT).show();

                //startActivity(new Intent(getApplicationContext(),));
            }
        });
        */
        return layout;
    }
    public static List<Cardview_information> getData()
    {
        List<Cardview_information> data=new ArrayList<>();
        int[] icons={R.drawable.newfeed_1,R.drawable.newsfeed2,R.drawable.newsfeed3};
        String[] titles={"Failing to prepare is preparing to fail","DOs and DON'Ts","Art of building a good resume"};
        for (int i=0;i<icons.length && i < titles.length;++i)
        {
            Cardview_information current= new Cardview_information();
            current.iconid=icons[i];
            current.title=titles[i];
            data.add(current);
        }
        return data;
    }
}