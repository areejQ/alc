package com.example.alc;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class addtool extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter2;
    ArrayList<String> classes;
    ArrayList<String> classes2;
    Spinner spinner;
    Spinner spinner2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtool);
     try{

         spinner = (Spinner) findViewById(R.id.spinner);
        classes = new ArrayList<>();
        classes.add("جديد");
        classes.add("جيد");
        classes.add("قديم");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);
         spinner.setAdapter(adapter);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        classes2 = new ArrayList<>();
        classes2.add("فعالة");
        classes2.add("غيرفعالة");
        adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classes2);
       spinner2.setAdapter(adapter2);
    } catch(Exception ex) {
            Log.e(String.valueOf(ex), "EXCEPTION CAUGHT WHILE EXECUTING DATABASE TRANSACTION");
            ex.printStackTrace();
         Toast.makeText(this, String.valueOf(ex), Toast.LENGTH_LONG).show();
        }
    }
}
