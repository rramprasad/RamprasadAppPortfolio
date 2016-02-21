package com.exinnos.ramprasadappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * @author RAMPRASAD
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set toolbar for this activity.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Launch app corresponding to button clicked.
     *
     * @param view
     */
    public void launchApp(View view) {

        switch (view.getId()) {
            case R.id.button_movies_app:
                launchApp("com.exinnos.popularmovies");
                break;

            case R.id.button_football_scores_app:
                showMessage(view, "scores app");
                break;

            case R.id.button_library_app:
                showMessage(view, "library app");
                break;

            case R.id.button_build_it_bigger:
                showMessage(view, "build it bigger");
                break;

            case R.id.button_xyz_reader:
                showMessage(view, "xyz reader");
                break;

            case R.id.button_capstone_my_own_app:
                showMessage(view, "capstone app");
                break;

        }
    }

    /**
     * Show a message with given app name.
     * @param view
     * @param appName
     */
    private void showMessage(View view, String appName) {
        Snackbar.make(view, "This button will launch my " + appName + "!", Snackbar.LENGTH_LONG).show();
    }

    /**
     * Launch app with given package name
     * @param packageName
     */
    private void launchApp(String packageName) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(packageName);
        startActivity(launchIntentForPackage);
    }




}
