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

public class MainActivity7 extends AppCompatActivity {

    EditText editTextNumber;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);



        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber1);
        textView=findViewById(R.id.textView);


        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity7.super.onBackPressed();
            }
        });
//==========================================================================================================
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                String mystring=editTextNumber.getText().toString();
                if (editTextNumber.length()>0){
                    int myint=Integer.parseInt(mystring);
                    for (int x=1;x<=10;x++){
                        int mul=myint*x;
                        textView.append(myint+" * "+x+"="+mul+"\n");
                    }

                }else {
                    editTextNumber.setError("plaess enter a number");
                }
            }
        });

    }
}