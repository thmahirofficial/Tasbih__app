package com.thmahir.digitaltasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       TextView tvcount;
       Button button,button2,button3;
       int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvcount = (findViewById(R.id.tvcount));
        button=(findViewById(R.id.button));
        button2=(findViewById(R.id.button2));
        button3=(findViewById(R.id.button3));



        //==================================================


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count+1;
                tvcount.setText(""+count);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvcount.setText(""+count);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                tvcount.setText(""+count);

            }
        });










    }
}