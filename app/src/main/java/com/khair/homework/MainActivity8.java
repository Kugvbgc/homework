package com.khair.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;




public class MainActivity8 extends AppCompatActivity {

    TextView textView,list_item3;
    Button myButton;
    EditText edInput1;

    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        textView=findViewById(R.id.list_item);
        edInput1=findViewById(R.id.edInput1);
        myButton=findViewById(R.id.myButton);
        list_item3=findViewById(R.id.list_item3);


        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity8.super.onBackPressed();
            }
        });


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=edInput1.getText().toString();


                if ( edInput1.length()>0){
                    int number=Integer.parseInt(string);

                    for (int x=1;x<=number;x++){
                        if (x%2==0){
                            list_item3.append("+"+x);
                            sum=sum+x;
                          textView.setText("Sum of even numbers  = "+sum);


                        }
                    }



                }else {
                    edInput1.setError("Pless enter a number");
                }





            }
        });












    }
}