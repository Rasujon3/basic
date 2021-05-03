package com.sujon.basic;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button buttonTutorial, toastButton, editTextButton;
    Button textViewButton, snackBarButton, progressBarButton;
    ConstraintLayout constraintLayout;
    ProgressBar progressbar;
    Button alertButton;
    RadioButton radioButton;
    CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Not Checked", Toast.LENGTH_SHORT).show();
            }
        });

        progressBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressbar.setVisibility(View.VISIBLE);
            }
        });

        editTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        buttonTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonTutorial.setText("Mutton");
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        textViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("INTENT_VALUE", "TEXTVIEW");
                startActivity(intent);

            }
        });

        snackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(constraintLayout, "This is SnackBar", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Warning!!")
                        .setMessage("This is an alert")
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        }).show();

            }
        });


    }

    private void Initialize() {
        buttonTutorial = findViewById(R.id.buttonTutorial);
        toastButton = findViewById(R.id.toastButton);
        editTextButton = findViewById(R.id.editTextButton);
        textViewButton = findViewById(R.id.textViewButton);
        snackBarButton = findViewById(R.id.snackBarButton);
        constraintLayout = findViewById(R.id.constraintlayout);
        progressBarButton = findViewById(R.id.progressBarButton);
        progressbar = findViewById(R.id.progressbar);
        alertButton = findViewById(R.id.alertButton);
        radioButton = findViewById(R.id.radioButton);
        checkbox = findViewById(R.id.checkbox);
    }
}