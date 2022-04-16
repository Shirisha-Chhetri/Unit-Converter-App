package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Time extends AppCompatActivity{
    Button timebtn;
    EditText from,to;
    String[] time;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        timebtn = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        time=getResources().getStringArray(R.array.time);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        timebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(time[0])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(monthTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(monthToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(monthToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(monthTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(monthTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(monthTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(monthTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(time[1])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(weekTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(weekToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(weekToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(weekTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(weekTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(weekTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(weekTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(time[2])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(dayTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(dayToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(dayToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(dayTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(dayTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(dayTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(dayTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(time[3])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(hourTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(hourToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(hourToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(hourTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(hourTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(hourTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(hourTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(time[4])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(minTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(minToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(minToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(minTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(minTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(minTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(minTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(time[5])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(secTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(secToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(secToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(secTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(secTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(secTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(secTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(time[6])) {
                        if (spinner1.getSelectedItem().toString().equals(time[0])) {
                            to.setText(msecTomonth(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[1])) {
                            to.setText(msecToweek(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[2])) {
                            to.setText(msecToday(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[3])) {
                            to.setText(msecTohour(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[4])) {
                            to.setText(msecTomin(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[5])) {
                            to.setText(msecTosec(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(time[6])) {
                            to.setText(msecTomsec(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //month
    private String monthTomonth(double m) {
        double month = m  ;
        return String.valueOf(month);
    }
    private String monthToweek(double m) {
        double week = m * 4.345 ;
        return String.valueOf(week);
    }
    private String monthToday(double m) {
        double day = m * 30.417;
        return String.valueOf(day);
    }
    private String monthTohour(double m) {
        double hour = m * 730;
        return String.valueOf(hour);
    }
    private String monthTomin(double m) {
        double min = m * 43800;
        return String.valueOf(min);
    }
    private String monthTosec(double m) {
        double sec = m * 2.628e+6;
        return String.valueOf(sec);
    }
    private String monthTomsec(double m) {
        double msec = m * 2.628e+9;
        return String.valueOf(msec);
    }

    //week
    private String weekTomonth(double w) {
        double month = w /4.345;
        return String.valueOf(month);
    }
    private String weekToweek(double w) {
        double week = w ;
        return String.valueOf(week);
    }
    private String weekToday(double w) {
        double day = w * 7;
        return String.valueOf(day);
    }
    private String weekTohour(double w) {
        double hour = w * 168;
        return String.valueOf(hour);
    }
    private String weekTomin(double w) {
        double min = w * 10080;
        return String.valueOf(min);
    }
    private String weekTosec(double w) {
        double sec = w * 604800;
        return String.valueOf(sec);
    }
    private String weekTomsec(double w) {
        double msec = w * 6.048e+8;
        return String.valueOf(msec);
    }

    //day
    private String dayTomonth(double d) {
        double month = d /30.417;
        return String.valueOf(month);
    }
    private String dayToweek(double d) {
        double week = d /7;
        return String.valueOf(week);
    }
    private String dayToday(double d) {
        double day = d;
        return String.valueOf(day);
    }
    private String dayTohour(double w) {
        double hour = w * 24;
        return String.valueOf(hour);
    }
    private String dayTomin(double w) {
        double min = w * 1440;
        return String.valueOf(min);
    }
    private String dayTosec(double w) {
        double sec = w * 86400;
        return String.valueOf(sec);
    }
    private String dayTomsec(double w) {
        double msec = w * 8.64e+7;
        return String.valueOf(msec);
    }

    //hour
    private String hourTomonth(double d) {
        double month = d /730;
        return String.valueOf(month);
    }
    private String hourToweek(double d) {
        double week = d / 168;
        return String.valueOf(week);
    }
    private String hourToday(double d) {
        double day = d/24;
        return String.valueOf(day);
    }
    private String hourTohour(double w) {
        double hour = w;
        return String.valueOf(hour);
    }
    private String hourTomin(double w) {
        double min = w * 60;
        return String.valueOf(min);
    }
    private String hourTosec(double w) {
        double sec = w * 3600;
        return String.valueOf(sec);
    }
    private String hourTomsec(double w) {
        double msec = w * 3.6e+6;
        return String.valueOf(msec);
    }

    //minute
    private String minTomonth(double d) {
        double month = d /43800;
        return String.valueOf(month);
    }
    private String minToweek(double d) {
        double week = d / 10080;
        return String.valueOf(week);
    }
    private String minToday(double d) {
        double day = d/1440;
        return String.valueOf(day);
    }
    private String minTohour(double w) {
        double hour = w/60;
        return String.valueOf(hour);
    }
    private String minTomin(double w) {
        double min = w;
        return String.valueOf(min);
    }
    private String minTosec(double w) {
        double sec = w * 60;
        return String.valueOf(sec);
    }
    private String minTomsec(double w) {
        double msec = w * 60000;
        return String.valueOf(msec);
    }

    //second
    private String secTomonth(double d) {
        double month = d /2.628e+6;
        return String.valueOf(month);
    }
    private String secToweek(double d) {
        double week = d / 604800;
        return String.valueOf(week);
    }
    private String secToday(double d) {
        double day = d/86400;
        return String.valueOf(day);
    }
    private String secTohour(double w) {
        double hour = w/3600;
        return String.valueOf(hour);
    }
    private String secTomin(double w) {
        double min = w/60;
        return String.valueOf(min);
    }
    private String secTosec(double w) {
        double sec = w;
        return String.valueOf(sec);
    }
    private String secTomsec(double w) {
        double msec = w * 1000;
        return String.valueOf(msec);
    }

    //millisecond
    private String msecTomonth(double d) {
        double month = d /2.628e+9;
        return String.valueOf(month);
    }
    private String msecToweek(double d) {
        double week = d / 6.048e+8;
        return String.valueOf(week);
    }
    private String msecToday(double d) {
        double day = d/8.64e+7;
        return String.valueOf(day);
    }
    private String msecTohour(double w) {
        double hour = w/3.6e+6;
        return String.valueOf(hour);
    }
    private String msecTomin(double w) {
        double min = w/60000;
        return String.valueOf(min);
    }
    private String msecTosec(double w) {
        double sec = w/1000;
        return String.valueOf(sec);
    }
    private String msecTomsec(double w) {
        double msec = w;
        return String.valueOf(msec);
    }
}