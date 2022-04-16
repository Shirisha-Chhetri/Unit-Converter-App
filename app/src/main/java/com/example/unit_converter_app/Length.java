package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Length extends AppCompatActivity{
    Button length;
    EditText from,to;
    String[] len;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        length = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        len=getResources().getStringArray(R.array.length);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                } else {
                    if (spinner.getSelectedItem().toString().equals(len[0])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(kiloTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(kiloTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(kiloTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(kiloTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(kiloTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(kiloTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(kiloToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(kiloToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(len[1])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(meterTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(meterTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(meterTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(meterTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(meterTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(meterTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(meterToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(meterToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(len[2])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(centiTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(centiTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(centiTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(centiTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(centiTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(centiTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(centiToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(centiToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(len[3])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(miliTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(miliTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(miliTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(miliTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(miliTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(miliTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(miliToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(miliToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(len[4])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(mileTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(mileTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(mileTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(mileTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(mileTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(mileTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(mileToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(mileToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(len[5])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(footTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(footTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(footTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(footTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(footTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(footTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(footToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(footToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(len[6])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(inchTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(inchTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(inchTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(inchTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(inchTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(inchTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(inchToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(inchToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(len[7])) {
                        if (spinner1.getSelectedItem().toString().equals(len[0])) {
                            to.setText(yardTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[1])) {
                            to.setText(yardTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[2])) {
                            to.setText(yardTocentimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[3])) {
                            to.setText(yardTomillimeter(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[4])) {
                            to.setText(yardTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[5])) {
                            to.setText(yardTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[6])) {
                            to.setText(yardToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(len[7])) {
                            to.setText(yardToyard(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

   //kilometer
   private String kiloTokilo(double m) {
       double month = m  ;
       return String.valueOf(month);
   }
    private String kiloTometer(double m) {
        double month = m * 1000  ;
        return String.valueOf(month);
    }
    private String kiloTocentimeter(double m) {
        double week = m * 100000 ;
        return String.valueOf(week);
    }
    private String kiloTomillimeter(double m) {
        double day = m * 1e+6;
        return String.valueOf(day);
    }
    private String kiloTomile(double m) {
        double hour = m / 1.609;
        return String.valueOf(hour);
    }
    private String kiloTofoot(double m) {
        double min = m * 3281;
        return String.valueOf(min);
    }
    private String kiloToinch(double m) {
        double sec = m * 39370;
        return String.valueOf(sec);
    }
    private String kiloToyard(double m) {
        double msec = m * 1094;
        return String.valueOf(msec);
    }

    //meter
    private String meterTokilo(double m) {
        double month = m / 1000  ;
        return String.valueOf(month);
    }
    private String meterTometer(double m) {
        double month = m  ;
        return String.valueOf(month);
    }
    private String meterTocentimeter(double m) {
        double week = m * 100 ;
        return String.valueOf(week);
    }
    private String meterTomillimeter(double m) {
        double day = m * 1000;
        return String.valueOf(day);
    }
    private String meterTomile(double m) {
        double hour = m / 1609;
        return String.valueOf(hour);
    }
    private String meterTofoot(double m) {
        double min = m * 3.281;
        return String.valueOf(min);
    }
    private String meterToinch(double m) {
        double sec = m * 39.37;
        return String.valueOf(sec);
    }
    private String meterToyard(double m) {
        double msec = m * 1.094;
        return String.valueOf(msec);
    }

    //centimeter
    private String centiTokilo(double m) {
        double month = m / 100000;
        return String.valueOf(month);
    }
    private String centiTometer(double m) {
        double month = m / 100 ;
        return String.valueOf(month);
    }
    private String centiTocentimeter(double m) {
        double week = m ;
        return String.valueOf(week);
    }
    private String centiTomillimeter(double m) {
        double day = m * 10;
        return String.valueOf(day);
    }
    private String centiTomile(double m) {
        double hour = m / 160934;
        return String.valueOf(hour);
    }
    private String centiTofoot(double m) {
        double min = m / 30.48;
        return String.valueOf(min);
    }
    private String centiToinch(double m) {
        double sec = m / 2.54;
        return String.valueOf(sec);
    }
    private String centiToyard(double m) {
        double msec = m / 91.44;
        return String.valueOf(msec);
    }

    //millimeter
    private String miliTokilo(double m) {
        double month = m /1e+6;
        return String.valueOf(month);
    }
    private String miliTometer(double m) {
        double month = m /1000  ;
        return String.valueOf(month);
    }
    private String miliTocentimeter(double m) {
        double week = m / 10 ;
        return String.valueOf(week);
    }
    private String miliTomillimeter(double m) {
        double day = m;
        return String.valueOf(day);
    }
    private String miliTomile(double m) {
        double hour = m / 1.609e+6;
        return String.valueOf(hour);
    }
    private String miliTofoot(double m) {
        double min = m / 305;
        return String.valueOf(min);
    }
    private String miliToinch(double m) {
        double sec = m / 25.4;
        return String.valueOf(sec);
    }
    private String miliToyard(double m) {
        double msec = m / 914;
        return String.valueOf(msec);
    }

    //kilometer
    private String mileTokilo(double m) {
        double month = m * 1.609 ;
        return String.valueOf(month);
    }
    private String mileTometer(double m) {
        double month = m  * 1609;
        return String.valueOf(month);
    }
    private String mileTocentimeter(double m) {
        double week = m * 160934 ;
        return String.valueOf(week);
    }
    private String mileTomillimeter(double m) {
        double day = m * 1.609e+6;
        return String.valueOf(day);
    }
    private String mileTomile(double m) {
        double hour = m;
        return String.valueOf(hour);
    }
    private String mileTofoot(double m) {
        double min = m * 5280;
        return String.valueOf(min);
    }
    private String mileToinch(double m) {
        double sec = m * 63360;
        return String.valueOf(sec);
    }
    private String mileToyard(double m) {
        double msec = m * 1760;
        return String.valueOf(msec);
    }

    //foot
    private String footTokilo(double m) {
        double month = m / 3281 ;
        return String.valueOf(month);
    }
    private String footTometer(double m) {
        double month = m  /3.281;
        return String.valueOf(month);
    }
    private String footTocentimeter(double m) {
        double week = m * 30.48 ;
        return String.valueOf(week);
    }
    private String footTomillimeter(double m) {
        double day = m * 305;
        return String.valueOf(day);
    }
    private String footTomile(double m) {
        double hour = m / 5280;
        return String.valueOf(hour);
    }
    private String footTofoot(double m) {
        double min = m;
        return String.valueOf(min);
    }
    private String footToinch(double m) {
        double sec = m * 12;
        return String.valueOf(sec);
    }
    private String footToyard(double m) {
        double msec = m /3;
        return String.valueOf(msec);
    }

    //inch
    private String inchTokilo(double m) {
        double month = m / 39370 ;
        return String.valueOf(month);
    }
    private String inchTometer(double m) {
        double month = m /39.37 ;
        return String.valueOf(month);
    }
    private String inchTocentimeter(double m) {
        double week = m * 2.54 ;
        return String.valueOf(week);
    }
    private String inchTomillimeter(double m) {
        double day = m * 25.4;
        return String.valueOf(day);
    }
    private String inchTomile(double m) {
        double hour = m / 63360;
        return String.valueOf(hour);
    }
    private String inchTofoot(double m) {
        double min = m / 12;
        return String.valueOf(min);
    }
    private String inchToinch(double m) {
        double sec = m ;
        return String.valueOf(sec);
    }
    private String inchToyard(double m) {
        double msec = m / 36;
        return String.valueOf(msec);
    }

    //acre
    private String yardTokilo(double m) {
        double month = m / 1094 ;
        return String.valueOf(month);
    }
    private String yardTometer(double m) {
        double month = m / 1.094;
        return String.valueOf(month);
    }
    private String yardTocentimeter(double m) {
        double week = m * 91.44 ;
        return String.valueOf(week);
    }
    private String yardTomillimeter(double m) {
        double day = m * 914;
        return String.valueOf(day);
    }
    private String yardTomile(double m) {
        double hour = m / 1760;
        return String.valueOf(hour);
    }
    private String yardTofoot(double m) {
        double min = m * 3;
        return String.valueOf(min);
    }
    private String yardToinch(double m) {
        double sec = m * 36;
        return String.valueOf(sec);
    }
    private String yardToyard(double m) {
        double msec = m;
        return String.valueOf(msec);
    }
}