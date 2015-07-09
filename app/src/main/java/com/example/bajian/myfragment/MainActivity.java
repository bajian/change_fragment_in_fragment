package com.example.bajian.myfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFristFragment();
    }

    private void initFristFragment() {
        Fragment fragment = new MyFragment1();
        Bundle bundle = new Bundle();
        getFragmentManager().beginTransaction()
                .replace(R.id.main_frame_container, fragment, MyFragment1.class.getName())
                .commit();
    }
/*    public void go2(View view){
        Fragment fragment = new MyFragment2();
        getFragmentManager().beginTransaction()
                .replace(R.id.main_frame_container, fragment, MyFragment2.class.getName())
                .commit();
    }*/

    public void go1(View view){
        Fragment fragment = new MyFragment1();
        getFragmentManager().beginTransaction()
                .replace(R.id.main_frame_container, fragment, MyFragment1.class.getName())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
