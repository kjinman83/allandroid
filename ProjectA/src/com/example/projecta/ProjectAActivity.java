package com.example.projecta;

import java.util.Random;

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
	static final String gawi[] = {"가위", "바위", "보"};
	
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
		Random r = new Random();
		int computer = r.nextInt(3);
		
		
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.button1:
				ResultGame(0, computer);
				//Toast.makeText(ProjectAActivity.this, "가위", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button2:
				ResultGame(1, computer);
				//Toast.makeText(ProjectAActivity.this, "바위", Toast.LENGTH_SHORT).show();
				break;
			case R.id.button3:
				ResultGame(2, computer);
				//Toast.makeText(ProjectAActivity.this, "보", Toast.LENGTH_SHORT).show();
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
	
	
	public void ResultGame(int i, int j){
		//i= 내꺼, j= 컴퓨터꺼
		//가위=0, 바위=1, 보=2		
		
		switch(i){
		case 0:
			if(j == 0){
				Toast.makeText(ProjectAActivity.this, "비겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 1){
				Toast.makeText(ProjectAActivity.this, "졌습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 2){
				Toast.makeText(ProjectAActivity.this, "이겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}			
			
			break;
		case 1:
			if(j == 0){
				Toast.makeText(ProjectAActivity.this, "이겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 1){
				Toast.makeText(ProjectAActivity.this, "비겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 2){
				Toast.makeText(ProjectAActivity.this, "졌습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}	
			break;
		case 2:
			if(j == 0){
				Toast.makeText(ProjectAActivity.this, "졌습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 1){
				Toast.makeText(ProjectAActivity.this, "이겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}else if(j == 2){
				Toast.makeText(ProjectAActivity.this, "비겼습니다." + " 나:" + gawi[i] + " 컴퓨터:" + gawi[j], Toast.LENGTH_SHORT).show();
			}	
			break;
		}
		
	}
	

}
