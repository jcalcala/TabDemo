package com.rabor.tabdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by leticia.rabor on 9/22/2015.
 */
public class MyFragment extends Fragment {

    private Button ClickMe;
    private TextView tv;

    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();

        return fragment;
    }

    public MyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.my_fragment, container, false);

        ClickMe = (Button) rootView.findViewById(R.id.button);
        tv = (TextView) rootView.findViewById(R.id.textView2);

        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv.getText().toString().contains("Mele Kalikimaka")) {
                    tv.setText("Merry Christmas");
                } else {
                    tv.setText("Mele Kalikimaka");
                }
            }
        });

        return rootView;
    }

}
