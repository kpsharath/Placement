package com.example.sanjukh.placement;

/**
 * Created by amar on 13-05-2016.
 */
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
public class Java5 extends Activity {
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

        setContentView(R.layout.java10);
        calculate = (Button) findViewById(R.id.button10);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup100);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1000);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1001);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1002);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1003);
                result = (EditText) findViewById(R.id.res101);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup101);
                option1 = (RadioButton) findViewById(R.id.radio1010);
                option2 = (RadioButton) findViewById(R.id.radio1011);
                option3 = (RadioButton) findViewById(R.id.radio1012);
                option4 = (RadioButton) findViewById(R.id.radio1013);
                result = (EditText) findViewById(R.id.res101);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup102);
                option1 = (RadioButton) findViewById(R.id.radio1020);
                option2 = (RadioButton) findViewById(R.id.radio1021);
                option3 = (RadioButton) findViewById(R.id.radio1022);
                option4 = (RadioButton) findViewById(R.id.radio1023);
                result = (EditText) findViewById(R.id.res102);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup103);
                option1 = (RadioButton) findViewById(R.id.radio1030);
                option2 = (RadioButton) findViewById(R.id.radio1031);
                option3 = (RadioButton) findViewById(R.id.radio1032);
                option4 = (RadioButton) findViewById(R.id.radio1033);
                result = (EditText) findViewById(R.id.res103);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup104);
                option1 = (RadioButton) findViewById(R.id.radio1040);
                option2 = (RadioButton) findViewById(R.id.radio1041);
                option3 = (RadioButton) findViewById(R.id.radio1042);
                option4 = (RadioButton) findViewById(R.id.radio1043);
                result = (EditText) findViewById(R.id.res104);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup105);
                option1 = (RadioButton) findViewById(R.id.radio1050);
                option2 = (RadioButton) findViewById(R.id.radio1051);
                option3 = (RadioButton) findViewById(R.id.radio1052);
                option4 = (RadioButton) findViewById(R.id.radio1053);
                result = (EditText) findViewById(R.id.res105);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup106);
                option1 = (RadioButton) findViewById(R.id.radio1060);
                option2 = (RadioButton) findViewById(R.id.radio1061);
                option3 = (RadioButton) findViewById(R.id.radio1062);
                option4 = (RadioButton) findViewById(R.id.radio1063);
                result = (EditText) findViewById(R.id.res106);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup107);
                option1 = (RadioButton) findViewById(R.id.radio1070);
                option2 = (RadioButton) findViewById(R.id.radio1071);
                option3 = (RadioButton) findViewById(R.id.radio1072);
                option4 = (RadioButton) findViewById(R.id.radio1073);
                result = (EditText) findViewById(R.id.res107);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup108);
                option1 = (RadioButton) findViewById(R.id.radio1080);
                option2 = (RadioButton) findViewById(R.id.radio1081);
                option3 = (RadioButton) findViewById(R.id.radio1082);
                option4 = (RadioButton) findViewById(R.id.radio1083);
                result = (EditText) findViewById(R.id.res108);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup109);
                option1 = (RadioButton) findViewById(R.id.radio1090);
                option2 = (RadioButton) findViewById(R.id.radio1091);
                option3 = (RadioButton) findViewById(R.id.radio1092);
                option4 = (RadioButton) findViewById(R.id.radio1093);
                result = (EditText) findViewById(R.id.res109);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score10);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
