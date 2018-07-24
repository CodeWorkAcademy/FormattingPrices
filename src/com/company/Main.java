package com.company;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double myNumber =2.6;
        double decimalNumber=24.95;
       String myString = NumberFormat.getInstance().format(myNumber);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println(nf.format(decimalNumber));

        double myDouble = 3.5;
        String formattedData = String.format("%.02f",myDouble);

        System.out.println(formattedData);
    }
}
