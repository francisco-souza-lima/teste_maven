package com.chicosoftware.calculadoraimc;

import java.sql.ClientInfoStatus;
import java.util.*;

public class Calculadora {

    public double calcularIMC(double altura, double peso) {
        //Calcular o IMC

        Locale.setDefault(Locale.US);
        double imc = peso / (altura * altura);
        return Double.parseDouble(String.format("%.1f", imc));
    }


    public String qualMaisSaudavel(List<Pessoa> pessoas) {

        //TODO: implementar logica
        Pessoa p1 = new Pessoa("Zeca", 1.90, 45);
        Pessoa p2 = new Pessoa("Francisco", 1.70, 66);
        Pessoa p3 = new Pessoa("Maicon", 2.00, 88);
        Pessoa p4 = new Pessoa("Jefferson", 1.60, 77);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);

        List<Double> imc = new ArrayList<>();

        for (int i = 0; i < pessoas.size(); i++) {
            double calculoIMC = pessoas.get(i).getPeso() / (pessoas.get(i).getAltura() * pessoas.get(i).getAltura());
            imc.add(calculoIMC);
        }

        double min = imc.get(0);

        for (int i = 1; i < imc.size(); i++) {
            if (imc.get(i) < min) {
                min = imc.get(i);
            }
        }

        int indxMenorValor = imc.indexOf(min);

        return pessoas.get(indxMenorValor).getNome();
    }

}
