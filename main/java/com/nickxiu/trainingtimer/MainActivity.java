package com.nickxiu.trainingtimer;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideStatusBar();

        // FrameLayout mainContainer = findViewById(R.id.main_container);
        View.inflate(this, R.layout.main_view, (ViewGroup) findViewById(R.id.main_container));
        View.inflate(this, R.layout.nav_bar, (ViewGroup) findViewById(R.id.nav_bar_container));
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideStatusBar();
    }

    private void hideStatusBar() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }
}
