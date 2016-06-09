package com.example.sanjukh.placement;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by amar on 13-05-2016.
 */
public class Java4 extends Activity {

    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    Button calculate;
    EditText result;
    int scorec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.java9);
        calculate = (Button) findViewById(R.id.button9);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup90);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio900);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio901);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio902);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio903);
                result = (EditText) findViewById(R.id.res91);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup91);
                option1 = (RadioButton) findViewById(R.id.radio910);
                option2 = (RadioButton) findViewById(R.id.radio911);
                option3 = (RadioButton) findViewById(R.id.radio912);
                option4 = (RadioButton) findViewById(R.id.radio913);
                result = (EditText) findViewById(R.id.res91);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup92);
                option1 = (RadioButton) findViewById(R.id.radio920);
                option2 = (RadioButton) findViewById(R.id.radio921);
                option3 = (RadioButton) findViewById(R.id.radio922);
                option4 = (RadioButton) findViewById(R.id.radio923);
                result = (EditText) findViewById(R.id.res92);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup93);
                option1 = (RadioButton) findViewById(R.id.radio930);
                option2 = (RadioButton) findViewById(R.id.radio931);
                option3 = (RadioButton) findViewById(R.id.radio932);
                option4 = (RadioButton) findViewById(R.id.radio933);
                result = (EditText) findViewById(R.id.res93);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                option1 = (RadioButton) findViewById(R.id.radio940);
                option2 = (RadioButton) findViewById(R.id.radio941);
                option3 = (RadioButton) findViewById(R.id.radio942);
                option4 = (RadioButton) findViewById(R.id.radio943);
                result = (EditText) findViewById(R.id.res94);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup95);
                option1 = (RadioButton) findViewById(R.id.radio950);
                option2 = (RadioButton) findViewById(R.id.radio951);
                option3 = (RadioButton) findViewById(R.id.radio952);
                option4 = (RadioButton) findViewById(R.id.radio953);
                result = (EditText) findViewById(R.id.res95);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup96);
                option1 = (RadioButton) findViewById(R.id.radio960);
                option2 = (RadioButton) findViewById(R.id.radio961);
                option3 = (RadioButton) findViewById(R.id.radio962);
                option4 = (RadioButton) findViewById(R.id.radio963);
                result = (EditText) findViewById(R.id.res96);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup97);
                option1 = (RadioButton) findViewById(R.id.radio970);
                option2 = (RadioButton) findViewById(R.id.radio971);
                option3 = (RadioButton) findViewById(R.id.radio972);
                option4 = (RadioButton) findViewById(R.id.radio973);
                result = (EditText) findViewById(R.id.res97);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup98);
                option1 = (RadioButton) findViewById(R.id.radio980);
                option2 = (RadioButton) findViewById(R.id.radio981);
                option3 = (RadioButton) findViewById(R.id.radio982);
                option4 = (RadioButton) findViewById(R.id.radio983);
                result = (EditText) findViewById(R.id.res98);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");


                option1 = (RadioButton) findViewById(R.id.radio990);
                option2 = (RadioButton) findViewById(R.id.radio991);
                option3 = (RadioButton) findViewById(R.id.radio992);
                option4 = (RadioButton) findViewById(R.id.radio993);
                result = (EditText) findViewById(R.id.res99);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score9);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}
