package com.khair.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {
    EditText termInput;
    Button generateButton;
    TextView seriesOutput,seriesOutput1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        termInput = findViewById(R.id.termInput);
        generateButton = findViewById(R.id.generateButton);
        seriesOutput = findViewById(R.id.seriesOutput);
        seriesOutput1 = findViewById(R.id.seriesOutput1);


        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity9.super.onBackPressed();
            }
        });


        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateSeries();
            }

        });





    }
 ////////////////////////////////////////////////////////////////////////////////////

    private void generateSeries() {
        String input = termInput.getText().toString();
        if (!input.isEmpty() ){
            long numOfTerms = Long.parseLong(input);
            StringBuilder series = new StringBuilder();
            int sum = 0;
            for (int i = 1; i <= numOfTerms; i++) {
                long term = Integer.parseInt(repeatDigit(i, 9));
                sum += term*term;
                series.append(term);
                if (i < numOfTerms)
                    series.append(" + ");
            }
            seriesOutput1.setText(" = "+sum);
            seriesOutput.setText(series.toString());
        }
    }

    private String repeatDigit(int times, int digit) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(digit);
        }
        return result.toString();
    }





///////////////////////////////////////////////////////////////////////////////
}