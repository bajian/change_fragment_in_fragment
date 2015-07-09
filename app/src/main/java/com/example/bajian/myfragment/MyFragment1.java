package com.example.bajian.myfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hgx on 2015/7/9.
 */
public class MyFragment1 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1,null);
        //∑≈fragment¿Ôº‡Ã˝
        View btn = v.findViewById(R.id.go2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new MyFragment2();
                getFragmentManager().beginTransaction()
                        .replace(R.id.main_frame_container, fragment, MyFragment2.class.getName())
                        .commit();
            }
        });
        return v;

    }

}
