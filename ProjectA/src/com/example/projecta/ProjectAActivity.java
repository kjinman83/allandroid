package com.example.projecta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ProjectAActivity extends Activity implements OnClickListener, OnLongClickListener{
	static final int[] BUTTONS = 
	{
		R.id.button1,
		R.id.button2,
		R.id.button3
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		for(int btnId:BUTTONS){
			Button tmpButton = (Button) findViewById(btnId);
			tmpButton.setOnClickListener(this);
			
			tmpButton.setOnLongClickListener(this);
		}
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.button1:
				Toast.makeText(ProjectAActivity.this, "가위", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button2:
				Toast.makeText(ProjectAActivity.this, "바위", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button3:
				Toast.makeText(ProjectAActivity.this, "보", Toast.LENGTH_SHORT).show();
				break;
		}
	}
	
	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.button1:
				Toast.makeText(ProjectAActivity.this, "가위 그만 눌러라", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button2:
				Toast.makeText(ProjectAActivity.this, "바위 그만 눌러라", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button3:
				Toast.makeText(ProjectAActivity.this, "보 그만 눌러라", Toast.LENGTH_SHORT).show();
				break;
		}
		return false;
	}
	

}
