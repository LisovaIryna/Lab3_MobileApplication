package com.example.lab1_students;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddStudentsGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_students_group);
    }

    public void onGrpAddClick(View view){
        EditText number = (EditText) findViewById(R.id.addGroupNumber);
        EditText faculty = (EditText) findViewById(R.id.addFaculty);
        StudentsGroup.addGroup(
                new StudentsGroup(number.getText().toString(),
                        faculty.getText().toString(),
                        0, false, false)
        );
        NavUtils.navigateUpFromSameTask(this);
    }
}