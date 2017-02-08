package com.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.demo.rxactivity.CheeseActivity;

public class MainActivity extends Activity {

    private Button bt_do;
    private Button bt_do2;
    private TextView tv_show;
    private EditText et_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt_do = (Button)findViewById(R.id.bt_do);
        bt_do2 = (Button)findViewById(R.id.bt_do2);
        tv_show = (TextView)findViewById(R.id.tv_show);
        et_input = (EditText)findViewById(R.id.et_input);
        bt_do.setOnClickListener(mOnClickListener);
        bt_do2.setOnClickListener(mOnClickListener);
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt_do:
                    break;
                case R.id.bt_do2:
                startActivity(new Intent(MainActivity.this, CheeseActivity.class));
                    break;
            }
        }
    };

    private void showToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

}
