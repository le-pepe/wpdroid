package cl.skar.undiacomohoy.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import cl.skar.undiacomohoy.R;
import cl.skar.undiacomohoy.fragments.RecyclerFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //NavigationDrawerLayout
    private DrawerLayout mNavigationDrawer;
    //Toolbar
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind NavigationDrawer
        mNavigationDrawer = (DrawerLayout) findViewById(R.id.main_side_menu);
        //Bind NavigationView
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.main_navigationview);
        //Bind toolbar
        mToolbar = (Toolbar) findViewById(R.id.main_toolbar);

        //SetUp
        mNavigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerFragment fragment = RecyclerFragment.newInstance(getApplicationContext().getString(R.string.last_post));
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content_frame, fragment, fragment.getClass().getName())
                .commitAllowingStateLoss();
        mNavigationView.getMenu().getItem(0).setChecked(true);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case (android.R.id.home):
                if (mNavigationDrawer.isDrawerOpen(GravityCompat.START))
                    mNavigationDrawer.closeDrawer(GravityCompat.START);
                else
                    mNavigationDrawer.openDrawer(GravityCompat.START);

                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuselected) {

        return true;
    }

    public void switchContent(Fragment fragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content_frame, fragment, fragment.getClass().getName())
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }


}
