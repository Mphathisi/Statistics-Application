package com.example.statisticsapplication.za.ac.wsu.s217017142;

import java.util.ArrayList;

public class StatisticsLogic {

   public double calcMean(ArrayList<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public double calcVariance(ArrayList<Double> numbers) {
        double mean = calcMean(numbers);
        double sum = 0;
        for (double number : numbers) {
            sum += Math.pow(number - mean, 2);
        }
        return sum / numbers.size();
    }

    public double calcStandardDeviation(ArrayList<Double> numbers) {
        return Math.sqrt(calcVariance(numbers));
    }

}
