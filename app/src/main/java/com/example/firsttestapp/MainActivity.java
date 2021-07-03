package com.example.firsttestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvf,tvl,tvphone,tvaddress, tvcity;
    EditText etf, etl, etphone, etaddress, etcity;
    Button bts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvf = findViewById(R.id.tvf);
        tvl = findViewById(R.id.tvl);
        tvphone = findViewById(R.id.tvphone);
        tvaddress = findViewById(R.id.tvaddress);
        tvcity = findViewById(R.id.tvcity);

        etf = findViewById(R.id.etf);
        etl = findViewById(R.id.etl);
        etphone = findViewById(R.id.etphone);
        etaddress = findViewById(R.id.etaddress);
        etcity = findViewById(R.id.etcity);

        bts = findViewById(R.id.bts);

        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* After clicking work */
                 /*Toast.makeText(MainActivity.this, "Submitted successfull", Toast.LENGTH_LONG).show();*/

                Intent I = new Intent(MainActivity.this, next_page.class);
                I.putExtra("key", etf.getText().toString());
                I.putExtra("key2", etl.getText().toString());
                startActivity(I);
            }
        });

    }
}