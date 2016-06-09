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
public class Java3 extends Activity {
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

        setContentView(R.layout.java8);
        calculate = (Button) findViewById(R.id.button8);
        calculate.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                int score = 0;
                Toast.makeText(getApplicationContext(),"i am here",Toast.LENGTH_SHORT);
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup81);
                RadioButton option1 = (RadioButton) findViewById(R.id.radio810);
                RadioButton option2 = (RadioButton) findViewById(R.id.radio811);
                RadioButton option3 = (RadioButton) findViewById(R.id.radio812);
                RadioButton option4 = (RadioButton) findViewById(R.id.radio813);
                EditText ans = (EditText) findViewById(R.id.res81);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");

                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup80);
                option1 = (RadioButton) findViewById(R.id.radio800);
                option2 = (RadioButton) findViewById(R.id.radio801);
                option3 = (RadioButton) findViewById(R.id.radio802);
                option4 = (RadioButton) findViewById(R.id.radio803);
                ans = (EditText) findViewById(R.id.res80);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");

                rg = (RadioGroup) findViewById(R.id.radioGroup82);
                option1 = (RadioButton) findViewById(R.id.radio820);
                option2 = (RadioButton) findViewById(R.id.radio821);
                option3 = (RadioButton) findViewById(R.id.radio822);
                option4 = (RadioButton) findViewById(R.id.radio823);
                ans = (EditText) findViewById(R.id.res82);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();


                rg = (RadioGroup) findViewById(R.id.radioGroup83);
                option1 = (RadioButton) findViewById(R.id.radio830);
                option2 = (RadioButton) findViewById(R.id.radio831);
                option3 = (RadioButton) findViewById(R.id.radio832);
                option4 = (RadioButton) findViewById(R.id.radio833);
                ans = (EditText) findViewById(R.id.res83);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup84);
                option1 = (RadioButton) findViewById(R.id.radio840);
                option2 = (RadioButton) findViewById(R.id.radio841);
                option3 = (RadioButton) findViewById(R.id.radio842);
                option4 = (RadioButton) findViewById(R.id.radio843);
                ans = (EditText) findViewById(R.id.res84);
                if (option2.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option3.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup85);
                option1 = (RadioButton) findViewById(R.id.radio850);
                option2 = (RadioButton) findViewById(R.id.radio851);
                option3 = (RadioButton) findViewById(R.id.radio852);
                option4 = (RadioButton) findViewById(R.id.radio853);
                ans = (EditText) findViewById(R.id.res85);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup86);
                option1 = (RadioButton) findViewById(R.id.radio860);
                option2 = (RadioButton) findViewById(R.id.radio861);
                option3 = (RadioButton) findViewById(R.id.radio862);
                option4 = (RadioButton) findViewById(R.id.radio863);
                ans = (EditText) findViewById(R.id.res86);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup87);
                option2 = (RadioButton) findViewById(R.id.radio871);
                option3 = (RadioButton) findViewById(R.id.radio872);
                option4 = (RadioButton) findViewById(R.id.radio873);
                option1 = (RadioButton) findViewById(R.id.radio870);
                ans = (EditText) findViewById(R.id.res87);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup88);
                option1 = (RadioButton) findViewById(R.id.radio880);
                option2 = (RadioButton) findViewById(R.id.radio881);
                option3 = (RadioButton) findViewById(R.id.radio882);
                option4 = (RadioButton) findViewById(R.id.radio883);
                ans = (EditText) findViewById(R.id.res88);
                if (option4.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option3.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                rg = (RadioGroup) findViewById(R.id.radioGroup89);
                option1 = (RadioButton) findViewById(R.id.radio890);
                option2 = (RadioButton) findViewById(R.id.radio891);
                option3 = (RadioButton) findViewById(R.id.radio892);
                option4 = (RadioButton) findViewById(R.id.radio893);
                ans = (EditText) findViewById(R.id.res89);
                if (option3.isChecked()) {
                    ans.setText("Your answer is CORRECT");

                    score += 10;
                } else if (option1.isChecked() || option2.isChecked() || option4.isChecked()) {
                    ans.setText("Your answer is WRONG");


                } else
                    ans.setText("You have to choose one");
                //rg.clearCheck();

                //rg.clearCheck();


                EditText scoreLabel = (EditText) findViewById(R.id.score8);
                scoreLabel.setText("Your score is " + score+"/100");
            }


        }


    });
}
}