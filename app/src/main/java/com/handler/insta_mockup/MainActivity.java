package com.handler.insta_mockup;

import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new hide_system_ui().hideUI(MainActivity.this);
        setContentView(R.layout.activity_main);




}

    public void goto_home(View view) {

        Intent intent = new Intent(MainActivity.this,Home.class);
        startActivity(intent);

    }
}

