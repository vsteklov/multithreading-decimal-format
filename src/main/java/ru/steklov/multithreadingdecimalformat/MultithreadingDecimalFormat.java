package ru.steklov.multithreadingdecimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MultithreadingDecimalFormat {

    public static void main(String[] args) {
        BigDecimal number = new BigDecimal("1234");
        DecimalFormat decimalFormat = new DecimalFormat();
        System.out.println(decimalFormat.format(number));
    }
}
