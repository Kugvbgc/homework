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

public class MainActivity3 extends AppCompatActivity {
    TextView textView;

    EditText editText;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        textView=findViewById(R.id.TextView);
        editText=findViewById(R.id.EdNumber);
        button=findViewById(R.id.buttoncal);
        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity3.super.onBackPressed();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=editText.getText().toString();
                if (editText.length()>0){
                    int Year=Integer.parseInt(string);

                    if (Year%400==0){
                        textView.setText(Year+" Leap year");

                    }else if (Year%4==0&&Year%100!=0){
                        textView.setText(Year+" Leap year");

                    }else {
                        textView.setText(Year+" Not a Leap year");
                    }




                }else {
                    editText.setError("Plese enter a number");
                }




            }
        });

    }
}