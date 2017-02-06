package com.test.nensee.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


//First comment
public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button btn1f,btn2s,btn3t;
    private fragment_one frg1;
    private fragment_two frg2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        btn1f =(Button) findViewById(R.id.button1);
        btn2s =(Button) findViewById(R.id.button2);


        btn1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frg1 = new fragment_one();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.linearlayout,frg1);
                ft.addToBackStack("");
                ft.commit();
                //     fm.popBackStack();
            }
        });


        btn2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frg2 = new fragment_two();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.linearlayout,frg2);
                ft.addToBackStack("");
                ft.commit();
                //   fm.popBackStack();
            }
        });
    }


}
