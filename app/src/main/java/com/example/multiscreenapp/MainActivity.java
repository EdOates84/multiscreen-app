package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers_text_view);
        numbers.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);

            }


        });
    }

//    public void openNumbersList(View view){
//        Intent numbersIntent = new Intent(this, NumbersActivity.class);     //Explicit intent is made here to the numbr activity
//        startActivity(numbersIntent);
//    }
}
