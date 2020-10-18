package com.uc.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button AddStudent,AddLecturer,AddCourses,LoginStudent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddStudent = findViewById(R.id.AddStudentBtn);
        AddLecturer = findViewById(R.id.AddLecturerBtn);
        AddCourses = findViewById(R.id.AddCoursesBtn);
        LoginStudent = findViewById(R.id.LoginAsStudentBtn);


        AddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, StudentRegister.class);
                startActivity(a);
            }
        });
        AddLecturer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, AddLecturer.class);
                startActivity(b);
            }
        });
        AddCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, AddCourses.class);
                startActivity(c);
            }
        });
        loginstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this, loginstudent.class);
                startActivity(d);
            }
        });
    }
}