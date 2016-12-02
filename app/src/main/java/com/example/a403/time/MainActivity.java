package com.example.a403.time;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    Chronometer chronometer;
    TextView textView2;
    Button button1,button2;
    RadioButton rd1, rd2;
    TimePicker tp1;
    CalendarView cal1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");

        chronometer = (Chronometer)findViewById(R.id.chronometer3);
        textView2 = (TextView)findViewById(R.id.textView8);
        button1 = (Button)findViewById(R.id.button5);
        button2 = (Button)findViewById(R.id.button6);
        rd1 = (RadioButton)findViewById(R.id.radioButton3);
        rd2 = (RadioButton)findViewById(R.id.radioButton4);
        tp1 = (TimePicker)findViewById(R.id.timePicker2);
        cal1 = (CalendarView)findViewById(R.id.calendarView3);

        rd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal1.setVisibility(View.VISIBLE);
                tp1.setVisibility(View.INVISIBLE);
            }
        });
        rd2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                cal1.setVisibility(View.INVISIBLE);
                tp1.setVisibility(View.VISIBLE);
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                chronometer.setTextColor(Color.RED);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                chronometer.stop();
                chronometer.setTextColor(Color.BLUE);

            }
        });


    }


}
