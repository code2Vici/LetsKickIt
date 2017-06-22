package com.conquer.naborp.letskickit;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Homescreen extends AppCompatActivity {

    private Typeface typeface;
    private TextView appNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/WildCreaturesSample.ttf");
        appNameTextView = (TextView) findViewById(R.id.appNameTxtView);
        appNameTextView.setTypeface(typeface, typeface.BOLD_ITALIC);
    }
}
