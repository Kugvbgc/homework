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

public class MainActivity2 extends AppCompatActivity {


    TextView textView;

    EditText editText;

    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.TextView);
        editText=findViewById(R.id.EdNumber);
        button=findViewById(R.id.buttoncal);

      ImageView imageView=findViewById(R.id.image);
      imageView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              MainActivity2.super.onBackPressed();
          }
      });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=editText.getText().toString();
                if (editText.length()>0){
                    int number=Integer.parseInt(string);

                    if (number%5==0&&number%11==0){
                        textView.setText("5 and 11 a divisible number");

                    }else {
                        textView.setText("5 and 11 a divisible number not");

                    }




                }else {
                    editText.setError("Plese enter a number");
                }




            }
        });




    }
}