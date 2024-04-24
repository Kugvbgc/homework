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

public class MainActivity5 extends AppCompatActivity {

    EditText editTextText,editTextText2,editTextText3,editTextText4,editTextText5;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        editTextText=findViewById(R.id.editTextText);
        editTextText2=findViewById(R.id.editTextText2);
        editTextText3=findViewById(R.id.editTextText3);
        editTextText4=findViewById(R.id.editTextText4);
        editTextText5=findViewById(R.id.editTextText5);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity5.super.onBackPressed();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string1=editTextText.getText().toString();
                String string2=editTextText2.getText().toString();
                String string3=editTextText3.getText().toString();
                String string4=editTextText4.getText().toString();
                String string5=editTextText5.getText().toString();
               if (editTextText.length()>0&&editTextText2.length()>0&&editTextText3.length()>0&&editTextText4.length()>0&&editTextText5.length()>0){

                   int int1=Integer.parseInt(string1);
                   int int2=Integer.parseInt(string2);
                   int int3=Integer.parseInt(string3);
                   int int4=Integer.parseInt(string4);
                   int int5=Integer.parseInt(string5);

                   int Percetage= (int) ((int1+int2+int3+int4+int5)/5.0);

                   if (Percetage>=90){
                       textView.setText("Grade A+ ");

                   }else if (Percetage>=80){
                       textView.setText("Grade A ");

                   }else if (Percetage>=70){
                       textView.setText("Grade B ");

                   }else if (Percetage>=60){
                       textView.setText("Grade C ");

                   }else if (Percetage>=50){
                       textView.setText("Grade D ");

                   }else if (Percetage>=40){
                       textView.setText("Grade E ");

                   }else if (Percetage>=30){
                       textView.setText("Grade F ");

                   }




               }else {
                   editTextText.setError("plese enter a number");
                   editTextText2.setError("plese enter a number");
                   editTextText3.setError("plese enter a number");
                   editTextText4.setError("plese enter a number");
                   editTextText5.setError("plese enter a number");
               }







            }
        });







    }
}