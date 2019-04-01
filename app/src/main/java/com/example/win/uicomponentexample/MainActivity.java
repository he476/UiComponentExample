package com.example.win.uicomponentexample;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button listview_btn;
    Button alertDiglog;
    Button menu_btn;
    Button action_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview_btn=findViewById(R.id.listview_btn);
        alertDiglog=findViewById(R.id.AlertDiglog);
        menu_btn=findViewById(R.id.menu_btn);
        action_btn=findViewById(R.id.action_btn);
        listview_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,ListViewActivity.class));
            }
        });
        alertDiglog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,AlertDialogActivity.class));
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setView(R.layout.activity_alert_dialog);
                builder.show();
            }
        });
        menu_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,MenuActivity.class));
            }
        });
        action_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,ActionModeActivity.class));
            }
        });

    }
}
