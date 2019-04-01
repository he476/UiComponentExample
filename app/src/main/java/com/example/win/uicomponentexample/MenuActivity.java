package com.example.win.uicomponentexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private TextView tv;
    private static final int ITEMID=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv=findViewById(R.id.tv);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu,menu);
        menu.add(Menu.NONE,ITEMID,Menu.NONE,"");
        MenuItem item=menu.findItem(R.id.action_toast);

        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
            @Override
            public boolean onMenuItemClick(MenuItem item){
                Toast.makeText(MenuActivity.this,item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemid=item.getItemId();
        switch(itemid){
            case R.id.red:
                tv.setTextColor(Color.RED);
                break;
            case R.id.black:
                tv.setTextColor(Color.BLACK);
                break;
            case R.id.big_size:
                tv.setTextSize(40);
                break;
            case R.id.mid_size:
                tv.setTextSize(30);
                break;
            case R.id.small_size:
                tv.setTextSize(20);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

