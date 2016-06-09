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
public class Java1 extends Activity {
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

        setContentView(R.layout.java6);
        calculate = (Button) findViewById(R.id.button6);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup60);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio600);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio601);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio602);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio603);
                result = (EditText) findViewById(R.id.res61);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup61);
                option1 = (RadioButton) findViewById(R.id.radio610);
                option2 = (RadioButton) findViewById(R.id.radio611);
                option3 = (RadioButton) findViewById(R.id.radio612);
                option4 = (RadioButton) findViewById(R.id.radio613);
                result = (EditText) findViewById(R.id.res61);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup62);
                option1 = (RadioButton) findViewById(R.id.radio620);
                option2 = (RadioButton) findViewById(R.id.radio621);
                option3 = (RadioButton) findViewById(R.id.radio622);
                option4 = (RadioButton) findViewById(R.id.radio623);
                result = (EditText) findViewById(R.id.res62);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup63);
                option1 = (RadioButton) findViewById(R.id.radio630);
                option2 = (RadioButton) findViewById(R.id.radio631);
                option3 = (RadioButton) findViewById(R.id.radio632);
                option4 = (RadioButton) findViewById(R.id.radio633);
                result = (EditText) findViewById(R.id.res63);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup64);
                option1 = (RadioButton) findViewById(R.id.radio640);
                option2 = (RadioButton) findViewById(R.id.radio641);
                option3 = (RadioButton) findViewById(R.id.radio642);
                option4 = (RadioButton) findViewById(R.id.radio643);
                result = (EditText) findViewById(R.id.res64);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup65);
                option1 = (RadioButton) findViewById(R.id.radio650);
                option2 = (RadioButton) findViewById(R.id.radio651);
                option3 = (RadioButton) findViewById(R.id.radio652);
                option4 = (RadioButton) findViewById(R.id.radio653);
                result = (EditText) findViewById(R.id.res65);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup66);
                option1 = (RadioButton) findViewById(R.id.radio660);
                option2 = (RadioButton) findViewById(R.id.radio661);
                option3 = (RadioButton) findViewById(R.id.radio662);
                option4 = (RadioButton) findViewById(R.id.radio663);
                result = (EditText) findViewById(R.id.res66);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup67);
                option1 = (RadioButton) findViewById(R.id.radio670);
                option2 = (RadioButton) findViewById(R.id.radio671);
                option3 = (RadioButton) findViewById(R.id.radio672);
                option4 = (RadioButton) findViewById(R.id.radio673);
                result = (EditText) findViewById(R.id.res67);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup68);
                option1 = (RadioButton) findViewById(R.id.radio680);
                option2 = (RadioButton) findViewById(R.id.radio681);
                option3 = (RadioButton) findViewById(R.id.radio682);
                option4 = (RadioButton) findViewById(R.id.radio683);
                result = (EditText) findViewById(R.id.res68);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup69);
                option1 = (RadioButton) findViewById(R.id.radio690);
                option2 = (RadioButton) findViewById(R.id.radio691);
                option3 = (RadioButton) findViewById(R.id.radio692);
                option4 = (RadioButton) findViewById(R.id.radio693);
                result = (EditText) findViewById(R.id.res69);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score6);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
