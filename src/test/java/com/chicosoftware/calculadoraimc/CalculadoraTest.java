package com.chicosoftware.calculadoraimc;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    static final double TOLERANCE = 0.001;

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
}
