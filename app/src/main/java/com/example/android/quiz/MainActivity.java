/**
 * if-else
 * toast msg with score when grading button is clicked
 * grading logic: check if correct ans is checked AND incorrect ones are not checked
 */
package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {

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
}
