package com.chicosoftware.calculadoraimc;

import java.util.*;

public class Calculadora {

    public double calcularIMC(double altura, double peso) {
        Locale.setDefault(Locale.US);
        double imc = peso / (altura * altura);
        return Double.parseDouble(String.format("%.1f", imc));
    }

    public String quemTemOMenorIMC(List<Pessoa> pessoas) {
        List<Double> imc = new ArrayList<>();
        /**
         * Carregar a lista IMC com o imc de todos
         * da lista pessoa
         */
        for (int i = 0; i < pessoas.size(); i++) {
            double calculoIMC = calcularIMC(pessoas.get(i).getAltura(), pessoas.get(i).getPeso());
            imc.add(calculoIMC);
        }
        double min = imc.get(0);
        Pessoa p = new Pessoa();
        /**
         * Compara qual o menor valor de imc, e atribui esse valor a variavel min;
         * Atribui o index do valor min do imc ao nome do objeto p
         * */
        for (int i = 1; i < imc.size(); i++) {
            if (imc.get(i) < min) {
                min = imc.get(i);
                p.setNome(pessoas.get(i).getNome());
            }
        }
        return p.getNome();
    }
}
