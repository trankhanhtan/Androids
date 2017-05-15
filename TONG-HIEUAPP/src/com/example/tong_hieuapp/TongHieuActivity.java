package com.example.tong_hieuapp;

import com.example.tong_hieuapp.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.TextView;

public class TongHieuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tong_hieu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tong_hieu, menu);
        return true;
    }
    
    
    public void TinhTong(View v){
    	//lấy A
    		//Lấy điều khiển
    	TextView txtAA = (TextView)findViewById(R.id.txtA);
    	int a =Integer.parseInt( txtAA.getText().toString());
    	//lấy B
		//Lấy điều khiển
    	TextView txtBB = (TextView)findViewById(R.id.txtB);
    	int b =Integer.parseInt( txtBB.getText().toString());
    	
    	int tong = a+b;
    	
    	//Lấy điều khiển
    	TextView txtKQQQ = (TextView)findViewById(R.id.txtKq);
    	txtKQQQ.setText(tong);
    }
    public void TinhHieu(View v){
    	//lấy A
		//Lấy điều khiển
    	TextView txtAA = (TextView)findViewById(R.id.txtA);
    	int a =Integer.parseInt( txtAA.getText().toString());
    	//lấy B
    	//Lấy điều khiển
    	TextView txtBB = (TextView)findViewById(R.id.txtB);
    	int b =Integer.parseInt( txtBB.getText().toString());
	
    	int hieu = a+b;
	
    	//Lấy điều khiển
    	TextView txtKQQQ = (TextView)findViewById(R.id.txtKq);
    	txtKQQQ.setText(hieu);
    }
}
