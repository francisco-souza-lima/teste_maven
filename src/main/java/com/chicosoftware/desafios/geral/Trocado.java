package com.chicosoftware.desafios.geral;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
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

        Locale.setDefault(Locale.US);
        Map<String, Integer> troco = new HashMap();
        DecimalFormat df = new DecimalFormat("0.00");

        int valorTrocarInt = (int) valorTrocar;

        if (valorTrocarInt != 0) {
            troco.put(UM_REAL, valorTrocarInt);
        }

        double valorTrocarDouble = valorTrocar - valorTrocarInt;

        int ct = 1;
        while (valorTrocarDouble >= 0.50) {
            valorTrocarDouble = Double.parseDouble(df.format(valorTrocarDouble - 0.50));
            troco.put(CINQUENTA_CENTAVOS, ct++);
        }

        ct = 1;
        while (valorTrocarDouble >= 0.25) {
            valorTrocarDouble = Double.parseDouble(df.format(valorTrocarDouble - 0.25));
            troco.put(VINTE_CINCO_CENTAVOS, ct++);
        }

        ct = 1;
        while (valorTrocarDouble >= 0.10) {
            valorTrocarDouble = Double.parseDouble(df.format(valorTrocarDouble - 0.10));
            troco.put(DEZ_CENTAVOS, ct++);
        }

        ct = 1;
        while (valorTrocarDouble >= 0.05) {
            valorTrocarDouble = Double.parseDouble(df.format(valorTrocarDouble - 0.05));
            troco.put(CINCO_CENTAVOS, ct++);
        }

        ct = 1;
        while (valorTrocarDouble >= 0.01) {
            valorTrocarDouble = Double.parseDouble(df.format(valorTrocarDouble - 0.01));
            troco.put(UM_CENTAVO, ct++);
        }

        return troco;
    }

}
