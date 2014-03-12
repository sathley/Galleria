package com.appacitive.galleria.app;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.appacitive.android.AppacitiveContext;
import com.appacitive.core.model.Environment;
import com.facebook.UiLifecycleHelper;


public class MainActivity extends SherlockFragmentActivity {

    private MainFragment mainFragment;

    private UiLifecycleHelper uiHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppacitiveContext.initialize("MrV9uVl3HNPZUcRvtxqjvaVcw0sfWbQvYudIZCb+zo8=", Environment.sandbox, this);
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            // Add the fragment on initial activity setup
            mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, mainFragment)
                    .commit();
        } else {
            // Or set the fragment from restored state info
            mainFragment = (MainFragment) getSupportFragmentManager()
                    .findFragmentById(android.R.id.content);
        }

    }
}
