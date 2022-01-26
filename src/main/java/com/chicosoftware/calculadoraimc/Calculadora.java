package com.chicosoftware.calculadoraimc;

import java.util.Locale;

public class Calculadora {

    public double calcularIMC(double altura, double peso) {
        Locale.setDefault(Locale.US);
        double imc = peso / (altura * altura);
        return Double.parseDouble(String.format("%.1f", imc));
    }

}
