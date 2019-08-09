package com.example.alc;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class addattendance extends AppCompatActivity {
    Button selecttoolsbtn;
    TextView viewtools;
    boolean[] checkitems;
    String[] strlistitem;
    ArrayAdapter<String> adapter;
    ArrayList<String> listitem;
    ArrayList<String> usertools;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addattendance);
       try {

            selecttoolsbtn = (Button) findViewById(R.id.selecttoolsbtn);
            viewtools = (TextView) findViewById(R.id.viewtools);
            usertools = new ArrayList<>();
            listitem = new ArrayList<String>();
            listitem.add("tool name");
            listitem.add("tool 2");
            listitem.add("tool 3");
            listitem.add("tool 4");
            listitem.add("tool 5");
            listitem.add("tool 6");
            listitem.add("tool 1");
            strlistitem = listitem.toArray(new String[0]);
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listitem);
            checkitems = new boolean[strlistitem.length];
            selecttoolsbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {
                    AlertDialog.Builder toolbulder = new AlertDialog.Builder(addattendance.this);
                    toolbulder.setTitle("الرجاء اختيار الادوات المطلوبة");
                    toolbulder.setMultiChoiceItems(strlistitem, checkitems, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int position, boolean ischeacked) {
                            if (ischeacked) {
                                if (!usertools.contains(position)) {
                                    usertools.add(strlistitem[position]);
                                } else if(usertools.contains(position)) {
                                    usertools.remove(position);
                                }
                            }
                        }
                    });
                    toolbulder.setCancelable(false);
                    toolbulder.setPositiveButton("تم", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            String tool = "";
                         for (int pos = 0; pos < strlistitem.length; pos++) {
                                if (checkitems[pos]) {
                                /*  if (pos != strlistitem.length) {
                                        tool = tool + strlistitem[usertools.indexOf(usertools.get(pos))] + "."+usertools.size()+",";
                                    } else {
                                        tool = tool + strlistitem[usertools.indexOf(usertools.get(pos))]+ "."+usertools.size();
                                    }*/

                                   if (pos != strlistitem.length) {
                                        tool = tool + strlistitem[pos] + ",";
                                    } else {
                                        tool = tool + strlistitem[pos];
                                    }

                                }
                                else {continue;}
                            }
                            viewtools.setText(tool);

                        }
                    });
                    toolbulder.setNegativeButton("تصغير", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    toolbulder.setNeutralButton("الغاء", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            for (int pos = 0; pos < checkitems.length; pos++) {
                                checkitems[pos] = false;
                                usertools.clear();
                                viewtools.setText("");
                            }
                        }
                    });
                    AlertDialog toolDialog = toolbulder.create();
                    toolDialog.show();
                }
            });
            //------------------------spinneremployess---------------------
           Spinner spinneremployess = (Spinner) findViewById(R.id.spinneremployess) ;
           ArrayList<String> classes = new ArrayList<>();
           classes.add("employee name    ");
           classes.add("employee 1");
           classes.add("employee 2");
           classes.add("employee 3");
           classes.add("employee 4");
           classes.add("employee 5");
           classes.add("employee 6");
           final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes);
           spinneremployess.setAdapter(adapter);
           //------------------------spinner_bulding-------------------------
           Spinner spinner_bulding = (Spinner) findViewById(R.id.spinner_bulding) ;
           ArrayList<String> classesb = new ArrayList<>();
           classesb.add("bulding name    ");
           classesb.add("bulding 1");
           classesb.add("bulding 2");
           classesb.add("bulding 3");
           classesb.add("bulding 4");
           classesb.add("bulding 5");
           classesb.add("bulding 6");
           final ArrayAdapter<String> adapterb = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classesb);
           spinner_bulding.setAdapter(adapterb);
           //--------------------spinner_work_status-----------------------------
           Spinner spinner_work_status = (Spinner) findViewById(R.id.spinner_work_status) ;
           ArrayList<String> classes2 = new ArrayList<>();
           classes2.add("حالة الموظف");
           classes2.add("يعمل");
           classes2.add("لا يعمل");
           final ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, classes2);
           spinner_work_status.setAdapter(adapter2);
    } catch(Exception ex) {
        Log.e(String.valueOf(ex), "EXCEPTION CAUGHT WHILE EXECUTING DATABASE TRANSACTION");
        ex.printStackTrace();
        Toast.makeText(this, String.valueOf(ex), Toast.LENGTH_LONG).show();
    }

    }
}