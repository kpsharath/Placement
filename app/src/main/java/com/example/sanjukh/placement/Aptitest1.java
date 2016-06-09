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
public class Aptitest1 extends Activity {
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

        setContentView(R.layout.aptitest1);
        calculate = (Button) findViewById(R.id.button1);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int scorec=0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup10);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio100);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio101);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio102);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio103);
                result = (EditText) findViewById(R.id.res11);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");


                rg = (RadioGroup) findViewById(R.id.radioGroup11);
                option1 = (RadioButton) findViewById(R.id.radio110);
                option2 = (RadioButton) findViewById(R.id.radio111);
                option3 = (RadioButton) findViewById(R.id.radio112);
                option4 = (RadioButton) findViewById(R.id.radio113);
                result = (EditText) findViewById(R.id.res11);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted!");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup12);
                option1 = (RadioButton) findViewById(R.id.radio120);
                option2 = (RadioButton) findViewById(R.id.radio121);
                option3 = (RadioButton) findViewById(R.id.radio122);
                option4 = (RadioButton) findViewById(R.id.radio123);
                result = (EditText) findViewById(R.id.res12);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup13);
                option1 = (RadioButton) findViewById(R.id.radio130);
                option2 = (RadioButton) findViewById(R.id.radio131);
                option3 = (RadioButton) findViewById(R.id.radio132);
                option4 = (RadioButton) findViewById(R.id.radio133);
                result = (EditText) findViewById(R.id.res13);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();
                rg = (RadioGroup) findViewById(R.id.radioGroup14);
                option1 = (RadioButton) findViewById(R.id.radio140);
                option2 = (RadioButton) findViewById(R.id.radio141);
                option3 = (RadioButton) findViewById(R.id.radio142);
                option4 = (RadioButton) findViewById(R.id.radio143);
                result = (EditText) findViewById(R.id.res14);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup15);
                option1 = (RadioButton) findViewById(R.id.radio150);
                option2 = (RadioButton) findViewById(R.id.radio151);
                option3 = (RadioButton) findViewById(R.id.radio152);
                option4 = (RadioButton) findViewById(R.id.radio153);
                result = (EditText) findViewById(R.id.res15);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup16);
                option1 = (RadioButton) findViewById(R.id.radio160);
                option2 = (RadioButton) findViewById(R.id.radio161);
                option3 = (RadioButton) findViewById(R.id.radio162);
                option4 = (RadioButton) findViewById(R.id.radio163);
                result = (EditText) findViewById(R.id.res16);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup17);
                option1 = (RadioButton) findViewById(R.id.radio170);
                option2 = (RadioButton) findViewById(R.id.radio171);
                option3 = (RadioButton) findViewById(R.id.radio172);
                option4 = (RadioButton) findViewById(R.id.radio173);
                result = (EditText) findViewById(R.id.res17);
                if (option3.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup18);
                option1 = (RadioButton) findViewById(R.id.radio180);
                option2 = (RadioButton) findViewById(R.id.radio181);
                option3 = (RadioButton) findViewById(R.id.radio182);
                option4 = (RadioButton) findViewById(R.id.radio183);
                result = (EditText) findViewById(R.id.res18);
                if (option2.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");

                rg = (RadioGroup) findViewById(R.id.radioGroup19);
                option1 = (RadioButton) findViewById(R.id.radio190);
                option2 = (RadioButton) findViewById(R.id.radio191);
                option3 = (RadioButton) findViewById(R.id.radio192);
                option4 = (RadioButton) findViewById(R.id.radio193);
                result = (EditText) findViewById(R.id.res19);
                if (option4.isChecked()) {
                    result.setText("CORRECT");
                    ++scorec;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    result.setText("INCORRECT");
                } else
                    result.setText("Not attempted");



                EditText sc = (EditText) findViewById(R.id.score1);
                sc.setText("Your score is " + scorec * 10+"/100");
            }


        });
    }
}