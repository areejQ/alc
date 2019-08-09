package com.example.alc;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class employees extends AppCompatActivity{
    SearchView searchview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employees);
        ListView listview = findViewById(R.id.emplyeesList);
        searchview = findViewById(R.id.search);

        ArrayList<String> classes = new ArrayList<>();
        classes.add("1-emplyee 1     groub1    ");
        classes.add("emplyee 2");
        classes.add("emplyee 3");
        classes.add("emplyee 4");
        classes.add("emplyee 5");
        classes.add("emplyee 6");
        classes.add("emplyee 1");
        classes.add("emplyee 2");
        classes.add("emplyee 3");
        classes.add("emplyee 4");
        classes.add("emplyee 5");
        classes.add("emplyee 6");
        classes.add("emplyee 1");
        classes.add("emplyee 2");
        classes.add("emplyee 3");
        classes.add("emplyee 4");
        classes.add("emplyee 5");
        classes.add("emplyee 6");
        classes.add("emplyee 1");
        classes.add("emplyee 2");
        classes.add("emplyee 3");
        classes.add("emplyee 4");
        classes.add("emplyee 5");
        classes.add("emplyee 6");
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
