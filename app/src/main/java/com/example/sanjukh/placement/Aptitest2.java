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
public class Aptitest2 extends Activity {
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

        setContentView(R.layout.aptitest2);
        calculate = (Button) findViewById(R.id.button2);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int score = 0;
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup21);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio211);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio212);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio213);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio214);
                EditText ans = (EditText) findViewById(R.id.res21);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option2.isChecked()) {
                    ans.setText("Your answer is WRONG");

                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup20);
                option1 = (RadioButton) findViewById(R.id.radio201);
                option2 = (RadioButton) findViewById(R.id.radio202);
                option3 = (RadioButton) findViewById(R.id.radio203);
                option4 = (RadioButton) findViewById(R.id.radio204);
                ans = (EditText) findViewById(R.id.res20);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");


                rg = (RadioGroup) findViewById(R.id.radioGroup22);
                option1 = (RadioButton) findViewById(R.id.radio221);
                option2 = (RadioButton) findViewById(R.id.radio222);
                option3 = (RadioButton) findViewById(R.id.radio223);
                option4 = (RadioButton) findViewById(R.id.radio224);
                ans = (EditText) findViewById(R.id.res22);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                rg = (RadioGroup) findViewById(R.id.radioGroup23);
                option1 = (RadioButton) findViewById(R.id.radio231);
                option2 = (RadioButton) findViewById(R.id.radio232);
                option3 = (RadioButton) findViewById(R.id.radio233);
                option4 = (RadioButton) findViewById(R.id.radio234);
                ans = (EditText) findViewById(R.id.res23);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup24);
                option1 = (RadioButton) findViewById(R.id.radio241);
                option2 = (RadioButton) findViewById(R.id.radio242);
                option3 = (RadioButton) findViewById(R.id.radio243);
                option4 = (RadioButton) findViewById(R.id.radio244);
                ans = (EditText) findViewById(R.id.res24);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup25);
                option1 = (RadioButton) findViewById(R.id.radio251);
                option2 = (RadioButton) findViewById(R.id.radio252);
                option3 = (RadioButton) findViewById(R.id.radio253);
                option4 = (RadioButton) findViewById(R.id.radio254);
                ans = (EditText) findViewById(R.id.res25);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option4.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup26);
                option1 = (RadioButton) findViewById(R.id.radio261);
                option2 = (RadioButton) findViewById(R.id.radio262);
                option3 = (RadioButton) findViewById(R.id.radio263);
                option4 = (RadioButton) findViewById(R.id.radio264);
                ans = (EditText) findViewById(R.id.res26);
                if (option1.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option3.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup27);
                option1 = (RadioButton) findViewById(R.id.radio271);
                option2 = (RadioButton) findViewById(R.id.radio272);
                option3 = (RadioButton) findViewById(R.id.radio273);
                option4 = (RadioButton) findViewById(R.id.radio274);
                ans = (EditText) findViewById(R.id.res27);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option4.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup28);
                option1 = (RadioButton) findViewById(R.id.radio281);
                option2 = (RadioButton) findViewById(R.id.radio282);
                option3 = (RadioButton) findViewById(R.id.radio283);
                option4 = (RadioButton) findViewById(R.id.radio284);
                ans = (EditText) findViewById(R.id.res28);
                if (option1.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option4.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup29);
                option1 = (RadioButton) findViewById(R.id.radio291);
                option2 = (RadioButton) findViewById(R.id.radio292);
                option3 = (RadioButton) findViewById(R.id.radio293);
                option4 = (RadioButton) findViewById(R.id.radio294);
                ans = (EditText) findViewById(R.id.res29);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                //rg.clearCheck();


                EditText scoreLabel = (EditText) findViewById(R.id.score2);
                scoreLabel.setText("Your score is " + score+"/100");
            }


        });
    }
}