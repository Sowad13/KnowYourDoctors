package com.example.knowyourdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgone,imngtwo,imgthree;
    Button but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        but = (Button) findViewById(R.id.button2);
        imgone = (ImageView) findViewById(R.id.imageView2);
        imgone.setOnClickListener(this);
        imngtwo = (ImageView) findViewById(R.id.imageView3);
        imngtwo.setOnClickListener(this);
        imgthree = (ImageView) findViewById(R.id.imageView4);
        imgthree.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.imageView2){
            imgone.setVisibility(View.GONE);
            imngtwo.setVisibility(View.VISIBLE);

        }

        else if(v.getId() == R.id.imageView3){
            imngtwo.setVisibility(View.GONE);
            imgthree.setVisibility(View.VISIBLE);
        }

        else if(v.getId() == R.id.imageView4){
            imgthree.setVisibility(View.GONE);
            imgone.setVisibility(View.VISIBLE);
        }


        
            Intent frIntent = new Intent(FrameActivity.this, AbsoluteActivity.class);
            startActivity(frIntent);

    }
}
