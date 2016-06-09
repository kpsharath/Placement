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
public class Cpp1 extends Activity {
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

        setContentView(R.layout.cpp11);
        calculate = (Button) findViewById(R.id.button11);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup110);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1100);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1101);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1102);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1103);
                result = (EditText) findViewById(R.id.res111);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup111);
                option1 = (RadioButton) findViewById(R.id.radio1110);
                option2 = (RadioButton) findViewById(R.id.radio1111);
                option3 = (RadioButton) findViewById(R.id.radio1112);
                option4 = (RadioButton) findViewById(R.id.radio1113);
                result = (EditText) findViewById(R.id.res111);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option1.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup112);
                option1 = (RadioButton) findViewById(R.id.radio1120);
                option2 = (RadioButton) findViewById(R.id.radio1121);
                option3 = (RadioButton) findViewById(R.id.radio1122);
                option4 = (RadioButton) findViewById(R.id.radio1123);
                result = (EditText) findViewById(R.id.res112);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup113);
                option1 = (RadioButton) findViewById(R.id.radio1130);
                option2 = (RadioButton) findViewById(R.id.radio1131);
                option3 = (RadioButton) findViewById(R.id.radio1132);
                option4 = (RadioButton) findViewById(R.id.radio1133);
                result = (EditText) findViewById(R.id.res113);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup114);
                option1 = (RadioButton) findViewById(R.id.radio1140);
                option2 = (RadioButton) findViewById(R.id.radio1141);
                option3 = (RadioButton) findViewById(R.id.radio1142);
                option4 = (RadioButton) findViewById(R.id.radio1143);
                result = (EditText) findViewById(R.id.res114);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option1.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup115);
                option1 = (RadioButton) findViewById(R.id.radio1150);
                option2 = (RadioButton) findViewById(R.id.radio1151);
                option3 = (RadioButton) findViewById(R.id.radio1152);
                option4 = (RadioButton) findViewById(R.id.radio1153);
                result = (EditText) findViewById(R.id.res115);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup116);
                option1 = (RadioButton) findViewById(R.id.radio1160);
                option2 = (RadioButton) findViewById(R.id.radio1161);
                option3 = (RadioButton) findViewById(R.id.radio1162);
                option4 = (RadioButton) findViewById(R.id.radio1163);
                result = (EditText) findViewById(R.id.res116);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option4.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup117);
                option1 = (RadioButton) findViewById(R.id.radio1170);
                option2 = (RadioButton) findViewById(R.id.radio1171);
                option3 = (RadioButton) findViewById(R.id.radio1172);
                option4 = (RadioButton) findViewById(R.id.radio1173);
                result = (EditText) findViewById(R.id.res117);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup118);
                option1 = (RadioButton) findViewById(R.id.radio1180);
                option2 = (RadioButton) findViewById(R.id.radio1181);
                option3 = (RadioButton) findViewById(R.id.radio1182);
                option4 = (RadioButton) findViewById(R.id.radio1183);
                result = (EditText) findViewById(R.id.res118);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup119);
                option1 = (RadioButton) findViewById(R.id.radio1190);
                option2 = (RadioButton) findViewById(R.id.radio1191);
                option3 = (RadioButton) findViewById(R.id.radio1192);
                option4 = (RadioButton) findViewById(R.id.radio1193);
                result = (EditText) findViewById(R.id.res119);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score11);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}