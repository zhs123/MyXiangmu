package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.myxiangmu.R;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/9
 * 我的页面
 */


public class MyFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.myfment,container,false);
        return view;
    }
}
