package com.palfinger.mobile.instantdemo.feature1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.instantapps.InstantApps;
import com.palfinger.mobile.instantdemo.base.BaseActivity;

public class FeatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.palfinger.mobile.instantdemo.base.R.layout.activity_feature);

        Intent i = new Intent(this, BaseActivity.class);
        InstantApps.showInstallPrompt(this, i, 0, null);
    }
}
