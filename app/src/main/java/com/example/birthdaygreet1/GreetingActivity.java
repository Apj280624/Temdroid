package com.example.birthdaygreet1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);


        String name= getIntent().getStringExtra("name");
        String message="HAPPY BIRTHDAY!\n";
        TextView greetTextView=findViewById(R.id.greetTextView);
        greetTextView.setText(message+name);

        Toast.makeText(this,"i m here!",Toast.LENGTH_SHORT).show();

    }

}
