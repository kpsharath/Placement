package com.example.sanjukh.placement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by kp on 17-04-2016.
 */
public class Java2 extends Activity {
    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }


    Button calculate;
    EditText result;
    int scorec=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.java7);
        calculate = (Button) findViewById(R.id.button7);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup70);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio700);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio701);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio702);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio703);
                result = (EditText) findViewById(R.id.res71);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup71);
                option1 = (RadioButton) findViewById(R.id.radio710);
                option2 = (RadioButton) findViewById(R.id.radio711);
                option3 = (RadioButton) findViewById(R.id.radio712);
                option4 = (RadioButton) findViewById(R.id.radio713);
                result = (EditText) findViewById(R.id.res71);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup72);
                option1 = (RadioButton) findViewById(R.id.radio720);
                option2 = (RadioButton) findViewById(R.id.radio721);
                option3 = (RadioButton) findViewById(R.id.radio722);
                option4 = (RadioButton) findViewById(R.id.radio723);
                result = (EditText) findViewById(R.id.res72);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup73);
                option1 = (RadioButton) findViewById(R.id.radio730);
                option2 = (RadioButton) findViewById(R.id.radio731);
                option3 = (RadioButton) findViewById(R.id.radio732);
                option4 = (RadioButton) findViewById(R.id.radio733);
                result = (EditText) findViewById(R.id.res73);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup74);
                option1 = (RadioButton) findViewById(R.id.radio740);
                option2 = (RadioButton) findViewById(R.id.radio741);
                option3 = (RadioButton) findViewById(R.id.radio742);
                option4 = (RadioButton) findViewById(R.id.radio743);
                result = (EditText) findViewById(R.id.res74);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup75);
                option1 = (RadioButton) findViewById(R.id.radio750);
                option2 = (RadioButton) findViewById(R.id.radio751);
                option3 = (RadioButton) findViewById(R.id.radio752);
                option4 = (RadioButton) findViewById(R.id.radio753);
                result = (EditText) findViewById(R.id.res75);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup76);
                option1 = (RadioButton) findViewById(R.id.radio760);
                option2 = (RadioButton) findViewById(R.id.radio761);
                option3 = (RadioButton) findViewById(R.id.radio762);
                option4 = (RadioButton) findViewById(R.id.radio763);
                result = (EditText) findViewById(R.id.res76);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup77);
                option1 = (RadioButton) findViewById(R.id.radio770);
                option2 = (RadioButton) findViewById(R.id.radio771);
                option3 = (RadioButton) findViewById(R.id.radio772);
                option4 = (RadioButton) findViewById(R.id.radio773);
                result = (EditText) findViewById(R.id.res77);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup78);
                option1 = (RadioButton) findViewById(R.id.radio780);
                option2 = (RadioButton) findViewById(R.id.radio781);
                option3 = (RadioButton) findViewById(R.id.radio782);
                option4 = (RadioButton) findViewById(R.id.radio783);
                result = (EditText) findViewById(R.id.res78);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup79);
                option1 = (RadioButton) findViewById(R.id.radio790);
                option2 = (RadioButton) findViewById(R.id.radio791);
                option3 = (RadioButton) findViewById(R.id.radio792);
                option4 = (RadioButton) findViewById(R.id.radio793);
                result = (EditText) findViewById(R.id.res79);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score7);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });


    }
}