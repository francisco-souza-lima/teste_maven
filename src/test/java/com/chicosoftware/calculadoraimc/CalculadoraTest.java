package com.chicosoftware.calculadoraimc;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTest {

    static final double TOLERANCE = 0.001;
    private Object Pessoa;

    @Test
    public void calcular_imc_teste() {
        Calculadora c = new Calculadora();
        double altura = 1.69;
        double peso = 75;
        double imc = c.calcularIMC(altura,peso);
        Assert.assertEquals(26.3,imc,TOLERANCE);
    }

    @Test
    public void calcular_imc_teste_2() {
        Calculadora c = new Calculadora();
        double altura = 1.70;
        double peso = 79;
        double imc = c.calcularIMC(altura,peso);
        Assert.assertEquals(27.3,imc,TOLERANCE);
    }

    @Test
    public void calcular_qual_mais_saudavel() {
        Calculadora c = new Calculadora();
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa p0 = new Pessoa("Fino", 10, 1);
        Pessoa p1 = new Pessoa("Zeca", 1.90, 45);
        Pessoa p2 = new Pessoa("Francisco", 1.70, 66);
        Pessoa p3 = new Pessoa("Maicon", 2.00, 88);
        Pessoa p4 = new Pessoa("Jefferson", 1.60, 77);
        pessoas.add(p0);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        String pessoaMaisSaudavel = c.quemTemOMenorIMC(pessoas);
        Assert.assertEquals("Fino",pessoaMaisSaudavel);
    }
}
