package com.bwei.myxiangmu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import fragment.FavorableFragment;
import fragment.MyFragment;
import fragment.ShoppingFragment;
import fragment.TeaFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private RadioButton rb_home_page;
    private RadioButton rb_category;
    private RadioButton rb_cart;
    private RadioButton rb_mine;
    private RadioGroup radioGroup_Main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        radioGroup_Main = (RadioGroup) findViewById(R.id.radioGroup_Main);
        rb_home_page = (RadioButton) findViewById(R.id.rb_home_page);
        rb_category = (RadioButton) findViewById(R.id.rb_category);
        rb_cart = (RadioButton) findViewById(R.id.rb_cart);
        rb_mine = (RadioButton) findViewById(R.id.rb_mine);
        rb_home_page.setOnClickListener(this);
        rb_category.setOnClickListener(this);
        rb_cart.setOnClickListener(this);
        rb_mine.setOnClickListener(this);
        viewPager.setAdapter(new MyAsder(getSupportFragmentManager()));
        radioGroup_Main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_home_page:
                viewPager.setCurrentItem(0);
                break;
            case R.id.rb_category:
                viewPager.setCurrentItem(1);
                break;
            case R.id.rb_cart:
                viewPager.setCurrentItem(2);
                break;
            case R.id.rb_mine:
                viewPager.setCurrentItem(3);

        }
    }

    class MyAsder extends FragmentPagerAdapter {

        public MyAsder(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new TeaFragment();
                    break;
                case 1:
                    fragment = new FavorableFragment();
                    break;
                case 2:
                    fragment = new ShoppingFragment();
                    break;
                case 3:
                    fragment = new MyFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
