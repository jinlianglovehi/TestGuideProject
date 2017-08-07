package com.huami.watch.gps.testguideproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((TextView)findViewById(R.id.test_project)).setText(
                Html.fromHtml(getString(R.string.vo2_max)));


        ((TextView)findViewById(R.id.sport_te)).setText(Html.fromHtml(getString(R.string.first_beat_help_te)));


        ((TextView)findViewById(R.id.train_load)).setText(Html.fromHtml(getString(R.string.first_beat_help_train_load)));
    }
}
