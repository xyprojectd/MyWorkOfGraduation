package com.jikexueyuan.zitao.myworkofgraduation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


    private Button btyList, btyArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btyList = (Button) findViewById(R.id.btyList);
        btyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Aty1.class);
                startActivity(i);
            }
        });


        btyArray = (Button) findViewById(R.id.btyArray);
        btyArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Aty2.class);
                startActivity(i);

            }
        });

    }




}
