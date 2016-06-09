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
public class Cpp2 extends Activity {
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

        setContentView(R.layout.cpp12);
        calculate = (Button) findViewById(R.id.button12);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup120);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1200);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1201);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1202);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1203);
                result = (EditText) findViewById(R.id.res121);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup121);
                option1 = (RadioButton) findViewById(R.id.radio1210);
                option2 = (RadioButton) findViewById(R.id.radio1211);
                option3 = (RadioButton) findViewById(R.id.radio1212);
                option4 = (RadioButton) findViewById(R.id.radio1213);
                result = (EditText) findViewById(R.id.res121);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option1.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup122);
                option1 = (RadioButton) findViewById(R.id.radio1220);
                option2 = (RadioButton) findViewById(R.id.radio1221);
                option3 = (RadioButton) findViewById(R.id.radio1222);
                option4 = (RadioButton) findViewById(R.id.radio1223);
                result = (EditText) findViewById(R.id.res122);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup123);
                option1 = (RadioButton) findViewById(R.id.radio1230);
                option2 = (RadioButton) findViewById(R.id.radio1231);
                option3 = (RadioButton) findViewById(R.id.radio1232);
                option4 = (RadioButton) findViewById(R.id.radio1233);
                result = (EditText) findViewById(R.id.res123);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup124);
                option1 = (RadioButton) findViewById(R.id.radio1240);
                option2 = (RadioButton) findViewById(R.id.radio1241);
                option3 = (RadioButton) findViewById(R.id.radio1242);
                option4 = (RadioButton) findViewById(R.id.radio1243);
                result = (EditText) findViewById(R.id.res124);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup125);
                option1 = (RadioButton) findViewById(R.id.radio1250);
                option2 = (RadioButton) findViewById(R.id.radio1251);
                option3 = (RadioButton) findViewById(R.id.radio1252);
                option4 = (RadioButton) findViewById(R.id.radio1253);
                result = (EditText) findViewById(R.id.res125);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup126);
                option1 = (RadioButton) findViewById(R.id.radio1260);
                option2 = (RadioButton) findViewById(R.id.radio1261);
                option3 = (RadioButton) findViewById(R.id.radio1262);
                option4 = (RadioButton) findViewById(R.id.radio1263);
                result = (EditText) findViewById(R.id.res126);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup127);
                option1 = (RadioButton) findViewById(R.id.radio1270);
                option2 = (RadioButton) findViewById(R.id.radio1271);
                option3 = (RadioButton) findViewById(R.id.radio1272);
                option4 = (RadioButton) findViewById(R.id.radio1273);
                result = (EditText) findViewById(R.id.res127);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option1.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup128);
                option1 = (RadioButton) findViewById(R.id.radio1280);
                option2 = (RadioButton) findViewById(R.id.radio1281);
                option3 = (RadioButton) findViewById(R.id.radio1282);
                option4 = (RadioButton) findViewById(R.id.radio1283);
                result = (EditText) findViewById(R.id.res128);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup129);
                option1 = (RadioButton) findViewById(R.id.radio1290);
                option2 = (RadioButton) findViewById(R.id.radio1291);
                option3 = (RadioButton) findViewById(R.id.radio1292);
                option4 = (RadioButton) findViewById(R.id.radio1293);
                result = (EditText) findViewById(R.id.res129);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score12);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
