package com.example.knowyourdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceed = (Button) findViewById(R.id.proceed);

        proceed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent= new Intent(MainActivity.this,TableActivity.class);

        startActivity(intent);
    }
}
