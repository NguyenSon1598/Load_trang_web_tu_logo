package com.example.loadtrangwebtulogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView webview = (WebView)findViewById(R.id.webbid);
        webview.loadUrl("https://maps.google.com/");
        webview.getSettings().setJavaScriptEnabled(true);
    }
}
