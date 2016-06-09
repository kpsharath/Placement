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
public class Aptitest5 extends Activity {
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

        setContentView(R.layout.aptitest5);
        calculate = (Button) findViewById(R.id.button5);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup50);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio500);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio501);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio502);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio503);
                result = (EditText) findViewById(R.id.res51);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup51);
                option1 = (RadioButton) findViewById(R.id.radio510);
                option2 = (RadioButton) findViewById(R.id.radio511);
                option3 = (RadioButton) findViewById(R.id.radio512);
                option4 = (RadioButton) findViewById(R.id.radio513);
                result = (EditText) findViewById(R.id.res51);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup52);
                option1 = (RadioButton) findViewById(R.id.radio520);
                option2 = (RadioButton) findViewById(R.id.radio521);
                option3 = (RadioButton) findViewById(R.id.radio522);
                option4 = (RadioButton) findViewById(R.id.radio523);
                result = (EditText) findViewById(R.id.res52);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup53);
                option1 = (RadioButton) findViewById(R.id.radio530);
                option2 = (RadioButton) findViewById(R.id.radio531);
                option3 = (RadioButton) findViewById(R.id.radio532);
                option4 = (RadioButton) findViewById(R.id.radio533);
                result = (EditText) findViewById(R.id.res53);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup54);
                option1 = (RadioButton) findViewById(R.id.radio540);
                option2 = (RadioButton) findViewById(R.id.radio541);
                option3 = (RadioButton) findViewById(R.id.radio542);
                option4 = (RadioButton) findViewById(R.id.radio543);
                result = (EditText) findViewById(R.id.res54);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup55);
                option1 = (RadioButton) findViewById(R.id.radio550);
                option2 = (RadioButton) findViewById(R.id.radio551);
                option3 = (RadioButton) findViewById(R.id.radio552);
                option4 = (RadioButton) findViewById(R.id.radio553);
                result = (EditText) findViewById(R.id.res55);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option1.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup56);
                option1 = (RadioButton) findViewById(R.id.radio560);
                option2 = (RadioButton) findViewById(R.id.radio561);
                option3 = (RadioButton) findViewById(R.id.radio562);
                option4 = (RadioButton) findViewById(R.id.radio563);
                result = (EditText) findViewById(R.id.res56);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option4.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup57);
                option1 = (RadioButton) findViewById(R.id.radio570);
                option2 = (RadioButton) findViewById(R.id.radio571);
                option3 = (RadioButton) findViewById(R.id.radio572);
                option4 = (RadioButton) findViewById(R.id.radio573);
                result = (EditText) findViewById(R.id.res57);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup58);
                option1 = (RadioButton) findViewById(R.id.radio580);
                option2 = (RadioButton) findViewById(R.id.radio581);
                option3 = (RadioButton) findViewById(R.id.radio582);
                option4 = (RadioButton) findViewById(R.id.radio583);
                result = (EditText) findViewById(R.id.res58);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup59);
                option1 = (RadioButton) findViewById(R.id.radio590);
                option2 = (RadioButton) findViewById(R.id.radio591);
                option3 = (RadioButton) findViewById(R.id.radio592);
                option4 = (RadioButton) findViewById(R.id.radio593);
                result = (EditText) findViewById(R.id.res59);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score5);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
