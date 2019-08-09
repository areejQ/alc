package com.example.alc;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        mtoolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(mtoolbar);

        mDrawerLayout= (DrawerLayout) findViewById(R.id.DrawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout , R.string.open , R.string.close);

        NavigationView navegation_view = findViewById(R.id.navigationview);
        navegation_view.setNavigationItemSelectedListener(this );


        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    public void showEmployees(){
        Intent intent = new Intent(this , employees.class);
        startActivity(intent);

    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_main:
                show_main();
                return true;
            case R.id.nav_worker:
                show_worker();
                return true;
            case R.id.nav_addworker:
                show_ddworker();
                return true;
            case R.id.nav_project:
                show_project();
                return true;
            case R.id.nav_addproject:
                show_addproject();
                return true;
            case R.id.nav_company:
                show_company();
                return true;
            case R.id.nav_addcompany:
                show_addcompany();
                return true;
            case R.id.nav_build:
                show_build();
                return true;
            case R.id.nav_addbuild:
                show_addbuild();
                return true;
            case R.id.nav_tools:
                show_tool();
                return true;
            case R.id.nav_addtool:
                show_addtool();
                return true;
            case R.id.nav_groups:
                show_groups();
                return true;
            case R.id.nav_addgroup:
                show_addgroup();
                return true;
                case R.id.nav_attendance:
                show_attendance();
                return true;
            case R.id.nav_addattendance:
                show_addattendance();
                return true;
                case R.id.nav_addcustody:
                show_addcustody();
                return true;
            case R.id.nav_custodies:
                show_custodies();
                return true;
            case R.id.nav_addmstor:
                show_addmstor();
                return true;
            case R.id.nav_mstors:
                show_mstors();
                return true;
            case R.id.nav_materials:
                show_materials();
                return true;
            case R.id.nav_addmaterial:
                show_addmaterial();
                return true;
            default:
                show_main();
                return true;
        }
    }
    public void show_main() { Intent intent = new Intent(this,main.class); startActivity(intent);}
    public void show_addbuild() { Intent intent = new Intent(this,addbuilding.class); startActivity(intent);}
    public void show_build() { Intent intent = new Intent(this,buildings.class); startActivity(intent);}
    public void show_addcompany() { Intent intent = new Intent(this,addcompany.class); startActivity(intent);}
    public void show_company() { Intent intent = new Intent(this,companies.class); startActivity(intent);}
    public void show_addproject() { Intent intent = new Intent(this,addproject.class); startActivity(intent);}
    public void show_project() { Intent intent = new Intent(this,projects.class); startActivity(intent);}
    public void show_ddworker() { Intent intent = new Intent(this,addemployee.class); startActivity(intent);}
    public void show_worker() { Intent intent = new Intent(this,employees.class); startActivity(intent);}
    public void show_tool() { Intent intent = new Intent(this,tools.class); startActivity(intent);}
    public void show_addtool() { Intent intent = new Intent(this,addtool.class); startActivity(intent);}
    public void show_groups() { Intent intent = new Intent(this,group.class); startActivity(intent);}
    public void show_addgroup() { Intent intent = new Intent(this,addgroup.class); startActivity(intent);}
    public void show_addattendance() { Intent intent = new Intent(this,addattendance.class); startActivity(intent);}
    public void show_attendance() { Intent intent = new Intent(this,attendance.class); startActivity(intent);}
    public void show_addcustody() { Intent intent = new Intent(this,addcustody.class); startActivity(intent);}
    public void show_custodies() { Intent intent = new Intent(this,custodies.class); startActivity(intent);}
    public void show_addmstor() { Intent intent = new Intent(this,addmstor.class); startActivity(intent);}
    public void show_mstors() { Intent intent = new Intent(this,mstors.class); startActivity(intent);}
    public void show_materials() { Intent intent = new Intent(this,materials.class); startActivity(intent);}
    public void show_addmaterial() { Intent intent = new Intent(this,materialpage.class); startActivity(intent);}
}
