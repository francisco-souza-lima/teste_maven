package com.chicosoftware.calculadoraimc;

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
   *
   * a) devolver quantidade de moedas (de cada valor) para o troco.
   *
   * b) utilizar a menor quantidade de moedas possivel no troco
   *
   * c) moedas disponiveis:
   * 1 real, 50 centavos, 25 centavos, 10 centavos, 5 centavos, 1 centavo.
   *
   *
   * exemplo,
   *
   * valor do troco: R$5,45
   *
   * moedas:
   *
   * 5 - 1 Real
   * 1 - 25 centavos
   * 2 - 10 centavos
   */

  public Map<String, Integer> obterTroco (double valorTrocar) {

    //TODO: Implementar a logica aqui

    Map<String, Integer> troco = new HashMap();

    troco.put(UM_REAL, 5);
    troco.put(CINQUENTA_CENTAVOS, 1);

    return troco;
  }


}
