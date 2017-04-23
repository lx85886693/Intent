package com.fjnu.administrator.intentwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity_Browser extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__browser);
        intiView();
    }
    private void  intiView()
    {
        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        if(TextUtils.isEmpty(url))
        {
            url="http://www.baidu.com";
        }
        WebView webView=(WebView)findViewById(R.id.my_webview);
        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        webView.loadUrl(url);
    }
}
