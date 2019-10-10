package info.androidhive.materialtabs.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.fragments.OneFragment;
import info.androidhive.materialtabs.fragments.ThreeFragment;
import info.androidhive.materialtabs.fragments.TwoFragment;


public class IconTextTabsActivity extends AppCompatActivity {

    private Toolbar toolbar2;
    private TabLayout Tl;
    private ViewPager viewPager;


    private int[] tabicons = {
            R.drawable.calculator,
            R.drawable.square,
            R.drawable.box,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_text_tabs);

        toolbar2 = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar2);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        Tl = (TabLayout) findViewById(R.id.tabs);
        Tl.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        Tl.getTabAt(0).setIcon(tabicons[0]);
        Tl.getTabAt(1).setIcon(tabicons[1]);
        Tl.getTabAt(2).setIcon(tabicons[2]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "Kalkulator");
        adapter.addFrag(new TwoFragment(), "Bangun Datar");
        adapter.addFrag(new ThreeFragment(), "Bangun Ruang");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
