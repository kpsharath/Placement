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

import com.example.sanjukh.placement.R;

import org.w3c.dom.Text;
/**
 * Created by sanjukh on 01-04-2016.
 */
public class Cpp4 extends Activity {
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

        setContentView(R.layout.cpp14);
        calculate = (Button) findViewById(R.id.button14);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup140);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio1400);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio1401);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio1402);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio1403);
                result = (EditText) findViewById(R.id.res140);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup141);
                option1 = (RadioButton) findViewById(R.id.radio1410);
                option2 = (RadioButton) findViewById(R.id.radio1411);
                option3 = (RadioButton) findViewById(R.id.radio1412);
                option4 = (RadioButton) findViewById(R.id.radio1413);
                result = (EditText) findViewById(R.id.res141);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup142);
                option1 = (RadioButton) findViewById(R.id.radio1420);
                option2 = (RadioButton) findViewById(R.id.radio1421);
                option3 = (RadioButton) findViewById(R.id.radio1422);
                option4 = (RadioButton) findViewById(R.id.radio1423);
                result = (EditText) findViewById(R.id.res142);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup143);
                option1 = (RadioButton) findViewById(R.id.radio1430);
                option2 = (RadioButton) findViewById(R.id.radio1431);
                option3 = (RadioButton) findViewById(R.id.radio1432);
                option4 = (RadioButton) findViewById(R.id.radio1433);
                result = (EditText) findViewById(R.id.res143);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup144);
                option1 = (RadioButton) findViewById(R.id.radio1440);
                option2 = (RadioButton) findViewById(R.id.radio1441);
                option3 = (RadioButton) findViewById(R.id.radio1442);
                option4 = (RadioButton) findViewById(R.id.radio1443);
                result = (EditText) findViewById(R.id.res144);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup145);
                option1 = (RadioButton) findViewById(R.id.radio1450);
                option2 = (RadioButton) findViewById(R.id.radio1451);
                option3 = (RadioButton) findViewById(R.id.radio1452);
                option4 = (RadioButton) findViewById(R.id.radio1453);
                result = (EditText) findViewById(R.id.res145);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup146);
                option1 = (RadioButton) findViewById(R.id.radio1460);
                option2 = (RadioButton) findViewById(R.id.radio1461);
                option3 = (RadioButton) findViewById(R.id.radio1462);
                option4 = (RadioButton) findViewById(R.id.radio1463);
                result = (EditText) findViewById(R.id.res146);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup147);
                option1 = (RadioButton) findViewById(R.id.radio1470);
                option2 = (RadioButton) findViewById(R.id.radio1471);
                option3 = (RadioButton) findViewById(R.id.radio1472);
                option4 = (RadioButton) findViewById(R.id.radio1473);
                result = (EditText) findViewById(R.id.res147);
                if (option1.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option2.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup148);
                option1 = (RadioButton) findViewById(R.id.radio1480);
                option2 = (RadioButton) findViewById(R.id.radio1481);
                option3 = (RadioButton) findViewById(R.id.radio1482);
                option4 = (RadioButton) findViewById(R.id.radio1483);
                result = (EditText) findViewById(R.id.res148);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup149);
                option1 = (RadioButton) findViewById(R.id.radio1490);
                option2 = (RadioButton) findViewById(R.id.radio1491);
                option3 = (RadioButton) findViewById(R.id.radio1492);
                option4 = (RadioButton) findViewById(R.id.radio1493);
                result = (EditText) findViewById(R.id.res149);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score14);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
