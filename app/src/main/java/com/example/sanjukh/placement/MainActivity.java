package com.example.sanjukh.placement;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newlayout =(Button) findViewById(R.id.aptitest1);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), Aptitest1.class);
// set the new task and clear flags
                //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                //startActivity(i);
                startActivity(new Intent(getApplicationContext(), Aptitest1.class));

                }
            });

        newlayout=(Button) findViewById(R.id.aptitest2);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Aptitest2.class));

            }
        });
        newlayout= (Button) findViewById(R.id.aptitest3);
        newlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Aptitest3.class));

            }
        });
        

    }
}


