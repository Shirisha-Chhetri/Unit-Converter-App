package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Frequency extends AppCompatActivity{
    Button frequency;
    EditText from,to;
    String[] fre;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frequency);

        frequency = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        fre=getResources().getStringArray(R.array.frequency);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        frequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                } else {
                    if (spinner.getSelectedItem().toString().equals(fre[0])) {
                        if (spinner1.getSelectedItem().toString().equals(fre[0])) {
                            to.setText(hertzTohertz(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[1])) {
                            to.setText(hertzTokh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[2])) {
                            to.setText(hertzTomh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[3])) {
                            to.setText(hertzTogh(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(fre[1])) {
                        if (spinner1.getSelectedItem().toString().equals(fre[0])) {
                            to.setText(kilohertzToh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[1])) {
                            to.setText(kilohertzTokh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[2])) {
                            to.setText(kilohertzTomh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[3])) {
                            to.setText(kilohertzTogh(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(fre[2])) {
                        if (spinner1.getSelectedItem().toString().equals(fre[0])) {
                            to.setText(megahertzToh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[1])) {
                            to.setText(megahertzTokh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[2])) {
                            to.setText(megahertzTomh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[3])) {
                            to.setText(megahertzTogh(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(fre[3])) {
                        if (spinner1.getSelectedItem().toString().equals(fre[0])) {
                            to.setText(gigahertzToh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[1])) {
                            to.setText(gigahertzTokh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[2])) {
                            to.setText(gigahertzTomh(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fre[3])) {
                            to.setText(gigahertzTogh(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //hertz
    private String hertzTohertz(double h) {
        double hertz = h ;
        return String.valueOf(hertz);
    }
    private String hertzTokh(double h) {
        double kh = h/ 1000;
        return String.valueOf(kh);
    }
    private String hertzTomh(double h) {
        double mh = h / 1e+6;
        return String.valueOf(mh);
    }
    private String hertzTogh(double h) {
        double gh = h / 1e+9;
        return String.valueOf(gh);
    }

    //kilohertz
    private String kilohertzToh(double kh) {
        double h = kh * 1000 ;
        return String.valueOf(h);
    }
    private String kilohertzTokh(double kh) {
        double kilo = kh;
        return String.valueOf(kilo);
    }
    private String kilohertzTomh(double kh) {
        double mh = kh / 1000;
        return String.valueOf(mh);
    }
    private String kilohertzTogh(double kh) {
        double gh = kh / 1e+6;
        return String.valueOf(gh);
    }

    //megahertz
    private String megahertzToh(double mh) {
        double h = mh *  1e+6;
        return String.valueOf(h);
    }
    private String megahertzTokh(double mh) {
        double kh = mh * 1000;
        return String.valueOf(kh);
    }
    private String megahertzTomh(double m) {
        double mh = m ;
        return String.valueOf(mh);
    }
    private String megahertzTogh(double mh) {
        double gh = mh / 1000;
        return String.valueOf(gh);
    }

    //gigahertz
    private String gigahertzToh(double gh) {
        double h = gh * 1e+9;
        return String.valueOf(h);
    }
    private String gigahertzTokh(double gh) {
        double kh = gh * 1e+6;
        return String.valueOf(kh);
    }
    private String gigahertzTomh(double gh) {
        double mh = gh * 1000 ;
        return String.valueOf(mh);
    }
    private String gigahertzTogh(double gh) {
        double giga = gh;
        return String.valueOf(giga);
    }
}