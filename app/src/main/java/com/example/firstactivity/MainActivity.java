package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mEditText;

    // TEST GIT COMMIT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeProperty();
        action();
    }

    private void initializeProperty() {
        mButton = findViewById(R.id.button_action);
        mEditText = findViewById(R.id.send_message);


    }

    private void action() {
        Intent intent = new Intent(this, SecondActivity.class);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }


}