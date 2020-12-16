package com.example.demo_02;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_a;
    private EditText et_b;
    private Button bt;
    private EditText et_c;
    private Button bt_a;
    private int a=60;
    private int v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        et_a = (EditText) findViewById(R.id.et_a);
        et_b = (EditText) findViewById(R.id.et_b);
        bt = (Button) findViewById(R.id.bt);
        et_c = (EditText) findViewById(R.id.et_c);
        bt_a = (Button) findViewById(R.id.bt_a);

        bt.setOnClickListener(this);
        bt_a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt:
                v1 = (int) (100000 + Math.random() * (999999 - 100000 + 1));
                    Toast.makeText(MainActivity.this, "验证码为"+ v1, Toast.LENGTH_SHORT).show();
                if (bt.getText().toString().equals("验证码")){
                    final Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    a--;
                                    bt.setText(a+"秒");
                                    bt.setEnabled(false);
                                    if (a==0){
                                        a=60;
                                        bt.setText("验证码");
                                        bt.setEnabled(true);
                                        timer.cancel();
                                    }
                                }
                            });
                        }
                    },1000,1000);
                }

                break;
            case R.id.bt_a:
                submit();
                break;
        }
    }

    private void submit() {
        // validate
        String a = et_a.getText().toString().trim();
        if (TextUtils.isEmpty(a)) {
            Toast.makeText(this, "请输入账号", Toast.LENGTH_SHORT).show();
            return;
        }

        String b = et_b.getText().toString().trim();
        if (TextUtils.isEmpty(b)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_SHORT).show();
            return;
        }

        String c = et_c.getText().toString().trim();
        if (TextUtils.isEmpty(c)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
        int i = Integer.parseInt(b);
        if (v1==i){
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
            finish();
        }else{
            Toast.makeText(this, "验证码错误", Toast.LENGTH_SHORT).show();
        }

        // TODO validate success, do something


    }
}
