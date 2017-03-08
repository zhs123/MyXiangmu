package tabfragment;

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
 * 3.@2017/2/15
 * 亲的最爱
 */


public class Find_hotMonthFragment extends Fragment {
    private View view;
    private String url="http://eleteamapi.ygcr8.com/v1/product/list-top-seller";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       view=inflater.inflate(R.layout.tab_find_hotmonthfragment,null);
        return view;
    }
}
