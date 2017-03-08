package adpater;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.myxiangmu.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.Bean;
import utils.ImageLoaderUtils;
/**
*1.类的用途
*2.zhanghaisheng
*3.2017/2/14
**/

public class MyAdapter_TeaFragment_right_list extends BaseAdapter {
    Context context;
    List<Bean.DataBean.CategoriesBean.ProductsBean> products;
    private float jian_price;


    public MyAdapter_TeaFragment_right_list(Context context, List<Bean.DataBean.CategoriesBean.ProductsBean> products) {
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.home_fragment_right_list_item, null);
            holder.moon_image = (ImageView) convertView.findViewById(R.id.right_list_item_image);
            holder.moon_right_name = (TextView) convertView.findViewById(R.id.right_list_item_title);
            holder.moon_right_price = (TextView) convertView.findViewById(R.id.right_list_item_price);
            holder.moon_right_yuan = (TextView) convertView.findViewById(R.id.right_list_item_featured_price);
            holder.moon_right_jian = (TextView) convertView.findViewById(R.id.right_list_item_price);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();

        }
//        //显示图片
        DisplayImageOptions options = ImageLoaderUtils.initOptions();
        ImageLoader.getInstance().displayImage(products.get(position).getImage_small(), holder.moon_image,options);

        holder.moon_right_name.setText(products.get(position).getName());
        holder.moon_right_price.setText(products.get(position).getFeatured_price());
        holder.moon_right_yuan.setText(products.get(position).getPrice());
        //在文本中间划线
        holder.moon_right_yuan.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        String featured_price = products.get(position).getFeatured_price();
        String price = products.get(position).getPrice();


        if (featured_price != null && price != null) {

            float xian_price = Float.parseFloat(featured_price);
            int aa = (int) xian_price;
            float yuan_price = Float.parseFloat(price);
            int bb = (int) yuan_price;
            jian_price = yuan_price - xian_price;

        }

        holder.moon_right_jian.setText("立减￥" + jian_price + "元");


        return convertView;
    }

    class ViewHolder {

        private ImageView moon_image;
        private TextView moon_right_name;
        private TextView moon_right_price;
        private TextView moon_right_yuan;
        private TextView moon_right_jian;


    }


}
