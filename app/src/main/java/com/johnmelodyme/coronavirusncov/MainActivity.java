package com.johnmelodyme.coronavirusncov;
/*
 * This application is created to keep
 * people up to date on CORONA VIRUS
 * during this epidemic event.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import com.jjoe64.graphview.GraphView;


/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus nCov 2020
 * @Inpired : SIN DEE 😍 😘 🥰
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.wv);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6");
        webView.loadUrl("https://www.statista.com/chart/20621/countries-and-territories-with-cases-of-the-coronavirus/");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.info) {

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

