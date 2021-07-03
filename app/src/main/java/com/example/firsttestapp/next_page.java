package com.example.firsttestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class next_page extends AppCompatActivity {

    TextView tv_f_name, tv_l_name;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        String name = getIntent().getExtras().getString("key");
        String name2 = getIntent().getExtras().getString("key2");

        tv_f_name = findViewById(R.id.tv_f_name);
        tv_l_name = findViewById(R.id.tv_l_name);
        btn_back = findViewById(R.id.btn_back);

        tv_f_name.setText(name);
        tv_l_name.setText(name2);

        /*Toast.makeText(next_page.this, name, Toast.LENGTH_LONG).show();*/

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(next_page.this, MainActivity.class);
                startActivity(I);
            }
        });

    }
}