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

public class MainActivity6 extends AppCompatActivity {

    TextView textView;

    EditText editText;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        textView=findViewById(R.id.TextView);
        editText=findViewById(R.id.EdNumber);
        button=findViewById(R.id.buttoncal);

        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity6.super.onBackPressed();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=editText.getText().toString();
                if (editText.length()>0){
                    float number=Float.parseFloat(string);
                    float bill=0;

                    if (number<=50){
                        bill= (float) (number*0.50);
                    }else if (number<=150){
                        bill= (float) (25+(number-50)*0.75);
                    }else if (number<=250){
                        bill= (float) (25+75+(number-150)*1.20);
                    }else  {
                        bill= (float) (25+75+120+(number-250)*1.50);
                    }
                    bill = (float) (bill + (bill * 0.20));

                    textView.setText("Total current Bill ="+bill+" Bill");


                }else {
                    editText.setError("Plese enter a number");
                }




            }
        });








    }
}