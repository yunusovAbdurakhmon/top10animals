package com.yunusov.teninterestinganimals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private TextView title;
    private TextView text;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: starts");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        title = findViewById(R.id.title);
        text = findViewById(R.id.text);
        image = findViewById(R.id.image);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            String p_title = bundle.getString("TITLE");
            String p_text = bundle.getString("TEXT");
            int imageId = bundle.getInt("IMAGE");

            title.setText(p_title);
            text.setText(p_text);
            image.setBackgroundResource(imageId);
        }
        Log.d(TAG, "onCreate: ends");
    }


}