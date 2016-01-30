package com.exinnos.ramprasadappportfolio;

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

        // For now we dont need this FAB button.So commented this.
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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
            case R.id.button_app1:
                showMessage(view, "spotify streamer");
                break;

            case R.id.button_app2:
                showMessage(view, "scores app");
                break;

            case R.id.button_app3:
                showMessage(view, "library app");
                break;

            case R.id.button_app4:
                showMessage(view, "build it bigger");
                break;

            case R.id.button_app5:
                showMessage(view, "xyz reader");
                break;

            case R.id.button_app6:
                showMessage(view, "capstone app");
                break;

        }
    }

    /**
     * Show a message with given app name.
     *
     * @param view
     * @param appName
     */
    private void showMessage(View view, String appName) {

        Snackbar.make(view, "This button will launch my " + appName + "!", Snackbar.LENGTH_LONG).show();

    }


}
