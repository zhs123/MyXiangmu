package tabfragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bwei.myxiangmu.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import adpater.Tab_hotcollection_Adapter;
import bean.DatBean;
import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/15
 * 为你精选
 */


public class Find_hotCollectionFragment extends Fragment {
    private View view;
    private String url = "http://eleteamapi.ygcr8.com/v1/product/list-featured-topic";
    private DatBean datBean;
    private ListView listView;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                String data = (String) msg.obj;
                Gson gson = new Gson();
                datBean = gson.fromJson(data, DatBean.class);
                setData(datBean);
            }
        }


    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab_find_hocollectionfragment, null);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initdata();
    }

    private void initdata() {
        OkHttpUtils.get(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String str = response.body().string();
                handler.obtainMessage(0, str).sendToTarget();
            }
        });
    }

    private void initView() {
        listView = (ListView) view.findViewById(R.id.tab_listview1);
    }


    private void setData(DatBean datBean) {
        List<DatBean.DataBean.ProductsBean> productsbean = datBean.getData().getProducts();
        Tab_hotcollection_Adapter tab_hotcollection_adapter=new Tab_hotcollection_Adapter(productsbean,getActivity());
        listView.setAdapter(tab_hotcollection_adapter);
    }
}
