package com.palfinger.mobile.instantdemo.base;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.instantapps.InstantApps;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    public void OnButtonClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mcpummec.github.io/feature1"));
        startActivity(i);
    }
}
