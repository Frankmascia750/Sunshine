package com.example.android.sunshine;

import android.graphics.Paint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int tempnow = 45;
        int todayHigh = 56;
        int todayLow = 40;
        int tomorrowHigh = 70;
        int tomorrowLow = 40;
        int dayAfterTomHigh = 45;
        int dayAfterTomLow = 42;

        TextView tv1 = (TextView) findViewById(R.id.weather);
        tv1.setPaintFlags(tv1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        TextView temp;

        temp = (TextView) findViewById(R.id.now);
        temp.setText("Now: " + tempnow + "*");


        temp = (TextView) findViewById(R.id.today);
        temp.setText("Today: " + todayHigh + "* / " + todayLow + "*");


        temp = (TextView) findViewById(R.id.tomorrow);
        temp.setText("Tomorrow: " + tomorrowHigh + "* / " + tomorrowLow + "*");

        temp = (TextView) findViewById(R.id.day_after_tomorrow);
        temp.setText("The day after tomorrow: " + dayAfterTomHigh + "* / " + dayAfterTomLow + "*");

    }
}



