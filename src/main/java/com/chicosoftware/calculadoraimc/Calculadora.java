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
        /**;
         * Carregar a lista IMC com o imc de todos
         * da lista pessoa
         */
        Pessoa p = new Pessoa();
        for (Pessoa pessoa : pessoas) {
            double calculoIMC = calcularIMC(pessoa.getAltura(), pessoa.getPeso());
            imc.add(calculoIMC);
        }
        p.setNome(pessoas.get(imc.indexOf(Collections.min(imc))).getNome());
        return p.getNome();
    }
}
