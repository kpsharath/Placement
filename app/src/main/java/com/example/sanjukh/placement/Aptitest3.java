package com.example.sanjukh.placement;

/**
 * Created by sanjukh on 01-04-2016.
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
public class Aptitest3 extends Activity {
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

        setContentView(R.layout.aptitest3);
        calculate = (Button) findViewById(R.id.button3);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int score = 0;

                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup30);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio301);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio302);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio303);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio304);
                EditText ans = (EditText) findViewById(R.id.res30);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");


                rg = (RadioGroup) findViewById(R.id.radioGroup31);
                option1 = (RadioButton) findViewById(R.id.radio311);
                option2 = (RadioButton) findViewById(R.id.radio312);
                option3 = (RadioButton) findViewById(R.id.radio313);
                option4 = (RadioButton) findViewById(R.id.radio314);
                ans = (EditText) findViewById(R.id.res31);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    ans.setText("Your answer is WRONG");

                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                rg = (RadioGroup) findViewById(R.id.radioGroup32);
                option1 = (RadioButton) findViewById(R.id.radio321);
                option2 = (RadioButton) findViewById(R.id.radio322);
                option3 = (RadioButton) findViewById(R.id.radio323);
                option4 = (RadioButton) findViewById(R.id.radio324);
                ans = (EditText) findViewById(R.id.res32);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                rg = (RadioGroup) findViewById(R.id.radioGroup33);
                option1 = (RadioButton) findViewById(R.id.radio331);
                option2 = (RadioButton) findViewById(R.id.radio332);
                option3 = (RadioButton) findViewById(R.id.radio333);
                option4 = (RadioButton) findViewById(R.id.radio334);
                ans = (EditText) findViewById(R.id.res33);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup34);
                option1 = (RadioButton) findViewById(R.id.radio341);
                option2 = (RadioButton) findViewById(R.id.radio342);
                option3 = (RadioButton) findViewById(R.id.radio343);
                option4 = (RadioButton) findViewById(R.id.radio344);
                ans = (EditText) findViewById(R.id.res34);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup35);
                option1 = (RadioButton) findViewById(R.id.radio351);
                option2 = (RadioButton) findViewById(R.id.radio352);
                option3 = (RadioButton) findViewById(R.id.radio353);
                option4 = (RadioButton) findViewById(R.id.radio354);
                ans = (EditText) findViewById(R.id.res35);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup36);
                option1 = (RadioButton) findViewById(R.id.radio361);
                option2 = (RadioButton) findViewById(R.id.radio362);
                option3 = (RadioButton) findViewById(R.id.radio363);
                option4 = (RadioButton) findViewById(R.id.radio364);
                ans = (EditText) findViewById(R.id.res36);
                if (option1.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option4.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup37);
                option1 = (RadioButton) findViewById(R.id.radio371);
                option2 = (RadioButton) findViewById(R.id.radio372);
                option3 = (RadioButton) findViewById(R.id.radio373);
                option4 = (RadioButton) findViewById(R.id.radio374);
                ans = (EditText) findViewById(R.id.res37);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup38);
                option1 = (RadioButton) findViewById(R.id.radio381);
                option2 = (RadioButton) findViewById(R.id.radio382);
                option3 = (RadioButton) findViewById(R.id.radio383);
                option4 = (RadioButton) findViewById(R.id.radio384);
                ans = (EditText) findViewById(R.id.res38);
                if (option1.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option2.isChecked() || option4.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup39);
                option1 = (RadioButton) findViewById(R.id.radio391);
                option2 = (RadioButton) findViewById(R.id.radio392);
                option3 = (RadioButton) findViewById(R.id.radio393);
                option4 = (RadioButton) findViewById(R.id.radio394);
                ans = (EditText) findViewById(R.id.res39);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                //rg.clearCheck();


                EditText scoreLabel = (EditText) findViewById(R.id.score3);
                scoreLabel.setText("Your score is "+score+"/100");

            }


        });


    }
}
