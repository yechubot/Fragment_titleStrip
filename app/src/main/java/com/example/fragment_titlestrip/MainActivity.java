package com.example.fragment_titlestrip;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);// 캐싱하는게 3개로 늘어남 미리 프래그먼트 담아놓는?

        MoviePagerAdapter adapter = new MoviePagerAdapter(getSupportFragmentManager(),3);
        Frag1 frag1 = new Frag1();
        adapter.addItem(frag1);
        Frag2 frag2 = new Frag2();
        adapter.addItem(frag2);
        Frag3 frag3 = new Frag3();
        adapter.addItem(frag3);
    }

    class MoviePagerAdapter extends FragmentPagerAdapter {
        ArrayList<Fragment> items = new ArrayList<>();

        public MoviePagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addItem(Fragment item) {
            items.add(item);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return "page"+position;//페이지마다 타이틀 설정
        }
    }
}