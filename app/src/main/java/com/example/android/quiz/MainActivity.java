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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

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
                    score += 0;
                    break;
                }
            case R.id.Q1O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q1O3:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q1O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ2(View v) {
        CheckBox chk1 = findViewById(R.id.Q2O1);
        CheckBox chk2 = findViewById(R.id.Q2O2);
        CheckBox chk3 = findViewById(R.id.Q2O3);
        CheckBox chk4 = findViewById(R.id.Q2O4);

        if (chk1.isChecked() && chk2.isChecked() && chk3.isChecked() && !chk4.isChecked()) {
            score += 1;
        }

       /* boolean checked = ((CheckBox) v).isChecked();

        switch (v.getId()) {
            case R.id.Q2O2:
                if (checked) {
                    score += 0;
                    break;
                } else {
                    score += 1;
                }
        }*/
    }

    public void checkQ3(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q3O1:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q3O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q3O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q3O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ4(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q4O1:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q4O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q4O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q4O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ5(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q5O1:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q5O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q5O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q5O4:
                if (checked) {
                    score += 1;
                    break;
                }
        }
    }

    public void checkQ6(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q6O1:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q6O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q6O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q6O4:
                if (checked) {
                    score += 1;
                    break;
                }
        }
    }

    public void checkQ7(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q7O1:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q7O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q7O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q7O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ8(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q8O1:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q8O2:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q8O3:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q8O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ9(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q9O1:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q9O2:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q9O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q9O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void checkQ10(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.Q10O1:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q10O2:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.Q10O3:
                if (checked) {
                    score += 0;
                    break;
                }
            case R.id.Q10O4:
                if (checked) {
                    score += 0;
                    break;
                }
        }
    }

    public void submitAnswers(View view) {
        EditText text = findViewById(R.id.name);
        String name = text.getText().toString();

        Toast.makeText(this, "Hello, " + name + ". You scored " + score + " out of 10.", Toast.LENGTH_SHORT).show();
    }

}


   /* public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_meat:
                if (checked)
                // Put some meat on the sandwich
            else
                // Remove the meat
                break;
            case R.id.checkbox_cheese:
                if (checked)
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }*/
