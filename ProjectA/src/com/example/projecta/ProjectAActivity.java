package com.example.projecta;

import java.util.Random;
import com.example.projecta.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectAActivity extends Activity implements OnClickListener, OnLongClickListener{
	static final int[] BUTTONS = 
	{
		R.id.button1,
		R.id.button2,
		R.id.button3
	};
	
	static final String gawi[] = {"가위", "바위", "보"};
	TextView textview1;
	TextView textview2;
	int win = 0;
	int lose = 0;
	int same = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		textview1 = (TextView) findViewById(R.id.text1);
		textview2 = (TextView) findViewById(R.id.text2);
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
				break;
			case R.id.button2:
				ResultGame(1, computer);
				break;
			case R.id.button3:
				ResultGame(2, computer);
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
	
	
	public void ResultGame(int me, int com){
		//me= 내꺼, com= 컴퓨터꺼
		//가위=0, 바위=1, 보=2
		
		String result = "";
		String game = "";
		
		switch(me){
		case 0:
			if(com == 0){
				result = "비겼습니다.";
				same++;
			}else if(com == 1){
				result = "졌습니다.";				
				lose++;
			}else if(com == 2){				
				result = "이겼습니다.";
				win++;
			}			
			
			break;
		case 1:
			if(com == 0){
				result = "이겼습니다.";
				win++;
			}else if(com == 1){
				result = "비겼습니다.";
				same++;
			}else if(com == 2){
				result = "졌습니다.";
				lose++;
			}	
			break;
		case 2:
			if(com == 0){
				result = "졌습니다.";
				lose++;
			}else if(com == 1){
				result = "이겼습니다.";
				win++;
			}else if(com == 2){
				result = "비겼습니다.";
				same++;
			}	
			break;
		}
		
		result += "ME>" + gawi[me] + " COMPUTER>" + gawi[com];
		game = win+"승"+same+"무"+lose+"패";
				
		textview1.setText(result);
		textview2.setText(game);
		
		
	}

}
