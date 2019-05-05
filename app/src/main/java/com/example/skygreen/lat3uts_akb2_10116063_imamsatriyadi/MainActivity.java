package com.example.skygreen.lat3uts_akb2_10116063_imamsatriyadi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* NIM   : 10116063
* NAMA  : IMAM SATRIYADI
* KELAS : AKB-2 / IF-2
*
* CHANGE LOG : SABTU 20 APRIL 2019
* MEMBUAT SPLASH SCREEN
* */
public class MainActivity extends AppCompatActivity {
    private int waktuDelay  = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent   = new Intent(MainActivity.this, WalkthroughActivity.class);
                startActivity(intent);
                finish();
            }
        }, waktuDelay);
    }
}
