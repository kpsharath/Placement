package com.example.sanjukh.placement;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;


/**
 * Created by kp on 13-05-2016.
 */
public class Vivz_Adapter extends RecyclerView.Adapter<Vivz_Adapter.MyViewHolder> {

    private LayoutInflater inflater;
    List<Cardview_information> data = Collections.emptyList() ;
    public Context context;


    public Vivz_Adapter(Context context,List<Cardview_information> data)
    {
        inflater = LayoutInflater.from(context);
        this.context=context;
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.custom_row, parent, false);
        Log.d("VIVZ","onCreateHolder called");
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,int position )
    {
        Cardview_information current=data.get(position);
        Log.d("VIVZ", "onCreateHolder called " + position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconid);

    }
    @Override
    public  int getItemCount()
    {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView icon;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.list_title);
            icon = (ImageView) itemView.findViewById(R.id.list_icon);
            icon.setOnClickListener(this);
            title.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            //View parent = (View) v.getParent();
            //Toast.makeText(context,"Item Clicked " + getPosition(),Toast.LENGTH_SHORT).show();
           // View view = inflater.inflate(R.layout.news_feed_informaton_1, container, false);
            /*if(parent != null) {
                TextView Text_title = (TextView) v.findViewById(R.id.news_feed_title);
                TextView Text_informaation = (TextView) v.findViewById(R.id.news_feed_information);
                Text_title.setText(titles[getPosition()]);
                Text_informaation.setText(information[getPosition()]);
            }*/
            //String t = context.getResources().getString(R.string.title);
            //t = titles[getPosition()];

           /* if(parent != null) {
                TextView Text_title = (TextView) parent.findViewById(R.id.news_feed_title);
                Text_title.setText(titles[getPosition()]);
            }*/
            //Toast.makeText(context,t + " " + getPosition(),Toast.LENGTH_SHORT).show();
            //String i = R.string.information;
            switch (getPosition())
            {
                case 0:
                    context.startActivity(new Intent(context, Newsfeed_information_1.class));
                    break;
                case 1:
                    context.startActivity(new Intent(context, Newsfeed_information_2.class));
                    break;
                case 2:
                    context.startActivity(new Intent(context, Newsfeed_information_3.class));
                    break;
            }
        }
    }

}
