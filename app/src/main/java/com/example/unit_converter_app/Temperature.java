package com.example.unit_converter_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Temperature extends AppCompatActivity {
    Button temp;
    EditText from,to;
    String[] temperature;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);

        temp = findViewById(R.id.convert);
        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        temperature=getResources().getStringArray(R.array.temperature);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempInput = from.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    from.setError("Please enter some value");

                }  else {
                    if (spinner.getSelectedItem().toString().equals(temperature[0])) {
                        if (spinner1.getSelectedItem().toString().equals(temperature[0])) {
                            to.setText(celciusToCelsius(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(temperature[1])) {
                            to.setText(celciusToFarenheit(Double.parseDouble(from.getText().toString())));
                        } else if (spinner1.getSelectedItem().toString().equals(temperature[2])) {
                            to.setText(celciusToKelvin(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(temperature[1])) {
                        if (spinner1.getSelectedItem().toString().equals(temperature[0])) {
                            to.setText(fahrenheitToCelcius(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(temperature[1])) {
                            to.setText(fahrenheitToFahrenheit(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(temperature[2])) {
                            to.setText(fahrenheitToKelvin(Double.parseDouble(from.getText().toString())));
                        }
                    }
                    if (spinner.getSelectedItem().toString().equals(temperature[2])) {
                        if (spinner1.getSelectedItem().toString().equals(temperature[0])) {
                            to.setText(kelvinToCelcius(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(temperature[1])) {
                            to.setText(kelvinToFahrenheit(Double.parseDouble(from.getText().toString())));
                        }
                        else if (spinner1.getSelectedItem().toString().equals(temperature[2])) {
                            to.setText(kelvinToKelvin(Double.parseDouble(from.getText().toString())));
                        }
                    }
                }

            }
        });
    }

    private String celciusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return String.valueOf(kelvin);
    }

    private String celciusToFarenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return String.valueOf(fahrenheit);
    }
    private String celciusToCelsius(double celsius) {
        double cel = celsius;
        return String.valueOf(cel);
    }

    //fahrenheit
    private String fahrenheitToKelvin(double fahrenheit) {
        double kelvin = 273.5 + ((fahrenheit - 32.0) * (5.0 / 9.0));
        return String.valueOf(kelvin);
    }

    private String fahrenheitToCelcius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5 / 9;
        return String.valueOf(celcius);
    }

    private String fahrenheitToFahrenheit(double fahrenheit) {
        double fah = fahrenheit;
        return String.valueOf(fah);
    }

    //Kelvin
    private String kelvinToCelcius(double kelvin) {
        double celcius = kelvin - 273.15;
        return String.valueOf(celcius);
    }

    private String kelvinToFahrenheit(double kelvin) {
        double fahrenheit = (kelvin - 273.15) * 1.8 + 32;
        return String.valueOf(fahrenheit);
    }
    private String kelvinToKelvin(double kelvin) {
        double kel = kelvin;
        return String.valueOf(kel);
    }
}