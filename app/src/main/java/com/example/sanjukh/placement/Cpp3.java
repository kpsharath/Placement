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
public class Cpp3 extends Activity {
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

        setContentView(R.layout.cpp13);
        calculate = (Button) findViewById(R.id.button13);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup130);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1300);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1301);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1302);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1303);
                result = (EditText) findViewById(R.id.res131);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup131);
                option1 = (RadioButton) findViewById(R.id.radio1310);
                option2 = (RadioButton) findViewById(R.id.radio1311);
                option3 = (RadioButton) findViewById(R.id.radio1312);
                option4 = (RadioButton) findViewById(R.id.radio1313);
                result = (EditText) findViewById(R.id.res131);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup132);
                option1 = (RadioButton) findViewById(R.id.radio1320);
                option2 = (RadioButton) findViewById(R.id.radio1321);
                option3 = (RadioButton) findViewById(R.id.radio1322);
                option4 = (RadioButton) findViewById(R.id.radio1323);
                result = (EditText) findViewById(R.id.res132);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup133);
                option1 = (RadioButton) findViewById(R.id.radio1330);
                option2 = (RadioButton) findViewById(R.id.radio1331);
                option3 = (RadioButton) findViewById(R.id.radio1332);
                option4 = (RadioButton) findViewById(R.id.radio1333);
                result = (EditText) findViewById(R.id.res133);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup134);
                option1 = (RadioButton) findViewById(R.id.radio1340);
                option2 = (RadioButton) findViewById(R.id.radio1341);
                option3 = (RadioButton) findViewById(R.id.radio1342);
                option4 = (RadioButton) findViewById(R.id.radio1343);
                result = (EditText) findViewById(R.id.res134);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup135);
                option1 = (RadioButton) findViewById(R.id.radio1350);
                option2 = (RadioButton) findViewById(R.id.radio1351);
                option3 = (RadioButton) findViewById(R.id.radio1352);
                option4 = (RadioButton) findViewById(R.id.radio1353);
                result = (EditText) findViewById(R.id.res135);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup136);
                option1 = (RadioButton) findViewById(R.id.radio1360);
                option2 = (RadioButton) findViewById(R.id.radio1361);
                option3 = (RadioButton) findViewById(R.id.radio1362);
                option4 = (RadioButton) findViewById(R.id.radio1363);
                result = (EditText) findViewById(R.id.res136);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup137);
                option1 = (RadioButton) findViewById(R.id.radio1370);
                option2 = (RadioButton) findViewById(R.id.radio1371);
                option3 = (RadioButton) findViewById(R.id.radio1372);
                option4 = (RadioButton) findViewById(R.id.radio1373);
                result = (EditText) findViewById(R.id.res137);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup138);
                option1 = (RadioButton) findViewById(R.id.radio1380);
                option2 = (RadioButton) findViewById(R.id.radio1381);
                option3 = (RadioButton) findViewById(R.id.radio1382);
                option4 = (RadioButton) findViewById(R.id.radio1383);
                result = (EditText) findViewById(R.id.res138);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup139);
                option1 = (RadioButton) findViewById(R.id.radio1390);
                option2 = (RadioButton) findViewById(R.id.radio1391);
                option3 = (RadioButton) findViewById(R.id.radio1392);
                option4 = (RadioButton) findViewById(R.id.radio1393);
                result = (EditText) findViewById(R.id.res139);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score13);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
