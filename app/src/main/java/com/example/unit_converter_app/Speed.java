package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Speed extends AppCompatActivity{
    Button speedbtn;
    EditText from,to;
    String[] speed;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);

        speedbtn = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        speed=getResources().getStringArray(R.array.speed);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        speedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(speed[0])) {
                        if (spinner1.getSelectedItem().toString().equals(speed[0])) {
                            to.setText(milesTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[1])) {
                            to.setText(milesToFoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[2])) {
                            to.setText(milesTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[3])) {
                            to.setText(milestokilometer(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(speed[1])) {
                        if (spinner1.getSelectedItem().toString().equals(speed[0])) {
                            to.setText(footTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[1])) {
                            to.setText(footToFoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[2])) {
                            to.setText(footTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[3])) {
                            to.setText(foottokilometer(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(speed[2])) {
                        if (spinner1.getSelectedItem().toString().equals(speed[0])) {
                            to.setText(meterTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[1])) {
                            to.setText(meterToFoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[2])) {
                            to.setText(meterTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[3])) {
                            to.setText(metertokilometer(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(speed[3])) {
                        if (spinner1.getSelectedItem().toString().equals(speed[0])) {
                            to.setText(kmTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[1])) {
                            to.setText(kmToFoot(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[2])) {
                            to.setText(kmTometer(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(speed[3])) {
                            to.setText(kmtokilometer(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //miles
    private String milesTomiles(double miles) {
        double mile = miles ;
        return String.valueOf(mile);
    }

    private String milesToFoot(double miles) {
        double foot = miles *  1.467;
        return String.valueOf(foot);
    }

    private String milesTometer(double miles) {
        double meter = miles / 2.237;
        return String.valueOf(meter);
    }
    private String milestokilometer(double miles) {
        double km = miles * 1.609;
        return String.valueOf(km);
    }

    //foot

    private String footTomiles(double foot) {
        double mile = foot /1.467 ;
        return String.valueOf(mile);
    }

    private String footToFoot(double foot) {
        double foots = foot;
        return String.valueOf(foots);
    }

    private String footTometer(double foot) {
        double meter = foot / 3.281;
        return String.valueOf(meter);
    }
    private String foottokilometer(double foot) {
        double km = foot * 1.097;
        return String.valueOf(km);
    }


    //meter
    private String meterTomiles(double m) {
        double mile = m *  2.237;
        return String.valueOf(mile);
    }

    private String meterToFoot(double m) {
        double foot = m * 3.281;
        return String.valueOf(foot);
    }

    private String meterTometer(double m) {
        double meter = m ;
        return String.valueOf(meter);
    }
    private String metertokilometer(double m) {
        double km = m * 3.6;
        return String.valueOf(km);
    }

    //kilometer

    private String kmTomiles(double km) {
        double mile = km / 1.609;
        return String.valueOf(mile);
    }

    private String kmToFoot(double km) {
        double foot = km / 1.097;
        return String.valueOf(foot);
    }

    private String kmTometer(double km) {
        double meter = km / 3.6 ;
        return String.valueOf(meter);
    }
    private String kmtokilometer(double km) {
        double km1 = km;
        return String.valueOf(km1);
    }
}