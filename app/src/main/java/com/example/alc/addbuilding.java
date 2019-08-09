package com.example.alc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class addbuilding extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addbuilding);
        Spinner spinner = (Spinner) findViewById(R.id.spinner) ;
        ArrayList<String> classes = new ArrayList<>();
        classes.add("project name    ");
        classes.add("project 2");
        classes.add("project 3");
        classes.add("project 4");
        classes.add("project 5");
        classes.add("project 6");
        classes.add("project 1");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2) ;
        ArrayList<String> classes2 = new ArrayList<>();
        classes2.add("حالة البناء");
        classes2.add("جديد");
        classes2.add("قيد العمل");
        classes2.add("متوقف");
        classes2.add("منتهي");
        classes2.add("ملغي");
        final ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes2);
        spinner2.setAdapter(adapter2);
    }
}
