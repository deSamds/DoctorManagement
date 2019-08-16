package com.d.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,edit,delete,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.btn_add);
        edit = findViewById(R.id.btn_edit);
        delete = findViewById(R.id.btn_delete);
        search = findViewById(R.id.btn_search);

    }

    public void newDoctor(View view) {
        Intent in = new Intent(MainActivity.this,doctor_add.class);
        startActivity(in);
    }

    public void editDoctor(View view) {
        Intent in = new Intent(MainActivity.this,doctor_edit.class);
        startActivity(in);
    }

    public void viewAllDoctors(View view) {
        Intent in = new Intent(MainActivity.this,doctor_viewAll.class);
        startActivity(in);
    }

    public void deleteDoctor(View view) {
        Intent in = new Intent(MainActivity.this,doctor_view.class);
        startActivity(in);
    }
}
