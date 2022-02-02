package com.chicosoftware.calculadoraimc;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Trocado {

    public static final String UM_REAL = "1 Real";
    public static final String CINQUENTA_CENTAVOS = "50 Centavos";
    public static final String VINTE_CINCO_CENTAVOS = "25 Centavos";
    public static final String DEZ_CENTAVOS = "10 Centavos";
    public static final String CINCO_CENTAVOS = "5 Centavos";
    public static final String UM_CENTAVO = "1 Centavo";


    /**
     * 1 - desafio troco em moedas
     * <p>
     * a) devolver quantidade de moedas (de cada valor) para o troco.
     * <p>
     * b) utilizar a menor quantidade de moedas possivel no troco
     * <p>
     * c) moedas disponiveis:
     * 1 real, 50 centavos, 25 centavos, 10 centavos, 5 centavos, 1 centavo.
     * <p>
     * <p>
     * exemplo,
     * <p>
     * valor do troco: R$5,45
     * <p>
     * moedas:
     * <p>
     * 5 - 1 Real
     * 1 - 25 centavos
     * 2 - 10 centavos
     */

    public Map<String, Integer> obterTroco(double valorTrocar) {

        //TODO: Implementar contador logica aqui

        Map<String, Integer> troco = new HashMap();

//    troco.put(UM_REAL, 5);
//    troco.put(CINQUENTA_CENTAVOS, 1);
//    troco.put(VINTE_CINCO_CENTAVOS, 1);
//    troco.put(DEZ_CENTAVOS, 2);
//    troco.put(UM_CENTAVO, 2);

//        troco.put(UM_REAL, 0);
//        troco.put(CINQUENTA_CENTAVOS, 0);
//        troco.put(VINTE_CINCO_CENTAVOS, 0);
//        troco.put(DEZ_CENTAVOS, 0);
//        troco.put(CINCO_CENTAVOS, 0);
//        troco.put(UM_CENTAVO, 0);

        int valorTrocarInt = (int) valorTrocar;

        troco.put(UM_REAL, valorTrocarInt);

        double valorTrocarDouble = valorTrocar - valorTrocarInt;

        double ct;
        int i = 0;

        while (valorTrocarDouble != 0) {
            ct = valorTrocarDouble / 0.5;
            if (ct != 0) {
                valorTrocarDouble = valorTrocarDouble % 0.5;
                troco.put(CINQUENTA_CENTAVOS, i++);
            }
        }


//        double i;
//        int contador = 1;
//
//        for (i = valorTrocar; i > qtdMoedas1Real; qtdMoedas1Real++) {
//            valorTrocar -= 1;
//            troco.put(UM_REAL, contador++);
//        }
//        contador = 0;
//
//        for (i = valorTrocar; i > qtdMoedas50Centavos; qtdMoedas50Centavos++) {
//            valorTrocar -= 0.50;
//            troco.put(CINQUENTA_CENTAVOS, contador++);
//        }
////
//        for (double i = valorTrocar; i >= qtdMoedas1Centavo; qtdMoedas1Centavo++) {
//            troco.put(UM_CENTAVO, 1);
//            valorTrocar -= qtdMoedas1Centavo;
//        }
//        if (troco.get(UM_CENTAVO) > 0) {
//            troco.put(UM_CENTAVO, qtdMoedas1Centavo);
//        }


//
//        while (valorTrocar >= qtdMoedas1Real) {
//            troco.put(UM_REAL, 1);
//            valorTrocar -= qtdMoedas1Real;
//        }
//        if (troco.get(UM_REAL) > 0) {
//            troco.put(UM_REAL, qtdMoedas1Centavo);
//        }
//
//        while (valorTrocar >= qtdMoedas50Centavos) {
//            troco.put(CINQUENTA_CENTAVOS, 1);
//            valorTrocar -= qtdMoedas50Centavos;
//        }
//        if (troco.get(CINQUENTA_CENTAVOS) > 0) {
//            troco.put(CINQUENTA_CENTAVOS, qtdMoedas50Centavos);
//        }
//
//        while (valorTrocar >= qtdMoedas25Centavos) {
//            troco.put(VINTE_CINCO_CENTAVOS, 1);
//            valorTrocar -= qtdMoedas25Centavos;
//        }
//        if (troco.get(VINTE_CINCO_CENTAVOS) > 0) {
//            troco.put(VINTE_CINCO_CENTAVOS, qtdMoedas25Centavos);
//        }
//
//        while (valorTrocar >= qtdMoedas10Centavos) {
//            troco.put(DEZ_CENTAVOS, 1);
//            valorTrocar -= qtdMoedas10Centavos;
//        }
//        if (troco.get(DEZ_CENTAVOS) > 0) {
//            troco.put(DEZ_CENTAVOS, qtdMoedas10Centavos);
//        }
//
//        while (valorTrocar >= qtdMoedas5Centavos) {
//            troco.put(CINCO_CENTAVOS, 1);
//            valorTrocar -= qtdMoedas5Centavos;
//        }
//        if (troco.get(CINCO_CENTAVOS) > 0) {
//            troco.put(CINCO_CENTAVOS, qtdMoedas5Centavos);
//        }
//
//        while (valorTrocar >= qtdMoedas1Centavo) {
//            troco.put(UM_CENTAVO, 1);
//            valorTrocar -= qtdMoedas1Centavo;
//        }
//        if (troco.get(UM_CENTAVO) > 0) {
//            troco.put(UM_CENTAVO, qtdMoedas1Centavo);
//        }

        return troco;
    }


}
