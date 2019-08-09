package com.example.alc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class companies extends AppCompatActivity{
    SearchView searchview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.companies);
        ListView listview = findViewById(R.id.emplyeesList);
        searchview = findViewById(R.id.search);

        ArrayList<String> classes = new ArrayList<>();
        classes.add("Company");
        classes.add("Company 2");
        classes.add("Company 3");
        classes.add("Company 4");
        classes.add("Company 5");
        classes.add("Company 6");
        classes.add("Company 1");
        classes.add("Company 2");
        classes.add("Company 3");
        classes.add("Company 4");
        classes.add("Company 5");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
               return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
       listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showeditEmployee();
            }
        });

    }

    public void showeditEmployee(){
        Intent intent1 = new Intent(this,editemployee.class);
        startActivity(intent1);
    }
}
