package adpater;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bwei.myxiangmu.R;

import java.util.ArrayList;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/14
 */


public class Myadapter_TeaFragment_left_list extends BaseAdapter{
    public Myadapter_TeaFragment_left_list(ArrayList<String> nameList, Context context) {
        this.nameList = nameList;
        this.context = context;
    }

    private ArrayList<String> nameList;
    private Context context;



    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int position) {
        return nameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder v = null;
        if (convertView == null) {
            v = new ViewHolder();
            convertView = View.inflate(context, R.layout.home_fragment_left_list_item, null);
            v.textView = (TextView) convertView.findViewById(R.id.home_fragment_left_item_text);
            v.relativeLayout = (RelativeLayout) convertView.findViewById(R.id.r);
            convertView.setTag(v);
        } else {
            v = (ViewHolder) convertView.getTag();
        }
//        if (MyApp.num == position) {
//           // v.relativeLayout.setBackgroundResource(R.color.home_fragment_left_list_item_bc);
//        } else {
//          //  v.relativeLayout.setBackgroundResource(R.color.home_fragment_left_list);
//        }
        v.textView.setText(nameList.get(position));
        return convertView;
    }

    class ViewHolder {
        RelativeLayout relativeLayout;
        TextView textView;
    }
}
