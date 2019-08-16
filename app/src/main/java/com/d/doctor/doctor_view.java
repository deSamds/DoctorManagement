package com.d.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class doctor_view extends AppCompatActivity {

    Button edit,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_view);

        edit = findViewById(R.id.btn_edit);
        delete = findViewById(R.id.btn_delete);
    }

    public void editDoctors(View view) {
        Intent in = new Intent(doctor_view.this,doctor_edit.class);
        startActivity(in);
    }

    public void deleteDoctor(View view) {

    }}
