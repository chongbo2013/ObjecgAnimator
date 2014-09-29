package com.ferris.objecganimator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity {
	private ImageButton btn_start;
	private TextView tv_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }


    public void findView() {
		// TODO Auto-generated method stub
    	btn_start=(ImageButton)findViewById(R.id.btn_start);
    	tv_start=(TextView)findViewById(R.id.tv_start);
    	btn_start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				playWithAfter(btn_start, tv_start);
			}
		});
	}

public void playWithAfter(View btn_start,View tv_start)  
{  
 
 
    ObjectAnimator anim1 = ObjectAnimator.ofFloat(btn_start, "scaleX",  
            1.0f, 1.5f);  
    ObjectAnimator anim2 = ObjectAnimator.ofFloat(btn_start, "scaleY",  
            1.0f, 1.5f);  
    
    
    ObjectAnimator anim3 = ObjectAnimator.ofFloat(tv_start, "scaleX",  
            1.0f, 1.5f);  
    ObjectAnimator anim4 = ObjectAnimator.ofFloat(tv_start, "scaleY",  
            1.0f, 1.5f);  
    
    
    ObjectAnimator anim5 = ObjectAnimator.ofFloat(btn_start, "scaleX",  
    		1.5f, 1.0f);  
    ObjectAnimator anim6 = ObjectAnimator.ofFloat(btn_start, "scaleY",  
    		1.5f, 1.0f);   
    
    ObjectAnimator anim7 = ObjectAnimator.ofFloat(tv_start, "scaleX",  
    		1.5f, 1.0f);  
    ObjectAnimator anim8 = ObjectAnimator.ofFloat(tv_start, "scaleY",  
    		1.5f, 1.0f);   
      
    /** 
     * anim1，anim2,anim3同时执行 
     * anim4接着执行 
     */  
    AnimatorSet animSet = new AnimatorSet();  
    animSet.play(anim1).with(anim2).with(anim3).with(anim4);  
    animSet.play(anim5).with(anim6).with(anim7).with(anim8).after(anim4);
    animSet.setDuration(800);  
    animSet.setInterpolator(new LinearInterpolator());  
    animSet.start();  
}  
}
