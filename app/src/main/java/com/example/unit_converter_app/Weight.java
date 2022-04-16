package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Weight extends AppCompatActivity{
    Button weight;
    EditText from,to;
    String[] mass;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);

        weight = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        mass =getResources().getStringArray(R.array.weight);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                } else {
                    if (spinner.getSelectedItem().toString().equals(mass[0])) {
                        if (spinner1.getSelectedItem().toString().equals(mass[0])) {
                            to.setText(kiloTokilo(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[1])) {
                            to.setText(kiloTogram(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[2])) {
                            to.setText(kiloTomg(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[3])) {
                            to.setText(kiloTopound(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[4])) {
                            to.setText(kiloToounce(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(mass[1])) {
                        if (spinner1.getSelectedItem().toString().equals(mass[0])) {
                            to.setText(gramTokilo(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[1])) {
                            to.setText(gramTogram(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[2])) {
                            to.setText(gramTomili(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[3])) {
                            to.setText(gramTopound(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[4])) {
                            to.setText(gramToounce(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(mass[2])) {
                        if (spinner1.getSelectedItem().toString().equals(mass[0])) {
                            to.setText(milliTokilo(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[1])) {
                            to.setText(milliTogram(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[2])) {
                            to.setText(milliTomilli(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[3])) {
                            to.setText(milliTopound(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[4])) {
                            to.setText(milliToounce(Double.parseDouble(from.getText().toString())));
                        }
                    }

                    if (spinner.getSelectedItem().toString().equals(mass[3])) {
                        if (spinner1.getSelectedItem().toString().equals(mass[0])) {
                            to.setText(poundTokilo(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[1])) {
                            to.setText(poundTogram(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[2])) {
                            to.setText(poundTomilli(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[3])) {
                            to.setText(poundTopound(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[4])) {
                            to.setText(poundToounce(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(mass[4])) {
                        if (spinner1.getSelectedItem().toString().equals(mass[0])) {
                            to.setText(ounceTokilo(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[1])) {
                            to.setText(ounceTogram(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[2])) {
                            to.setText(ounceTomilli(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[3])) {
                            to.setText(ounceTopound(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(mass[4])) {
                            to.setText(ounceToounce(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //kilogram
    private String kiloTokilo(double h) {
        double hertz = h ;
        return String.valueOf(hertz);
    }
    private String kiloTogram(double h) {
        double kh = h * 1000;
        return String.valueOf(kh);
    }
    private String kiloTomg(double h) {
        double mh = h * 1e+6;
        return String.valueOf(mh);
    }
    private String kiloTopound(double h) {
        double gh = h * 2.205;
        return String.valueOf(gh);
    }
    private String kiloToounce(double h) {
        double gh = h * 35.274;
        return String.valueOf(gh);
    }

    //gram
    private String gramTokilo(double kh) {
        double h = kh / 1000 ;
        return String.valueOf(h);
    }
    private String gramTogram(double kh) {
        double kilo = kh;
        return String.valueOf(kilo);
    }
    private String gramTomili(double kh) {
        double mh = kh * 1000;
        return String.valueOf(mh);
    }
    private String gramTopound(double kh) {
        double gh = kh / 454;
        return String.valueOf(gh);
    }
    private String gramToounce(double kh) {
        double gh = kh / 28.35;
        return String.valueOf(gh);
    }

    //milligram
    private String milliTokilo(double mh) {
        double h = mh /  1e+6;
        return String.valueOf(h);
    }
    private String milliTogram(double mh) {
        double kh = mh / 1000;
        return String.valueOf(kh);
    }
    private String milliTomilli(double m) {
        double mh = m ;
        return String.valueOf(mh);
    }
    private String milliTopound(double mh) {
        double gh = mh / 453592;
        return String.valueOf(gh);
    }
    private String milliToounce(double mh) {
        double gh = mh / 28350;
        return String.valueOf(gh);
    }

    //pound
    private String poundTokilo(double gh) {
        double h = gh / 2.205;
        return String.valueOf(h);
    }
    private String poundTogram(double gh) {
        double kh = gh * 454;
        return String.valueOf(kh);
    }
    private String poundTomilli(double gh) {
        double mh = gh * 453592 ;
        return String.valueOf(mh);
    }
    private String poundTopound(double gh) {
        double giga = gh;
        return String.valueOf(giga);
    }
    private String poundToounce(double gh) {
        double giga = gh*16;
        return String.valueOf(giga);
    }

    //ounce
    private String ounceTokilo(double gh) {
        double h = gh / 35.274;
        return String.valueOf(h);
    }
    private String ounceTogram(double gh) {
        double kh = gh * 28.35;
        return String.valueOf(kh);
    }
    private String ounceTomilli(double gh) {
        double mh = gh * 28350 ;
        return String.valueOf(mh);
    }
    private String ounceTopound(double gh) {
        double giga = gh / 16;
        return String.valueOf(giga);
    }
    private String ounceToounce(double gh) {
        double giga = gh;
        return String.valueOf(giga);
    }
}