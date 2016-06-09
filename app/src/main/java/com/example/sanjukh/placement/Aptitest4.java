package com.example.sanjukh.placement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;
/**
 * Created by sanjukh on 01-04-2016.
 */
public class Aptitest4 extends Activity {
    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    Button calculate;
    EditText result;
    int scorec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aptitest4);
        calculate = (Button) findViewById(R.id.button4);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup40);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio400);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio401);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio402);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio403);
                result = (EditText) findViewById(R.id.res41);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup41);
                option1 = (RadioButton) findViewById(R.id.radio410);
                option2 = (RadioButton) findViewById(R.id.radio411);
                option3 = (RadioButton) findViewById(R.id.radio412);
                option4 = (RadioButton) findViewById(R.id.radio413);
                result = (EditText) findViewById(R.id.res41);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option1.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup42);
                option1 = (RadioButton) findViewById(R.id.radio420);
                option2 = (RadioButton) findViewById(R.id.radio421);
                option3 = (RadioButton) findViewById(R.id.radio422);
                option4 = (RadioButton) findViewById(R.id.radio423);
                result = (EditText) findViewById(R.id.res42);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup43);
                option1 = (RadioButton) findViewById(R.id.radio430);
                option2 = (RadioButton) findViewById(R.id.radio431);
                option3 = (RadioButton) findViewById(R.id.radio432);
                option4 = (RadioButton) findViewById(R.id.radio433);
                result = (EditText) findViewById(R.id.res43);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup44);
                option1 = (RadioButton) findViewById(R.id.radio440);
                option2 = (RadioButton) findViewById(R.id.radio441);
                option3 = (RadioButton) findViewById(R.id.radio442);
                option4 = (RadioButton) findViewById(R.id.radio443);
                result = (EditText) findViewById(R.id.res44);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup45);
                option1 = (RadioButton) findViewById(R.id.radio450);
                option2 = (RadioButton) findViewById(R.id.radio451);
                option3 = (RadioButton) findViewById(R.id.radio452);
                option4 = (RadioButton) findViewById(R.id.radio453);
                result = (EditText) findViewById(R.id.res45);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup46);
                option1 = (RadioButton) findViewById(R.id.radio460);
                option2 = (RadioButton) findViewById(R.id.radio461);
                option3 = (RadioButton) findViewById(R.id.radio462);
                option4 = (RadioButton) findViewById(R.id.radio463);
                result = (EditText) findViewById(R.id.res46);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup47);
                option1 = (RadioButton) findViewById(R.id.radio470);
                option2 = (RadioButton) findViewById(R.id.radio471);
                option3 = (RadioButton) findViewById(R.id.radio472);
                option4 = (RadioButton) findViewById(R.id.radio473);
                result = (EditText) findViewById(R.id.res47);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup48);
                option1 = (RadioButton) findViewById(R.id.radio480);
                option2 = (RadioButton) findViewById(R.id.radio481);
                option3 = (RadioButton) findViewById(R.id.radio482);
                option4 = (RadioButton) findViewById(R.id.radio483);
                result = (EditText) findViewById(R.id.res48);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option4.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup49);
                option1 = (RadioButton) findViewById(R.id.radio490);
                option2 = (RadioButton) findViewById(R.id.radio491);
                option3 = (RadioButton) findViewById(R.id.radio492);
                option4 = (RadioButton) findViewById(R.id.radio493);
                result = (EditText) findViewById(R.id.res49);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score4);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}