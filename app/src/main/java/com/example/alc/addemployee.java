package com.example.alc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class addemployee extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addemployee);
        Spinner spinner = (Spinner) findViewById(R.id.spinner) ;
        ArrayList<String> classes = new ArrayList<>();
        classes.add(" group1    ");
        classes.add("group1 2");
        classes.add("group1 3");
        classes.add("group1 4");
        classes.add("group1 5");
        classes.add("group1 6");
        classes.add("group1 1");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes);
        spinner.setAdapter(adapter);
    }
}
