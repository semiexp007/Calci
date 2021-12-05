package com.akmadheshiya.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView mweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mweb=findViewById(R.id.webView);
        mweb.getSettings().setJavaScriptEnabled(true);

        mweb.loadUrl("file:///android_asset/calci.html");

    }
}