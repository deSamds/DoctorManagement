package com.d.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

public class doctor_viewAll extends AppCompatActivity {

    SearchView stext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_view_all);

        stext = findViewById(R.id.search_text);

    }
}
