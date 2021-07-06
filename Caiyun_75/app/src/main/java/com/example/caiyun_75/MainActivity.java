package com.example.caiyun_75;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.caiyun_75.UI.WeatherPage;

public class MainActivity extends AppCompatActivity {
    private Button btn_intent;
    final Handler handler = new Handler();
    //实例化一个runable
    private Runnable runable = new Runnable() {
        @Override
        public void run() {
            tologin();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //全屏显示
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        //绑定控件
        initview();

        //点击跳转
        clicktologin();

        //等待三秒跳转
        waittologin();
    }

    private void tologin() {
        Intent intent = new Intent(MainActivity.this, WeatherPage.class);
        startActivity(intent);
        finish();
    }

    private void clicktologin() {
        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runable);
                tologin();
            }
        });
    }

    private void waittologin() {
        //延迟三秒后实现runable
        handler.postDelayed(runable,3000);
    }

    private void initview() {
        btn_intent = findViewById(R.id.btn_intent);
    }
}