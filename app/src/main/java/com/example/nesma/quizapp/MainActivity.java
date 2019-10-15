package com.example.nesma.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //   public static final String EXTRA_MESSAGE = "android.intent.extra.alarm.MESSAGE";
    public static int Score;
    CheckBox intent, services, classes, task, resourceExternalization, Marshmallow, Moro, Sweet, Donut, Cupcake;
    RadioButton apk, ide, jdk, classe, objects, methods, text, textcolor, color;
    EditText answerEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        answerEditText = (EditText) findViewById(R.id.answer_edit_text);
        String answer = answerEditText.getText().toString();
        //if statement to check if edit text is empty or not
        if (answer.matches("")) {
            //if edit text is empty toast message will appear
            Toast.makeText(this, "please answer question  number six ", Toast.LENGTH_SHORT).show();
        } else {

            Score = Score + 1;
            //print the score by toast message
            Toast.makeText(this, "your score " + Score, Toast.LENGTH_SHORT).show();

            // after submission  it will sign the right answer
            apk = (RadioButton) findViewById(R.id.apk_radio_button);
            apk.setBackgroundResource(R.drawable.correct_style);

            methods = (RadioButton) findViewById(R.id.methods_radio_button);
            methods.setBackgroundResource(R.drawable.correct_style);

            textcolor = (RadioButton) findViewById(R.id.text_color_radio_button);
            textcolor.setBackgroundResource(R.drawable.correct_style);

            classes = (CheckBox) findViewById(R.id.classes_check_box);
            classes.setBackgroundResource(R.drawable.correct_style);

            intent = (CheckBox) findViewById(R.id.intent_check_box);
            intent.setBackgroundResource(R.drawable.correct_style);

            resourceExternalization = (CheckBox) findViewById(R.id.resource_externalization_check_box);
            resourceExternalization.setBackgroundResource(R.drawable.correct_style);

            services = (CheckBox) findViewById(R.id.services_check_box);
            services.setBackgroundResource(R.drawable.correct_style);

            Marshmallow = (CheckBox) findViewById(R.id.marshmallow_check_box);
            Marshmallow.setBackgroundResource(R.drawable.correct_style);

            Cupcake = (CheckBox) findViewById(R.id.cupcake_check_box);
            Cupcake.setBackgroundResource(R.drawable.correct_style);

            Donut = (CheckBox) findViewById(R.id.donut_check_box);
            Donut.setBackgroundResource(R.drawable.correct_style);
            //put the right answer of edit text
            answerEditText.setText(R.string.question_answer);

        }

    }

    //methods to uncheck all checkbox and radio button after click on submit button
    public void reset(View view) {
        answerEditText=(EditText)findViewById(R.id.answer_edit_text) ;
        String answer = answerEditText.getText().toString();
        if(answer.matches("")){
            Toast.makeText(this,"Sorry you can not make reset now answer the question then click ",Toast.LENGTH_SHORT).show();
        }
        else {
        //clear check  in first question
        RadioGroup firstQuestion = (RadioGroup) findViewById(R.id.rdGroup1);
        firstQuestion.clearCheck();

        //clear check  in second question
        RadioGroup secondQuestion = (RadioGroup) findViewById(R.id.rdGroup2);
        secondQuestion.clearCheck();

        //clear check  in third question
        RadioGroup ThridQuestion = (RadioGroup) findViewById(R.id.rdGroup3);
        ThridQuestion.clearCheck();

        //make uncheck for all check box
        if (intent.isChecked()) {
            intent.setChecked(false);
        }
        if (services.isChecked()) {
            services.setChecked(false);
        }
        if (resourceExternalization.isChecked()) {
            resourceExternalization.setChecked(false);
        }

        if (task.isChecked()) {
            task.setChecked(false);
        }
        if (classes.isChecked()) {
            classes.setChecked(false);
        }
        if (text.isChecked()) {
            text.setChecked(false);
        }
        if (textcolor.isChecked()) {
            textcolor.setChecked(false);
        }
        if (color.isChecked()) {
            color.setChecked(false);
        }

        if (Marshmallow.isChecked()) {
            Marshmallow.setChecked(false);
        }
        if (Moro.isChecked()) {
            Moro.setChecked(false);
        }
        if (Cupcake.isChecked()) {
            Cupcake.setChecked(false);
        }
        if (Sweet.isChecked()) {
            Sweet.setChecked(false);
        }
        if (Donut.isChecked()) {
            Donut.setChecked(false);
        }
        //make edit text is clear
        answerEditText.setText("");

        apk = (RadioButton) findViewById(R.id.apk_radio_button);
        apk.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        methods = (RadioButton) findViewById(R.id.methods_radio_button);
        methods.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        textcolor = (RadioButton) findViewById(R.id.text_color_radio_button);
        textcolor.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        classes = (CheckBox) findViewById(R.id.classes_check_box);
        classes.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        intent = (CheckBox) findViewById(R.id.intent_check_box);
        intent.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        resourceExternalization = (CheckBox) findViewById(R.id.resource_externalization_check_box);
        resourceExternalization.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        services = (CheckBox) findViewById(R.id.services_check_box);
        services.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        Marshmallow = (CheckBox) findViewById(R.id.marshmallow_check_box);
        Marshmallow.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        Cupcake = (CheckBox) findViewById(R.id.cupcake_check_box);
        Cupcake.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        Donut = (CheckBox) findViewById(R.id.donut_check_box);
        Donut.setBackgroundResource(R.drawable.uncheck_radio_and_checkbox);

        Score = 0;
    }}

    //methods for choose the right answer of first question
    public void OnRadioFirstQuestionClick(View view) {

        //create objects of radio button class
        apk = (RadioButton) findViewById(R.id.apk_radio_button);
        ide = (RadioButton) findViewById(R.id.ide_radio_button);
        jdk = (RadioButton) findViewById(R.id.jdk_radio_button);
        // Check which radio button was clicked
        if (apk.isChecked()) {
            Score = Score + 1;
        } else if (ide.isChecked()) {
            return;
        } else if (jdk.isChecked()) {
            return;
        } else {
            return;
        }

    }

    //methods for choose the right answer of second question
    public void OnRadioSecondQuestion(View view) {

        //create objects of radio button class
        classe = (RadioButton) findViewById(R.id.classes_radio_button);
        objects = (RadioButton) findViewById(R.id.objects_radio_button);
        methods = (RadioButton) findViewById(R.id.methods_radio_button);
        // Check which radio button was clicked
        if (classe.isChecked()) {
            return;
        } else if (methods.isChecked()) {
            Score = Score + 1;
        } else if (objects.isChecked()) {
            return;
        } else {
            return;
        }
    }

    //methods for choose the right answer of third question
    public void OnRadioThirdQuestion(View view) {

        //create objects of radio button class
        text = (RadioButton) findViewById(R.id.text_radio_button);
        textcolor = (RadioButton) findViewById(R.id.text_color_radio_button);
        color = (RadioButton) findViewById(R.id.color_radio_button);
        // Check which radio button was clicked
        if (text.isChecked()) {
            return;
        } else if (textcolor.isChecked()) {
            Score = Score + 1;
        } else if (color.isChecked()) {
            return;
        } else {
            return;
        }
    }

    //methods for choose the right answer of forth question

    public void checkBoxQuestionFour(View view) {

        classes = (CheckBox) findViewById(R.id.classes_check_box);
        intent = (CheckBox) findViewById(R.id.intent_check_box);
        services = (CheckBox) findViewById(R.id.services_check_box);
        resourceExternalization = (CheckBox) findViewById(R.id.resource_externalization_check_box);
        task = (CheckBox) findViewById(R.id.task_check_box);
//Choose the correct answer of the question
        if (intent.isChecked() & classes.isChecked() & services.isChecked() & resourceExternalization.isChecked()) {
            Score = Score + 1;
        }


    }

    //methods for choose the right answer of fifth question
    public void checkBoxQuestionFive(View view) {

        Marshmallow = (CheckBox) findViewById(R.id.marshmallow_check_box);
        Donut = (CheckBox) findViewById(R.id.donut_check_box);
        Cupcake = (CheckBox) findViewById(R.id.cupcake_check_box);
        Moro = (CheckBox) findViewById(R.id.moro_check_box);
        Sweet = (CheckBox) findViewById(R.id.sweet_check_box);
//Choose the correct answer of the question
        if (Marshmallow.isChecked() & Donut.isChecked() & Cupcake.isChecked()) {
            Score = Score + 1;
        }


    }

}