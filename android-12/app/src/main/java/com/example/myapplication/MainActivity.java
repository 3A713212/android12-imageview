package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
    }
    int i=0;
    public void change(View view) {
        if(i==0){
            img.setImageResource(R.drawable.a);
            i=1;
        }
        else{
            img.setImageResource(R.drawable.b);
            i=0;
        }
    }

}