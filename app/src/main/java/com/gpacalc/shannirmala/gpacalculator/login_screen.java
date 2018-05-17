package com.gpacalc.shannirmala.gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login_screen extends AppCompatActivity {

    TextView create_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        create_one = (TextView)findViewById(R.id.link_signup);

        create_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_screen.this, signup_screen.class);
                startActivity(intent);
            }
        });
    }
}
