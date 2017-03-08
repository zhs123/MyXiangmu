package adpater;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bwei.myxiangmu.Main2Activity;
import com.bwei.myxiangmu.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import bean.Bean1;
import utils.ImageLoaderUtils;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/2/15
 * 天天优惠适配器
 */

public class Tab_Adapter extends BaseAdapter {
    private List<Bean1.DataBean.ProductsBean> productsBeen;
    private Context context;
    private ListView listView;

    private float jian_price;

    public Tab_Adapter(List<Bean1.DataBean.ProductsBean> productsBeen, Context context,ListView listView) {
        this.productsBeen = productsBeen;
        this.context = context;
        this.listView=listView;
        this.notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return productsBeen.size();
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
            view = View.inflate(context, R.layout.tab_find_hotrecom_item, null);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.imageview);
            viewHolder.texttitle = (TextView) view.findViewById(R.id.texttitle);
            viewHolder.textcount = (TextView) view.findViewById(R.id.textcount);
            viewHolder.textprice = (TextView) view.findViewById(R.id.textprice);
            viewHolder.textprice1 = (TextView) view.findViewById(R.id.textprice1);
            viewHolder.textprice2 = (TextView) view.findViewById(R.id.textprice2);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        DisplayImageOptions options = ImageLoaderUtils.initOptions();
        ImageLoader.getInstance().displayImage(productsBeen.get(i).getImage_small(), viewHolder.imageView, options);

        viewHolder.texttitle.setText(productsBeen.get(i).getName());
        viewHolder.textcount.setText(productsBeen.get(i).getShort_description());
        viewHolder.textprice1.setText(productsBeen.get(i).getPrice());
        viewHolder.textprice.setText(productsBeen.get(i).getFeatured_price());
        viewHolder.textprice2.setText(productsBeen.get(i).getPrice());

        String featured_price = productsBeen.get(i).getFeatured_price();
        String price = productsBeen.get(i).getPrice();
        if (featured_price != null && price != null) {

            float fea_price = Float.parseFloat(featured_price);
            float yuan_price = Float.parseFloat(price);
            jian_price = yuan_price - fea_price;

        }

        viewHolder.textprice2.setText("立减￥" + jian_price + "元");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(context, Main2Activity.class);
                intent.putExtra("id",productsBeen.get(i).getId());


                context.startActivity(intent);


            }
        });



        return view;
    }

    class ViewHolder {
        ImageView imageView;
        TextView texttitle;
        TextView textcount;
        TextView textprice;
        TextView textprice1;
        TextView textprice2;
    }
}
