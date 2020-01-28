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

/**
 * @Author: John Melody Melissa
 * @Project: Corona Virus nCov
 * @Inpired : SIN DEE 😍 😘 🥰
 */
public class MainActivity extends AppCompatActivity {

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

