package com.example.collapsingtoolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class CheeseDetailActivity extends AppCompatActivity {

    TextView tvTotalServiceCount, tvTotalServiceText, tvtotalRatingPoint, tvtotalRatingText;
    ImageView ivTotalServiceIcon, ivtotalRatingIcon, ivpatientMainProPic;

    public static final String EXTRA_NAME = "cheese_name";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTotalServiceCount = (TextView)findViewById(R.id.totalServiceCount);
        tvTotalServiceText = (TextView)findViewById(R.id.totalServiceText);
        tvtotalRatingPoint = (TextView)findViewById(R.id.totalRatingPoint);
        tvtotalRatingText = (TextView)findViewById(R.id.totalRatingText);

        ivTotalServiceIcon = (ImageView)findViewById(R.id.totalServiceIcon);
        ivtotalRatingIcon = (ImageView)findViewById(R.id.totalRatingIcon);
        ivpatientMainProPic = (ImageView)findViewById(R.id.patientMainProPic);


        Intent intent = getIntent();
        final String cheeseName = intent.getStringExtra(EXTRA_NAME);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(cheeseName);

    }

}
