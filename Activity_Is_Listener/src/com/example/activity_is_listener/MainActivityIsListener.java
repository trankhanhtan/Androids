package com.example.activity_is_listener;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivityIsListener extends Activity implements OnClickListener{
	
	Button btnChandoan;
	EditText editTen, editCN, editCC, editBMI, editCD;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btnChandoan = (Button)findViewById(R.id.button1);
        btnChandoan.setOnClickListener(this);
        editTen = (EditText)findViewById(R.id.editten);
        editCN = (EditText)findViewById(R.id.editcannang);
        editCC = (EditText)findViewById(R.id.editchieucao);
        editBMI = (EditText)findViewById(R.id.editBMI);
        editCD = (EditText)findViewById(R.id.editchandoan);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_is_listener, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		double H = Double.parseDouble(editCC.getText()+"");
		double W = Double.parseDouble(editCN.getText()+"");
		double BMI = W/Math.pow(H, 2);
		String chandoan = "";
		
		if(BMI<18)	chandoan = "Bạn gầy";
		else if(BMI<=24.9)	chandoan = "Bạn bình thường";
		else if(BMI<=29.9)	chandoan="Bạn béo phì độ 1";
		else if(BMI<=34.9)	chandoan="Bạn béo phì độ 2";
		else	chandoan="Bạn béo phì độ 3";
		
		DecimalFormat dcf=new DecimalFormat("#.0");
		editBMI.setText(dcf.format(BMI));
		editCD.setText(chandoan);


	}
}
