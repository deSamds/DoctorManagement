package com.d.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class doctor_edit extends AppCompatActivity {

    TextView doc_name, doc_age,doc_desig,doc_adrs,doc_tp,doc_ward;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_edit);

        doc_name = findViewById(R.id.doc_name);
        doc_age = findViewById(R.id.doc_age);
        doc_desig = findViewById(R.id.doc_desig);
        doc_adrs = findViewById(R.id.doc_adrs);
        doc_tp = findViewById(R.id.doc_tpno);
        doc_ward = findViewById(R.id.doc_ward);

        save = findViewById(R.id.btn_save);

    }
}
