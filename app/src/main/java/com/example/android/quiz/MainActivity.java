/**
 * if-else
 * toast msg with score when grading button is clicked
 * grading logic: check if correct ans is checked AND incorrect ones are not checked
 */
package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQ1(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q1O1:
                if (checked) {
                    break;
                }
            case R.id.Q1O2:
                if (checked) {
                    break;
                }
            case R.id.Q1O3:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q1O4:
                if (checked) {
                    break;
                }
        }
    }

    public void checkQ2(View v) {
        CheckBox chk1 = findViewById(R.id.Q2O1);
        CheckBox chk2 = findViewById(R.id.Q2O2);
        CheckBox chk3 = findViewById(R.id.Q2O3);
        CheckBox chk4 = findViewById(R.id.Q2O4);

        if (chk1.isChecked() && !chk2.isChecked() && chk3.isChecked() && chk4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ3(View v) {
        rbtn1 = findViewById(R.id.Q3O1);
        rbtn2 = findViewById(R.id.Q3O2);
        rbtn3 = findViewById(R.id.Q3O3);
        rbtn4 = findViewById(R.id.Q3O4);

        if (rbtn1.isChecked() && !rbtn2.isChecked() && !rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ4(View v) {
        rbtn1 = findViewById(R.id.Q4O1);
        rbtn2 = findViewById(R.id.Q4O2);
        rbtn3 = findViewById(R.id.Q4O3);
        rbtn4 = findViewById(R.id.Q4O4);

        if (rbtn1.isChecked() && !rbtn2.isChecked() && !rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ5(View v) {
        rbtn1 = findViewById(R.id.Q5O1);
        rbtn2 = findViewById(R.id.Q5O2);
        rbtn3 = findViewById(R.id.Q5O3);
        rbtn4 = findViewById(R.id.Q5O4);

        if (!rbtn1.isChecked() && !rbtn2.isChecked() && !rbtn3.isChecked() && rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ6(View v) {
        rbtn1 = findViewById(R.id.Q6O1);
        rbtn2 = findViewById(R.id.Q6O2);
        rbtn3 = findViewById(R.id.Q6O3);
        rbtn4 = findViewById(R.id.Q6O4);

        if (!rbtn1.isChecked() && !rbtn2.isChecked() && !rbtn3.isChecked() && rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ7(View v) {
        rbtn1 = findViewById(R.id.Q7O1);
        rbtn2 = findViewById(R.id.Q7O2);
        rbtn3 = findViewById(R.id.Q7O3);
        rbtn4 = findViewById(R.id.Q7O4);

        if (rbtn1.isChecked() && !rbtn2.isChecked() && !rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ8(View v) {
        rbtn1 = findViewById(R.id.Q8O1);
        rbtn2 = findViewById(R.id.Q8O2);
        rbtn3 = findViewById(R.id.Q8O3);
        rbtn4 = findViewById(R.id.Q8O4);

        if (!rbtn1.isChecked() && !rbtn2.isChecked() && rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ9(View v) {
        rbtn1 = findViewById(R.id.Q9O1);
        rbtn2 = findViewById(R.id.Q9O2);
        rbtn3 = findViewById(R.id.Q9O3);
        rbtn4 = findViewById(R.id.Q9O4);

        if (!rbtn1.isChecked() && rbtn2.isChecked() && !rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void checkQ10(View v) {
        rbtn1 = findViewById(R.id.Q10O1);
        rbtn2 = findViewById(R.id.Q10O2);
        rbtn3 = findViewById(R.id.Q10O3);
        rbtn4 = findViewById(R.id.Q10O4);

        if (!rbtn1.isChecked() && rbtn2.isChecked() && !rbtn3.isChecked() && !rbtn4.isChecked()) {
            score += 1;
        }
    }

    public void submitAnswers(View view) {
        EditText text = findViewById(R.id.name);
        String name = text.getText().toString();

        Toast.makeText(this, "Hello, " + name + ". You scored " + score + " out of 10.", Toast.LENGTH_SHORT).show();
    }
}