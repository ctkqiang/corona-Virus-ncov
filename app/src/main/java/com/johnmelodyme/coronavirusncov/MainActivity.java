package com.johnmelodyme.coronavirusncov;
/*
 * This application is created to keep
 * people up to date on CORONA VIRUS
 * during this epidemic event.
 */
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.jjoe64.graphview.GraphView;


/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus nCov 2020
 * @Inpired : SIN DEE 😍 😘 🥰
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();
    private static String DATA = "file:///android_asset/data.csv";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

