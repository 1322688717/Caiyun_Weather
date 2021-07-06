package com.example.caiyun_75.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.caiyun_75.Msg.Msg_prediction;
import com.example.caiyun_75.Msg.Msg_real;
import com.example.caiyun_75.R;
import com.example.caiyun_75.Unitl.OKhttpClick.OKhttpClick;
import com.example.caiyun_75.adapter.Rc_yubao;
import com.example.caiyun_75.confit.Confit;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;


public class WeatherPage extends AppCompatActivity {
    private TextView tv_wendu,tv_duoyun,tv_API,tv_PM,tv_suggest,tv_time;
    RecyclerView recyclerView;
    private final Gson gson = new Gson();
    private  Handler handler = new Handler(Looper.getMainLooper());
    private Thread thread;
    private SimpleDateFormat sdf;
    private SwipeRefreshLayout swiperefresh;
    private static Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_page);
        //沉浸式状态栏设置
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        //绑定控件
        initview();

        //设置rc适配器
        initadapter();

        //设置时间
        inittime();

        //设置数据
        initdata();

        //下拉刷新
        initfresh();



    }

    @SuppressLint("ShowToast")
    public static void ToastMessage(Context cont, String msg) {
        if (toast == null) {
            toast = Toast.makeText(cont, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }


    private void initfresh() {
        swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                try {
                    initdata();
                    initadapter();
                    //Toast.makeText(WeatherPage.this, "刷新成功", Toast.LENGTH_SHORT).show();
                    swiperefresh.setRefreshing(false);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(WeatherPage.this, "刷新失败", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


    private void initadapter() {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    String strjson = OKhttpClick.get(Confit.prediction_url);
                    Log.e("TAG","prediction_url json字符串:"+strjson);
                    Msg_prediction msg_prediction = gson.fromJson(strjson, Msg_prediction.class);
                    Log.e("TAG"," msg_prediction:"+ msg_prediction);

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WeatherPage.this);
                            recyclerView.setLayoutManager(linearLayoutManager);
                            Rc_yubao adapter = new Rc_yubao(WeatherPage.this,msg_prediction);
                            recyclerView.setAdapter(adapter);
                        }
                    });

                }
            }).start();


    }

    @SuppressLint({"HandlerLeak", "SimpleDateFormat"})
    private void inittime() {
        sdf = new SimpleDateFormat("hh:mm:ss");
                 tv_time.setText(sdf.format(new Date()));

                 //创建消息处理器 接受子线程发送的消息  根据它做出处理，跟新主界面的值
                 handler = new Handler(){
             @Override
             public void handleMessage(Message msg) {
                                 super.handleMessage(msg);
                                 if(msg.what == 1){
                                         tv_time.setText(sdf.format(new Date()));
                                     }
                             }
         };

                 thread = new Thread(() -> {
                                     while (true){
                                             //让线程  发送消息
                                             handler.sendEmptyMessage(1);
                                             //让线程  睡眠500毫秒
                                             try {
                                                     Thread.sleep(500);
                                                 } catch (InterruptedException e) {
                                                     e.printStackTrace();
                                                 }
                                         }
                                 });
                 //启动线程
                 thread.start();

    }

    @SuppressLint("SetTextI18n")
    private void initdata() {


               new Thread(() -> {
                   String strjson = OKhttpClick.get(Confit.real_url);
                   Log.e("TAG","json字符串:"+strjson);
                   Msg_real msgReal = gson.fromJson(strjson, Msg_real.class);

                   handler.post(() -> {
                       try {
                           tv_suggest.setText(msgReal.getResult().getForecast_keypoint());

                           tv_wendu.setText(msgReal.getResult().getRealtime().getTemperature()+"℃");

                           tv_API.setText(msgReal.getResult().getRealtime().getAirQuality().getAqi().getChn());

                           tv_PM.setText(msgReal.getResult().getRealtime().getAirQuality().getPm25());

                           String yun = msgReal.getResult().getRealtime().getSkycon();
                           if (yun.equals("CLOUDY")){
                               tv_duoyun.setText("多云");
                           }else if (yun.equals("PARTLY_CLOUDY_DAY")){
                               tv_duoyun.setText("局部阴天");
                           }else {
                               tv_duoyun.setText("其他");
                           }
                           ToastMessage(getApplicationContext(),"刷新成功");
                       }catch (Exception e){
                           //防止吐司一直弹出
                           ToastMessage(getApplicationContext(),"请连接网络");
                       }

                   });


               }).start();



    }

    private void initview() {
        tv_wendu = findViewById(R.id.tv_wendu);
        tv_duoyun = findViewById(R.id.tv_duoyun);
        tv_API = findViewById(R.id.tv_47);
        tv_PM = findViewById(R.id.tv_28);
        tv_suggest = findViewById(R.id.tv_suggest);
        recyclerView = findViewById(R.id.rc_yubao);
        tv_time = findViewById(R.id.tv_time);
        swiperefresh = findViewById(R.id.swiperefresh);
    }
}