package com.example.antony.myapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentContainer = (FrameLayout) findViewById(R.id.container);
        pushFragment(new IOSSwipeListFragment());
    }

    public void pushFragment(Fragment fragment) {
        if (isFinishing()) return;
        getFragmentManager().beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(fragmentContainer.getId(), fragment)
                .addToBackStack(fragment.getClass().getName())
                .commitAllowingStateLoss();
    }
}
