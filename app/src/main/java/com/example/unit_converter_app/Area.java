package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Area extends AppCompatActivity{
    Button areabtn;
    EditText from,to;
    String[] area;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);

        areabtn = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        area=getResources().getStringArray(R.array.area);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        areabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(area[0])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(kiloTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(kiloTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(kiloTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(kiloTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(kiloToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(kiloToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(area[1])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(meterTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(meterTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(meterTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(meterTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(meterToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(meterToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(area[2])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(mileTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(mileTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(mileTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(mileTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(mileToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(mileToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(area[3])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(footTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(footTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(footTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(footTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(footToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(footToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(area[4])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(inchTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(inchTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(inchTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(inchTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(inchToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(inchToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(area[5])) {
                        if (spinner1.getSelectedItem().toString().equals(area[0])) {
                            to.setText(acreTokilo(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[1])) {
                            to.setText(acreTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[2])) {
                            to.setText(acreTomile(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[3])) {
                            to.setText(acreTofoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[4])) {
                            to.setText(acreToinch(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(area[5])) {
                            to.setText(acreToacre(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //squarekilometer
    private String kiloTokilo(double m) {
        double month = m  ;
        return String.valueOf(month);
    }
    private String kiloTometer(double m) {
        double week = m * 1e+6;
        return String.valueOf(week);
    }
    private String kiloTomile(double m) {
        double day = m / 2.59;
        return String.valueOf(day);
    }
    private String kiloTofoot(double m) {
        double min = m * 1.076e+7;
        return String.valueOf(min);
    }
    private String kiloToinch(double m) {
        double sec = m * 1.55e+9;
        return String.valueOf(sec);
    }
    private String kiloToacre(double m) {
        double msec = m * 247;
        return String.valueOf(msec);
    }

    //squaremeter
    private String meterTokilo(double m) {
        double month = m / 1e+6;
        return String.valueOf(month);
    }
    private String meterTometer(double m) {
        double week = m ;
        return String.valueOf(week);
    }
    private String meterTomile(double m) {
        double day = m / 2.59e+6;
        return String.valueOf(day);
    }
    private String meterTofoot(double m) {
        double min = m * 10.764;
        return String.valueOf(min);
    }
    private String meterToinch(double m) {
        double sec = m * 1550;
        return String.valueOf(sec);
    }
    private String meterToacre(double m) {
        double msec = m / 4047;
        return String.valueOf(msec);
    }

    //squaremile
    private String mileTokilo(double m) {
        double month = m *  2.59;
        return String.valueOf(month);
    }
    private String mileTometer(double m) {
        double week = m * 2.59e+6;
        return String.valueOf(week);
    }
    private String mileTomile(double m) {
        double day = m;
        return String.valueOf(day);
    }
    private String mileTofoot(double m) {
        double min = m * 2.788e+7;
        return String.valueOf(min);
    }
    private String mileToinch(double m) {
        double sec = m *  4.014e+9;
        return String.valueOf(sec);
    }
    private String mileToacre(double m) {
        double msec = m * 640;
        return String.valueOf(msec);
    }

    //foot
    private String footTokilo(double m) {
        double month = m / 1.076e+7;
        return String.valueOf(month);
    }
    private String footTometer(double m) {
        double week = m / 10.764;
        return String.valueOf(week);
    }
    private String footTomile(double m) {
        double day = m / 2.788e+7;
        return String.valueOf(day);
    }
    private String footTofoot(double m) {
        double min = m;
        return String.valueOf(min);
    }
    private String footToinch(double m) {
        double sec = m * 144;
        return String.valueOf(sec);
    }
    private String footToacre(double m) {
        double msec = m / 43560;
        return String.valueOf(msec);
    }

    //inch
    private String inchTokilo(double m) {
        double month = m/1.55e+9;
        return String.valueOf(month);
    }
    private String inchTometer(double m) {
        double week = m / 1550;
        return String.valueOf(week);
    }
    private String inchTomile(double m) {
        double day = m / 4.014e+9;
        return String.valueOf(day);
    }
    private String inchTofoot(double m) {
        double min = m / 144;
        return String.valueOf(min);
    }
    private String inchToinch(double m) {
        double sec = m;
        return String.valueOf(sec);
    }
    private String inchToacre(double m) {
        double msec = m / 6.273e+6;
        return String.valueOf(msec);
    }

    //acre
    private String acreTokilo(double m) {
        double month = m  / 247;
        return String.valueOf(month);
    }
    private String acreTometer(double m) {
        double week = m * 4047;
        return String.valueOf(week);
    }
    private String acreTomile(double m) {
        double day = m / 640;
        return String.valueOf(day);
    }
    private String acreTofoot(double m) {
        double min = m * 43560;
        return String.valueOf(min);
    }
    private String acreToinch(double m) {
        double sec = m * 6.273e+6;
        return String.valueOf(sec);
    }
    private String acreToacre(double m) {
        double msec = m;
        return String.valueOf(msec);
    }
}