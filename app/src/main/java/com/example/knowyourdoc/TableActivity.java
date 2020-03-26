package com.example.knowyourdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity implements View.OnClickListener {

    TextView ortho, cardi, neuro, euro, ent, eye, dent;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        ortho = (TextView) findViewById(R.id.ortho);
        cardi = (TextView) findViewById(R.id.cardi);
        neuro = (TextView) findViewById(R.id.neuro);
        euro = (TextView) findViewById(R.id.euro);
        ent = (TextView) findViewById(R.id.ent);
        eye = (TextView) findViewById(R.id.eyes);
        dent = (TextView) findViewById(R.id.dent);
        button = (Button) findViewById(R.id.button);

        ortho.setOnClickListener(this);
        cardi.setOnClickListener(this);
        neuro.setOnClickListener(this);
        euro.setOnClickListener(this);
        ent.setOnClickListener(this);
        eye.setOnClickListener(this);
        dent.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent tabIntent = new Intent(TableActivity.this,FrameActivity.class);
        startActivity(tabIntent);


    }
}
