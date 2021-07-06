package com.example.caiyun_75.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.caiyun_75.Msg.Msg_prediction;
import com.example.caiyun_75.R;

import java.text.NumberFormat;
import java.util.List;

public class Rc_yubao extends RecyclerView.Adapter<Rc_yubao.ViewHolder> {
    private Context context;
    private TextView tv_time,tv_tianqi,tv_temp,tv_shidu;
    private Msg_prediction data;

    public Rc_yubao(Context context, Msg_prediction data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Rc_yubao.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Rc_yubao.ViewHolder holder, int position) {
        tv_temp.setText(data.getResult().getDaily().getTemperature().get(position).getAvg()+"℃");

        String tianqi = data.getResult().getDaily().getSkycon().get(position).getValue();
        if (tianqi.equals("PARTLY_CLOUDY_DAY")){
            tv_tianqi.setText("阴天");
        }else if (tianqi.equals("CLOUDY")){
            tv_tianqi.setText("多云");
        }else if (tianqi.equals("LIGHT_RAIN")){
            tv_tianqi.setText("小雨");
        }else{
            tv_tianqi.setText("其他");
        }

        NumberFormat nt = NumberFormat.getPercentInstance();
        nt.setMinimumFractionDigits(0);
        Double shidu = data.getResult().getDaily().getHumidity().get(position).getAvg();
        tv_shidu.setText("湿度"+nt.format(shidu));
        String time = data.getResult().getDaily().getTemperature().get(position).getDate().substring(0,10);
        tv_time.setText(time);


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_shidu = itemView.findViewById(R.id.tv_shidu);
            tv_temp = itemView.findViewById(R.id.tv_temp);
            tv_tianqi = itemView.findViewById(R.id.tv_tianqi);
            tv_time = itemView.findViewById(R.id.tv_time);
        }
    }
}
