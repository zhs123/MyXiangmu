package fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.myxiangmu.R;

import java.util.ArrayList;
import java.util.List;

import adpater.Tablayout_Adapter;
import tabfragment.Find_hotCollectionFragment;
import tabfragment.Find_hotMonthFragment;
import tabfragment.Find_hotRecommendFragment;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/9
 * 优惠页面
 */


public class FavorableFragment extends Fragment {
    //定义TabLayout
    private TabLayout tab_FindFragment_title;
    //定义viewPager
    private ViewPager vp_FindFragment_pager;


    //定义adapter

    //定义要装fragment的列表
    private List<Fragment> list_fragment;
    //tab名称列表
    private List<String> list_title;
    //天天优惠fragment
    private Find_hotRecommendFragment hotRecommendFragment;
    //为你精选fragment
    private Find_hotCollectionFragment hotCollectionFragment;
    //亲的最爱fragment
    private Find_hotMonthFragment hotMonthFragment;
    private View view;
    private Tablayout_Adapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.favorablefrafment, null);
        //初始化

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();

    }

    private void initView() {
        tab_FindFragment_title = (TabLayout) view.findViewById(R.id.tab_FindFragment_title);
        vp_FindFragment_pager = (ViewPager) view.findViewById(R.id.vp_FindFragment_pager);

        //初始化各fragment
        hotRecommendFragment = new Find_hotRecommendFragment();
        hotCollectionFragment = new Find_hotCollectionFragment();
        hotMonthFragment = new Find_hotMonthFragment();

        //将fragment装进集合中
        list_fragment = new ArrayList<>();
        list_fragment.add(hotRecommendFragment);
        list_fragment.add(hotCollectionFragment);
        list_fragment.add(hotMonthFragment);


        //将名称加载tab名字列表，正常情况下，我们应该在values/arrays.xml中进行定义然后调用
        list_title = new ArrayList<>();
        list_title.add("天天优惠");
        list_title.add("为你精选");
        list_title.add("亲的最爱");


        //设置TabLayout的模式
        tab_FindFragment_title.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(0)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(1)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(2)));

        adapter = new Tablayout_Adapter(getActivity().getSupportFragmentManager(), list_fragment, list_title);

        //viewpager加载adapter
        vp_FindFragment_pager.setAdapter(adapter);

        //tab_FindFragment_title.setViewPager(vp_FindFragment_pager);
        //TabLayout加载viewpager
        tab_FindFragment_title.setupWithViewPager(vp_FindFragment_pager);
        //tab_FindFragment_title.set


    }


}
