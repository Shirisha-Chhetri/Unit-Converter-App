package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Fuel extends AppCompatActivity {
    Button fuelbtn;
    EditText from,to;
    String[] fuel;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel);

        fuelbtn = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        fuel=getResources().getStringArray(R.array.fuel);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        fuelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(fuel[0])) {
                        if (spinner1.getSelectedItem().toString().equals(fuel[0])) {
                            to.setText(kmTokm(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[1])) {
                            to.setText(kmTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[2])) {
                            to.setText(kmToli(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(fuel[1])) {
                        if (spinner1.getSelectedItem().toString().equals(fuel[0])) {
                            to.setText(milesTokm(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[1])) {
                            to.setText(milesTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[2])) {
                            to.setText(mileToli(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(fuel[2])) {
                        if (spinner1.getSelectedItem().toString().equals(fuel[0])) {
                            to.setText(litreTokm(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[1])) {
                            to.setText(litreTomiles(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(fuel[2])) {
                            to.setText(litreTolitre(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }
            }
        });
    }

    //miles
    private String kmTokm(double km) {
        double litre = km ;
        return String.valueOf(litre);
    }
    private String kmTomiles(double km) {
        double mile = km * 2.352;
        return String.valueOf(mile);
    }

    private String kmToli(double km) {
        double li = km *  100;
        return String.valueOf(li);
    }

    //mile

    private String milesTokm(double mile) {
        double km = mile /2.352 ;
        return String.valueOf(km);
    }

    private String milesTomiles(double mile) {
        double miles = mile;
        return String.valueOf(miles);
    }

    private String mileToli(double mile) {
        double litre = mile * 235.215;
        return String.valueOf(litre);
    }

    //litre

    private String litreTokm(double l) {
        double km = l *  100;
        return String.valueOf(km);
    }

    private String litreTomiles(double l) {
        double mile = l * 235.215;
        return String.valueOf(mile);
    }

    private String litreTolitre(double litre) {
        double l = litre ;
        return String.valueOf(l);
    }
}