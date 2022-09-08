package com.example.hci_v2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Dashboard extends Activity {
    ArrayList<Subject> studentSubjects;
    DataHelper helper;
    ArrayAdapter<Subject> adapter;

    TextView tvIndex;
    ListView lvSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        // bundle sluzi za prenosenje vise podataka u sledeci activity pomocu key value vrednosti
        Bundle bundle = getIntent().getExtras();

        helper = new DataHelper();

        tvIndex = findViewById(R.id.tvIndex);
        lvSubjects = findViewById(R.id.lvSubjects);

        String index = bundle.getString("index");

        String welcomeMsg = "Dobro dosli " + index;
        int studentId = helper.findStudentId(index);
        studentSubjects = helper.findStudentSubjects(studentId);
        tvIndex.setText(welcomeMsg);

        adapter = new SubjectAdapter(this, studentSubjects);
        lvSubjects.setAdapter(adapter);
    }
}
