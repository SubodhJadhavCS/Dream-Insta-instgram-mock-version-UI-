package com.handler.insta_mockup;

import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class hide_system_ui  {
 /*here in hide ui method the to accept multiple context i used Activity class as refrence parameter
 * Contect as parameter or even extending root class Application is not working but Activity class Accepts all
 * class refrence as it si base class for all classes and now this code is applicable to all classes where we dont wasnt
 * navigation*/


    public void hideUI(Activity mainActivity) {
        mainActivity.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mainActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = mainActivity.getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                |SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        View decorView2 = mainActivity.getWindow().getDecorView();
        decorView2.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
                if((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0){
                    //whenever systeam ui notification or status bar visible it trrigered and it removes the ui
                    //so conistentley shows full screen even touched the screen many times and status bar come out
                   // Toast.makeText(mainActivity, "appeared", Toast.LENGTH_SHORT).show();
                    View decorView = mainActivity.getWindow().getDecorView();
                    int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            |SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            |SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_FULLSCREEN;
                    decorView.setSystemUiVisibility(uiOptions);
                }else{
                    //whenever app loads it trigger this toast
                 //   Toast.makeText(mainActivity, "removed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    /*
this code written for system ui notification panel dropped down it sense that and shows a toast message on it
View decorView = getWindow().getDecorView();
decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            @Override
            public void onSystemUiVisibilityChange(int visibility) {
if((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0){
    Toast.makeText(MainActivity.this, "appeared", Toast.LENGTH_SHORT).show();
}else{
    Toast.makeText(MainActivity.this, "removed", Toast.LENGTH_SHORT).show();
}
            }
        });
 */

}
