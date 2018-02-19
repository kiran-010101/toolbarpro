package com.example.kiran.toolbarpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    //select toolbar of android .v7.widget as we are referring to activity_main.xml


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  (Toolbar)findViewById(R.id.toolbar);

        //to make toolbar as a action bar
        setSupportActionBar(toolbar);//now our toolbar is a action bar after making noactionbar in style.xml+setsuppottactiobbar her
        getSupportActionBar().setTitle("whaat's up");//to add title on toolbar
        toolbar.setSubtitle("fine bro");

        //for making logo on toolbar of nepla flag:
      //  toolbar.setLogo(R.drawable.nepal);
        //for navigation
       // toolbar.setNavigationIcon(R.drawable.usa);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);//it means go to res(R)..and go to menu folder...and go to menu_main.xml and inflate tp our toolbar
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String msg="";//empty string declared

        //when the id of our selected menu matched corresponding message is poped up

        switch (item.getItemId()){//using switch case to display simple popup when we click menu
            case R.id.delete://when we choose delete in menu
                msg= "  delet";
                break;

            case R.id.edit:
                msg=" delete";
                break;

            case R.id.search:
                msg=" search";
                break;

            case R.id.logout:
                msg=" logout";
                break;

            case R.id.settings:
                msg=" settings";
                break;
        }
        //to pop mesage use toast

        Toast.makeText(this,msg + "checked",Toast.LENGTH_LONG).show();
        //so it takes itemid and  save message and show it

        return super.onOptionsItemSelected(item);
    }
}
