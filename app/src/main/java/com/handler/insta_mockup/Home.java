package com.handler.insta_mockup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
      ImageView imageView,postimage0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new hide_system_ui().hideUI(Home.this);
        setContentView(R.layout.activity_home);

        imageView =  findViewById(R.id.postimage);
        postimage0 = findViewById(R.id.postimage0);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Toast.makeText(this, "Sreen Width :"+width+"  "+"Height :" +height, Toast.LENGTH_SHORT).show();
        imageView.setMaxHeight(width);
        postimage0.setMaxHeight(width);
    }




}