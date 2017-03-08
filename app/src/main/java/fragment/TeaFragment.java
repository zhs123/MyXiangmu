package fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bwei.myxiangmu.R;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adpater.MyAdapter_TeaFragment_right_list;
import adpater.Myadapter_TeaFragment_left_list;
import bean.Bean;
import costomview.library.OkHttpUtils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/9
 * 月光茶人页面
 */


public class TeaFragment extends Fragment {
    private Bean bean;
    private View View;
    private String url = "http://eleteamapi.ygcr8.com/v1/category/list-with-product";
    private ListView listview_left;
    private ListView listview_right;
    private ArrayList<String> nameList = new ArrayList<>();


    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                String data = (String) msg.obj;
                Gson gson = new Gson();
                bean = gson.fromJson(data, Bean.class);
                setData(bean);

            }
        }


    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View = inflater.inflate(R.layout.teaframent, null);

        return View;
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
                String moonData = response.body().string();
                handler.obtainMessage(0, moonData).sendToTarget();
            }
        });
    }

    private void initView() {

        listview_left = (ListView) View.findViewById(R.id.mRecycler_left);

        listview_right = (ListView) View.findViewById(R.id.mRecycler_two);

    }

    private void setData(final Bean bean) {
        List<Bean.DataBean.CategoriesBean> categoriesBeanList = bean.getData().getCategories();
        for (int i = 0; i < categoriesBeanList.size(); i++) {
            nameList.add(categoriesBeanList.get(i).getName());

        }

        Myadapter_TeaFragment_left_list myAsder = new Myadapter_TeaFragment_left_list(nameList, getActivity());
        listview_left.setAdapter(myAsder);
        listview_left.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                List<Bean.DataBean.CategoriesBean.ProductsBean> products = bean.getData().getCategories().get(i).getProducts();

                listview_right.setAdapter(new MyAdapter_TeaFragment_right_list(getActivity(), products));
            }
        });
    }

}
