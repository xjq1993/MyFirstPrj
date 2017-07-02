package com.example.administrator.myfirstprj;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    private  TextView text;
    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private CheckBox boxall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        text = (TextView)findViewById(R.id.textview);
        box1 = (CheckBox)findViewById(R.id.box1);
        box2 = (CheckBox)findViewById(R.id.box2);
        box3 = (CheckBox)findViewById(R.id.box3);
        boxall = (CheckBox)findViewById(R.id.boxall);
        ButtonListener buttonListener = new ButtonListener();
        box1.setOnClickListener(buttonListener);
        box2.setOnClickListener(buttonListener);
        box3.setOnClickListener(buttonListener);
        boxall.setOnClickListener(buttonListener);
    }
    class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            CheckBox checkbox =(CheckBox)v;
            if(v.getId() == R.id.boxall){
                if(checkbox.isChecked()){
                    box1.setChecked(true);
                    box2.setChecked(true);
                    box3.setChecked(true);
                }
                else{
                    box1.setChecked(false);
                    box2.setChecked(false);
                    box3.setChecked(false);
                }
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
