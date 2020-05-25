package com.yunusov.teninterestinganimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UpdateChecker appUpdateChecker = new UpdateChecker(this);  //pass the activity in constructor
        appUpdateChecker.checkForUpdate(false); //mannual check false here
    }

    public void bl1(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Песец");
        i1.putExtra("IMAGE", R.drawable.one);
        i1.putExtra("TEXT", getString(R.string.ptext1));

        startActivity(i1);
    }

    public void bl2(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Снежный барс");
        i1.putExtra("IMAGE", R.drawable.two);
        i1.putExtra("TEXT", getString(R.string.ptext2));

        startActivity(i1);
    }

    public void bl3(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Ахалтекинская лошадь");
        i1.putExtra("IMAGE", R.drawable.three);
        i1.putExtra("TEXT", getString(R.string.ptext3));

        startActivity(i1);
    }

    public void bl4(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Фенек");
        i1.putExtra("IMAGE", R.drawable.four);
        i1.putExtra("TEXT", getString(R.string.ptext4));

        startActivity(i1);
    }

    public void bl5(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Манул");
        i1.putExtra("IMAGE", R.drawable.five);
        i1.putExtra("TEXT", getString(R.string.ptext5));

        startActivity(i1);
    }

    public void bl6(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Утка Мандаринка");
        i1.putExtra("IMAGE", R.drawable.six);
        i1.putExtra("TEXT", getString(R.string.ptext6));

        startActivity(i1);
    }

    public void bl7(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Мальтийский голубой тигр");
        i1.putExtra("IMAGE", R.drawable.seven);
        i1.putExtra("TEXT", getString(R.string.ptext7));

        startActivity(i1);
    }

    public void bl8(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Тигровая акула");
        i1.putExtra("IMAGE", R.drawable.eight3);
        i1.putExtra("TEXT", getString(R.string.ptext8));

        startActivity(i1);
    }

    public void bl9(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Полярный волк");
        i1.putExtra("IMAGE", R.drawable.nine);
        i1.putExtra("TEXT", getString(R.string.ptext9));

        startActivity(i1);
    }

    public void bl10(View view) {
        Intent i1 = new Intent(this, SecondActivity.class);
        i1.putExtra("TITLE", "Большая панда");
        i1.putExtra("IMAGE", R.drawable.ten2);
        i1.putExtra("TEXT", getString(R.string.ptext10));

        startActivity(i1);
    }
}
