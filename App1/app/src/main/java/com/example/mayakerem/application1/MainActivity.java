package com.example.mayakerem.application1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public Button button_Stark;
    public Button button_Lannister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Stark = (Button)findViewById(R.id.buttonStark);
        button_Stark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStarkPage();
            }
        });

        button_Lannister = (Button)findViewById(R.id.buttonLannister);
        button_Lannister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLannisterPage();
            }
        });

    }
    public void openStarkPage (){
        Intent intent = new Intent (this, StarkPage.class);
        startActivity(intent);
    }
    public void openLannisterPage (){
        Intent intent = new Intent (this, LannisterPage.class);
        startActivity(intent);
    }
}