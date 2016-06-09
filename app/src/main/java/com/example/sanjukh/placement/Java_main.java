package com.example.sanjukh.placement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kp on 16-04-2016.
 */
public class Java_main extends Activity{
    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_main);
        Button newlayout =(Button) findViewById(R.id.java1);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), Aptitest1.class);
// set the new task and clear flags
                //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                //startActivity(i);
                startActivity(new Intent(getApplicationContext(), Java1.class));

            }
        });

        newlayout=(Button) findViewById(R.id.java2);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Java2.class));

            }
        });

        newlayout= (Button) findViewById(R.id.java3);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Java3.class));

            }
        });


        /*
        Button back = (Button) findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), navigation_drawer.class));

            }
        });
        */

    }


}
