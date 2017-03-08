package adpater;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.myxiangmu.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.DatBean;
import utils.ImageLoaderUtils;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/16
 * 为你精选适配器
 */


public class Tab_hotcollection_Adapter extends BaseAdapter {

    private List<DatBean.DataBean.ProductsBean> productsbean;
    private Context context;
    private float jian_price;
    public Tab_hotcollection_Adapter(List<DatBean.DataBean.ProductsBean> productsbean, Context context) {
        this.productsbean = productsbean;
        this.context = context;
    }



    @Override
    public int getCount() {
        return productsbean.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = View.inflate(context, R.layout.tab_find_hotcolletfragment_item, null);
            viewHolder.tab_imageview = (ImageView) view.findViewById(R.id.tab_imageview);
            viewHolder.tab_texttitle = (TextView) view.findViewById(R.id.tab_texttitle);
            viewHolder.tab_textcount = (TextView) view.findViewById(R.id.tab_textcount);
            viewHolder.tab_textprice = (TextView) view.findViewById(R.id.tab_textprice);
            viewHolder.tab_textprice1 = (TextView) view.findViewById(R.id.tab_textprice1);
            viewHolder.tab_textprice2 = (TextView) view.findViewById(R.id.tab_textprice2);
            view.setTag(viewHolder);

        }else {
            viewHolder  =(ViewHolder) view.getTag();
        }

        DisplayImageOptions options = ImageLoaderUtils.initOptions();
        ImageLoader.getInstance().displayImage(productsbean.get(i).getImage_small(), viewHolder.tab_imageview, options);
        viewHolder.tab_texttitle.setText(productsbean.get(i).getName());
        viewHolder.tab_textcount.setText(productsbean.get(i).getShort_description());
        viewHolder.tab_textprice.setText(productsbean.get(i).getPrice());
        viewHolder.tab_textprice1.setText(productsbean.get(i).getFeatured_price());
        viewHolder.tab_textprice2.setText(productsbean.get(i).getSort()+"");
        String featured_price = productsbean.get(i).getFeatured_price();
        String price = productsbean.get(i).getPrice();
        if (featured_price != null && price != null) {

            float fea_price = Float.parseFloat(featured_price);
            float yuan_price = Float.parseFloat(price);
            jian_price = yuan_price - fea_price;

        }

        viewHolder.tab_textprice2.setText("立减￥" + jian_price + "元");
        return view;
    }

    class ViewHolder {
        ImageView tab_imageview;
        TextView tab_texttitle;
        TextView tab_textcount;
        TextView tab_textprice;
        TextView tab_textprice1;
        TextView tab_textprice2;
    }
}
