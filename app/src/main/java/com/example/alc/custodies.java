package com.example.alc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class custodies extends AppCompatActivity{
    SearchView searchview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custodies);
        ListView listview = findViewById(R.id.custodiesList);
        searchview = findViewById(R.id.search);
try{
        ArrayList<String> classes = new ArrayList<>();
        classes.add("emplyee 1    11/01/2019 08:08pm   in ");
        classes.add("emplyee 2 11/01/2019 08:08pm in ");
        classes.add("emplyee 3  12/01/2019 08:08pm out  ");
        classes.add("emplyee 4 13/01/2019 08:08pm  in");
        classes.add("emplyee 5  20/01/2019 08:08pm out ");
        classes.add("emplyee 6  11/02/2019 08:08pm  out");
        classes.add("emplyee 1    11/01/2019 08:08pm  out  ");
        classes.add("emplyee 2 11/01/2019 08:08pm  in");
        classes.add("emplyee 3  12/01/2019 08:08pm  in  ");
        classes.add("emplyee 4 13/01/2019 08:08pm  out");
        classes.add("emplyee 5  20/01/2019 08:08pm in ");
        classes.add("emplyee 6  11/02/2019 08:08pm  in ");
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, classes);
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
    }catch(Exception ex) {
    Log.e(String.valueOf(ex), "EXCEPTION CAUGHT WHILE EXECUTING DATABASE TRANSACTION");
    ex.printStackTrace();
    Toast.makeText(this, String.valueOf(ex), Toast.LENGTH_LONG).show();
}
    }

    public void showeditEmployee(){
        Intent intent1 = new Intent(this,editemployee.class);
        startActivity(intent1);
    }
}
