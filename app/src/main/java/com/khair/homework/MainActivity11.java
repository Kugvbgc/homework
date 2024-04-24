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

public class MainActivity11 extends AppCompatActivity {
    EditText inputNumber;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);


        inputNumber = findViewById(R.id.input_number);
        resultText = findViewById(R.id.result_text);

        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity11.super.onBackPressed();
            }
        });

        Button checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPalindrome();
            }
        });

    }
  //////////////////////////////////////////////////////////////////////////////////////////////////

    private void checkPalindrome() {
        String input = inputNumber.getText().toString();
        if (input.isEmpty()) {
            inputNumber.setError("Please enter a number");
            return;
        }

        int number = Integer.parseInt(input);
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            resultText.setText(number + " is a palindrome number.");
        } else {
            resultText.setText(number + " is not a palindrome number.");
        }
    }

    private boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////
}