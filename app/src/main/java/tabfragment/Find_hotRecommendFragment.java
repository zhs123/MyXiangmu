package tabfragment;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bwei.myxiangmu.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import adpater.Tab_Adapter;
import bean.Bean1;
import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/15
 * 天天优惠
 */


public class Find_hotRecommendFragment extends Fragment {
    private View view;
    private ListView listView;
    private Bean1 bean1;
    private String url="http://eleteamapi.ygcr8.com/v1/product/list-featured-price";
    private ImageView imageView;
    private TextView texttitle;
    private TextView textcount;
    private TextView textprice;
    private TextView textprice1;
    private TextView textprice2;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                String data=(String) msg.obj;
                Gson gson=new Gson();
                bean1=gson.fromJson(data,Bean1.class);
                setData(bean1);
            }

        }


    };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       view=inflater.inflate(R.layout.tab_find_hotrecommendfragment,null);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();

    }

    private void initData() {
        OkHttpUtils.get(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String moonData=response.body().string();
                handler.obtainMessage(0,moonData).sendToTarget();
            }
        });
    }

    private void initView() {
         listView=(ListView) view.findViewById(R.id.tab_listview3);
         imageView = (ImageView) view.findViewById(R.id.imageview);
         texttitle = (TextView) view.findViewById(R.id.texttitle);
         textcount = (TextView) view.findViewById(R.id.textcount);
         textprice = (TextView) view.findViewById(R.id.textprice);
         textprice1 = (TextView) view.findViewById(R.id.textprice1);
         textprice2 = (TextView) view.findViewById(R.id.textprice2);
    }


    private void setData(Bean1 bean1) {
        List<Bean1.DataBean.ProductsBean> productsBeen=bean1.getData().getProducts();

        Tab_Adapter tab_adapter=new Tab_Adapter(productsBeen,getActivity(),listView);
        listView.setAdapter(tab_adapter);
    }


}
