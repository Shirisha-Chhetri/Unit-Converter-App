package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Volume extends AppCompatActivity{
    Button volume;
    EditText from,to;
    String[] vol;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);

        volume = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        vol=getResources().getStringArray(R.array.volume);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(vol[0])) {
                        if (spinner1.getSelectedItem().toString().equals(vol[0])) {
                            to.setText(ltol(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(vol[1])) {
                            to.setText(ltoml(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(vol[2])) {
                            to.setText(ltogallon(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(vol[1])) {
                        if (spinner1.getSelectedItem().toString().equals(vol[0])) {
                            to.setText(mltol(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(vol[1])) {
                            to.setText(mltoml(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(vol[2])) {
                            to.setText(mltogallon(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(vol[2])) {
                        if (spinner1.getSelectedItem().toString().equals(vol[0])) {
                            to.setText(gallontol(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(vol[1])) {
                            to.setText(gallontoml(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(vol[2])) {
                            to.setText(gallontogallon(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //litre
    private String ltol(double l) {
        double litre = l;
        return String.valueOf(litre);
    }

    private String ltoml(double l) {
        double ml = l * 1000;
        return String.valueOf(ml);
    }
    private String ltogallon(double l) {
        double gallon = l / 3.785;
        return String.valueOf(gallon);
    }

    //ml
    private String mltol(double ml) {
        double l = ml /1000;
        return String.valueOf(l);
    }

    private String mltoml(double ml) {
        double mili = ml;
        return String.valueOf(mili);
    }

    private String mltogallon(double ml) {
        double gallon = ml / 3785;
        return String.valueOf(gallon);
    }

    //gallon
    private String gallontol(double gallon) {
        double l = gallon * 3.785;
        return String.valueOf(l);
    }

    private String gallontoml(double gallon) {
        double ml = gallon * 3785;
        return String.valueOf(ml);
    }
    private String gallontogallon(double gallon) {
        double g = gallon;
        return String.valueOf(g);
    }
}