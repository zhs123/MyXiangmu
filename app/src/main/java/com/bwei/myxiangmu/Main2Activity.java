package com.bwei.myxiangmu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;

import bean.ShangpingBean;
import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class Main2Activity extends AppCompatActivity {
    private TextView shangping_title;
    private ViewPager viewPager;
    private TextView shangping_price;
    private TextView shangping_priceee;
    private TextView shangping_count;
    private String url="http://eleteamapi.ygcr8.com/v1/product/view?id=";
    private ShangpingBean shangpingbean;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                String data =(String) msg.obj;
                Log.i("-------------",data+"--------");

                Gson gson=new Gson();
                shangpingbean=gson.fromJson(data,ShangpingBean.class);
                setData(shangpingbean);
            }

        }


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 1);

        initView();
       initData(id);
    }

    private void initData(int id) {
        String path=url+id;
        Log.i("++++++++++++++++++++++",path+"++++++++++++++++++++");
        OkHttpUtils.get(path, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String data=response.body().string();
                Log.i("&&&&&&&&&&&&&&&&",data+"&&&&&&&&&&&&+");

                handler.obtainMessage(0,data).sendToTarget();
            }
        });
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        shangping_title = (TextView) findViewById(R.id.shangping_title);
        shangping_price = (TextView) findViewById(R.id.shangping_price);
        shangping_priceee = (TextView) findViewById(R.id.shangping_priceee);
        shangping_count = (TextView) findViewById(R.id.shangping_count);

    }
    private void setData(ShangpingBean shangpingbean) {
        ShangpingBean.DataBean.ProductBean product = shangpingbean.getData().getProduct();
        shangping_title.setText(product.getName());
        shangping_price.setText(product.getFeatured_price()+"");
        shangping_priceee.setText(product.getPrice()+"");
        shangping_count.setText(product.getShort_description()+"");

    }

}
