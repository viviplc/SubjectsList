package com.example.schooleducationcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables declaration
    Button btnSubject1, btnSubject2, btnSubject3, btnSubject4, btnSubject5 ;
    String output1 = "Subject: ";
    String output2 = ", Duration: ";
    String output3 = ", Fees: ";
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons instantiation

        //Subject 1 Logic
        btnSubject1 = (Button) findViewById(R.id.Subject1More);
        //Override event onclick for subject1 Maths
        btnSubject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output = output1 + " Maths " + output2 + " 50 hours " + output3 + " $500 CAD";
                //Show toast with duration and fees
                printToast(output);
            }
        });

        //Subject 2 Logic
        btnSubject2 = (Button) findViewById(R.id.Subject2More);
        //Override event onclick for subject1 Maths
        btnSubject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output = output1 + " Physics " + output2 + " 70 hours " + output3 + " $620 CAD";
                //Show toast with duration and fees
                printToast(output);
            }
        });

        //Subject 3 Logic
        btnSubject3 = (Button) findViewById(R.id.Subject3More);
        //Override event onclick for subject1 Maths
        btnSubject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output = output1 + " Chemistry " + output2 + " 60 hours " + output3 + " $530 CAD";
                //Show toast with duration and fees
                printToast(output);
            }
        });

        //Subject 4 Logic
        btnSubject4 = (Button) findViewById(R.id.Subject4More);
        //Override event onclick for subject1 Maths
        btnSubject4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output = output1 + " Biology " + output2 + " 35 hours " + output3 + " $400 CAD";
                //Show toast with duration and fees
                printToast(output);
            }
        });

        //Subject 5 Logic
        btnSubject5 = (Button) findViewById(R.id.Subject5More);
        //Override event onclick for subject1 Maths
        btnSubject5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                output = output1 + " Geography " + output2 + " 20 hours " + output3 + " $200 CAD";
                //Show toast with duration and fees
                printToast(output);
            }
        });
    }

    private void printToast(String output) {
        Toast toast = Toast.makeText(getApplicationContext(), output, Toast.LENGTH_SHORT);
        toast.show();
    }
}