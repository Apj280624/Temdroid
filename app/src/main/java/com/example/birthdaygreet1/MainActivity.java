package com.example.birthdaygreet1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditTextView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditTextView=(EditText) findViewById(R.id.nameEditTextView);
        name=nameEditTextView.getText().toString();
        //name="jjfj";
        //Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }

    public void goToGreetingActivity(View view)
    {
        Intent goToGreetingActivityIntent=new Intent(this,GreetingActivity.class);
        goToGreetingActivityIntent.putExtra("name",name);
        startActivity(goToGreetingActivityIntent);
    }

    public void greet(View view)
    {
        name=nameEditTextView.getText().toString();
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        goToGreetingActivity(view);
        //Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }
}