package com.example.dude.szene38;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Dude on 01.03.2015.
 */
public class overview extends Activity {

    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
   //private ImageButton btn6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.overview);



        addListenerOnButton();
    }





    public void addListenerOnButton() {
        Button button1 = (Button) findViewById(R.id.imageButton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn1.class);
                startActivity(intent);
            }

        });
        Button button2 = (Button) findViewById(R.id.imageButton2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn2.class);
                startActivity(intent);
            }

        });

        Button button3 = (Button) findViewById(R.id.imageButton3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn3.class);
                startActivity(intent);
            }

        });

        Button button4 = (Button) findViewById(R.id.imageButton4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn4.class);
                startActivity(intent);
            }

        });

        Button button5 = (Button) findViewById(R.id.imageButton5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn5.class);
                startActivity(intent);
            }

        });

        Button button6 = (Button) findViewById(R.id.imageButton6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(overview.this, btn6.class);
                startActivity(intent);
            }

        });












}}








