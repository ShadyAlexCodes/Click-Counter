package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Xander Endre
 * @name Click Counter
 * @project_description A simple Click Counter program.
 * @date 133 October 2021
 * @class CSC110
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInteract(View view) {
        // Define the button and cast it to the findViewById counter
        Button btnCounter = (Button) findViewById(R.id.btnCounter);
        // Print the button ID.
        System.out.println(btnCounter);
        // Convert it to a string and print it.
        System.out.println(btnCounter.getText().toString());

        // Parse the button String as an int (Convert it to a number)
        int value = Integer.parseInt(btnCounter.getText().toString());
        // Print the value
        System.out.println(value);

        // Increase the value
        value++;

        // Print the value
        System.out.println(value);

        // Set the button text after converting the integer to a string
        btnCounter.setText(Integer.toString(value));
    }
}