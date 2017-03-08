package com.bwei.myxiangmu;

import android.app.Application;
import android.content.Context;

import utils.ImageLoaderUtils;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/14
 */


public class MyApp extends Application{
    //点击首页左侧数据记录位置
    public static int num=0;
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
        ImageLoaderUtils.initConfiguration(context);
    }
}
