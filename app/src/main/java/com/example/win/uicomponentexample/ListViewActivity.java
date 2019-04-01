package com.example.win.uicomponentexample;

import android.graphics.Color;
import android.net.wifi.hotspot2.pps.Credential;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {

    //列表文本
    String []text={"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    //图片
    int[] imageId={R.drawable.lion,R.drawable.tiger,
            R.drawable.monkey,R.drawable.dog,
            R.drawable.cat,R.drawable.elephant};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView=findViewById(R.id.list_view);
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        for(int i=0;i<text.length;i++){
            Map<String,Object> listItem=new HashMap<String,Object>();
            listItem.put("Name",text[i]);
            listItem.put("Image",imageId[i]);
            list.add(listItem);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,list,R.layout.layout1,
                new String[]{"Name","Image"},new int[]{R.id.Name,R.id.Image});

        listView.setAdapter(simpleAdapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String t= text[position];
                view.setBackgroundColor(Color.GRAY);
                Toast.makeText(ListViewActivity.this,t,Toast.LENGTH_SHORT).show();
//                view.setBackgroundColor(Color.WHITE);
                return true;
            }
        });


    }
}
