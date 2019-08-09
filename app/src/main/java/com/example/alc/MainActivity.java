package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button loginbtn;
    private TextView FpassTxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        setContentView(R.layout.activity_main);
        loginbtn = (Button) findViewById(R.id.button);
        FpassTxtView=(TextView) findViewById(R.id.textView);
        FpassTxtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showrestpassword();
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMain();
            }
        });
    }
    public void showMain(){
        Intent intent = new Intent(this , main.class);
        startActivity(intent);

    }

    public void showrestpassword(){

        Intent intent = new Intent(this , forgetpassword.class);
        startActivity(intent);

    }
    }

