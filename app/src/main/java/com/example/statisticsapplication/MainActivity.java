package com.example.statisticsapplication;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.example.statisticsapplication.za.ac.wsu.s217017142.StatisticsLogic;

public class MainActivity extends AppCompatActivity {

    StatisticsLogic statisticsLogic = new StatisticsLogic();
     ArrayList<Double> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNumber(double number) {
        numbers.add(number);
    }
    public void mean(View v) {
        TextView  t = findViewById(R.id.editTextNumber);
        double number = Double.parseDouble(t.getText().toString());
        addNumber(number);
        double mean = statisticsLogic.calcMean(numbers);
        TextView results = findViewById(R.id.results);

        results.setText("Mean: " + mean);
    }

    public void add(View v) {
        TextView  t = findViewById(R.id.editTextNumber);
        double number = Double.parseDouble(t.getText().toString());
        addNumber(number);
        TextView results = findViewById(R.id.results);

        for(int i = 0; i < numbers.size(); i++) {
            results.setText(results.getText() + " " + numbers.get(i));
        }
    }

    public void variance(View v) {
        TextView t = findViewById(R.id.editTextNumber);
        double number = Double.parseDouble(t.getText().toString());
        addNumber(number);
        double variance = statisticsLogic.calcVariance(numbers);
        TextView results = findViewById(R.id.results);
        results.setText("Variance: " + variance);
    }

    public void deviation(View v) {
        TextView t = findViewById(R.id.editTextNumber);
        double number = Double.parseDouble(t.getText().toString());
        addNumber(number);
        double standardDeviation = statisticsLogic.calcStandardDeviation(numbers);
        TextView results = findViewById(R.id.results);
        results.setText("Standard Deviation: " + standardDeviation);
    }

    public void clear(View v) {
        numbers.clear();
        TextView results = findViewById(R.id.results);
        TextView editTextNumber = findViewById(R.id.editTextNumber);
        results.setText("");
        editTextNumber.setText("");
    }

}