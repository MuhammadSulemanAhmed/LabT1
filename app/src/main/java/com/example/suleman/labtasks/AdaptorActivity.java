package com.example.suleman.labtasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AdaptorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptor);
        //ADAPTORVIEW
        ListView list1=(ListView) findViewById(R.id.list1);
        String strArray[]={"First","First","First","First","First","First",
                "First","First","First","First","First","First","First","First","First","First","First","First","First"};
        ArrayAdapter arrayAdaptor=new ArrayAdapter(this,android.R.layout.simple_list_item_1,strArray);
        list1.setAdapter(arrayAdaptor);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AdaptorActivity.this,LabTaskOne.class);
                startActivity(intent);
            }
        });

    }


}
