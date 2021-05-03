package com.sujon.basic;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    EditText emailEditText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String userInputValue = emailEditText.getText().toString();

               if (userInputValue.equals("")){
                   Toast.makeText(MainActivity2.this, "No data inserted", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(MainActivity2.this, userInputValue, Toast.LENGTH_SHORT).show();
               }


            }
        });
    }
}