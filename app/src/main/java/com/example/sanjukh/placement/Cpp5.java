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
public class Cpp5 extends Activity {
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

        setContentView(R.layout.cpp15);
        calculate = (Button) findViewById(R.id.button15);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup150);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1500);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1501);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1502);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1503);
                result = (EditText) findViewById(R.id.res151);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup151);
                option1 = (RadioButton) findViewById(R.id.radio1510);
                option2 = (RadioButton) findViewById(R.id.radio1511);
                option3 = (RadioButton) findViewById(R.id.radio1512);
                option4 = (RadioButton) findViewById(R.id.radio1513);
                result = (EditText) findViewById(R.id.res151);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup152);
                option1 = (RadioButton) findViewById(R.id.radio1520);
                option2 = (RadioButton) findViewById(R.id.radio1521);
                option3 = (RadioButton) findViewById(R.id.radio1522);
                option4 = (RadioButton) findViewById(R.id.radio1523);
                result = (EditText) findViewById(R.id.res152);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup153);
                option1 = (RadioButton) findViewById(R.id.radio1530);
                option2 = (RadioButton) findViewById(R.id.radio1531);
                option3 = (RadioButton) findViewById(R.id.radio1532);
                option4 = (RadioButton) findViewById(R.id.radio1533);
                result = (EditText) findViewById(R.id.res153);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup154);
                option1 = (RadioButton) findViewById(R.id.radio1540);
                option2 = (RadioButton) findViewById(R.id.radio1541);
                option3 = (RadioButton) findViewById(R.id.radio1542);
                option4 = (RadioButton) findViewById(R.id.radio1543);
                result = (EditText) findViewById(R.id.res154);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup155);
                option1 = (RadioButton) findViewById(R.id.radio1550);
                option2 = (RadioButton) findViewById(R.id.radio1551);
                option3 = (RadioButton) findViewById(R.id.radio1552);
                option4 = (RadioButton) findViewById(R.id.radio1553);
                result = (EditText) findViewById(R.id.res155);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup156);
                option1 = (RadioButton) findViewById(R.id.radio1560);
                option2 = (RadioButton) findViewById(R.id.radio1561);
                option3 = (RadioButton) findViewById(R.id.radio1562);
                option4 = (RadioButton) findViewById(R.id.radio1563);
                result = (EditText) findViewById(R.id.res156);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup157);
                option1 = (RadioButton) findViewById(R.id.radio1570);
                option2 = (RadioButton) findViewById(R.id.radio1571);
                option3 = (RadioButton) findViewById(R.id.radio1572);
                option4 = (RadioButton) findViewById(R.id.radio1573);
                result = (EditText) findViewById(R.id.res157);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup158);
                option1 = (RadioButton) findViewById(R.id.radio1580);
                option2 = (RadioButton) findViewById(R.id.radio1581);
                option3 = (RadioButton) findViewById(R.id.radio1582);
                option4 = (RadioButton) findViewById(R.id.radio1583);
                result = (EditText) findViewById(R.id.res158);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup159);
                option1 = (RadioButton) findViewById(R.id.radio1590);
                option2 = (RadioButton) findViewById(R.id.radio1591);
                option3 = (RadioButton) findViewById(R.id.radio1592);
                option4 = (RadioButton) findViewById(R.id.radio1593);
                result = (EditText) findViewById(R.id.res159);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score15);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}