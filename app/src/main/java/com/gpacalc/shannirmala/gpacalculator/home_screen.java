package com.gpacalc.shannirmala.gpacalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_screen extends AppCompatActivity {

    Button btn_student,btn_lecturer,btn_admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btn_student = (Button)findViewById(R.id.btn_student);
        btn_lecturer = (Button)findViewById(R.id.btn_lecturer);
        btn_admin = (Button)findViewById(R.id.btn_admin);

        btn_lecturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(home_screen.this, login_screen.class);
                startActivity(intent);
            }
        });

        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(home_screen.this, login_screen.class);
                startActivity(intent);
            }
        });

        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(home_screen.this, adding_subjects.class);
                startActivity(intent);
            }
        });
    }
}
