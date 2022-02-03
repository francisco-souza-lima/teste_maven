package com.chicosoftware.calculadoraimc;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TrocadoTest {


    @Test
    public void trocato_scenario_1_test() {

        Trocado t = new Trocado();

        // Trocado para 5 reais e 50 centavos.
        Map<String, Integer> trocado = t.obterTroco(5.50D);

        Assert.assertNotNull(trocado);
        Assert.assertFalse(trocado.isEmpty());

        Integer qtdMoedas1Real = trocado.get(Trocado.UM_REAL);
        Integer qtdMoedas50Centavos = trocado.get(Trocado.CINQUENTA_CENTAVOS);

        Assert.assertEquals(5, qtdMoedas1Real.intValue());

        Assert.assertEquals(1, qtdMoedas50Centavos.intValue());
    }

    @Test
    public void trocato_scenario_2_test() {

        Trocado t = new Trocado();

        // Trocado para 47 centavos.
        Map<String, Integer> trocado = t.obterTroco(0.47D);

        Assert.assertFalse(trocado == null);
        Assert.assertFalse(trocado.isEmpty());

        Integer qtdMoedas25Centavos = trocado.get(Trocado.VINTE_CINCO_CENTAVOS);
        Integer qtdMoedas10Centavos = trocado.get(Trocado.DEZ_CENTAVOS);
        Integer qtdMoedas1Centavo = trocado.get(Trocado.UM_CENTAVO);

        Assert.assertEquals(1, qtdMoedas25Centavos.intValue());

        Assert.assertEquals(2, qtdMoedas10Centavos.intValue());

        Assert.assertEquals(2, qtdMoedas1Centavo.intValue());

    }

    @Test
    public void trocato_scenario_3_test() {

        Trocado t = new Trocado();

        // Trocado para 77 reais e 79 centavos.
        Map<String, Integer> trocado = t.obterTroco(77.79);

        Assert.assertFalse(trocado == null);
        Assert.assertFalse(trocado.isEmpty());

        Integer qtdMoedas1Real = trocado.get(Trocado.UM_REAL);
        Integer qtdMoedas50Centavos = trocado.get(Trocado.CINQUENTA_CENTAVOS);
        Integer qtdMoedas25Centavos = trocado.get(Trocado.VINTE_CINCO_CENTAVOS);
//        Integer qtdMoedas5Centavos = trocado.get(Trocado.CINCO_CENTAVOS);
//        Integer qtdMoedas10Centavos = trocado.get(Trocado.DEZ_CENTAVOS);
        Integer qtdMoedas1Centavo = trocado.get(Trocado.UM_CENTAVO);

        Assert.assertEquals(77, qtdMoedas1Real.intValue());

        Assert.assertEquals(1, qtdMoedas50Centavos.intValue());

        Assert.assertEquals(1, qtdMoedas25Centavos.intValue());

//    Assert.assertEquals(1, qtdMoedas10Centavos.intValue());

//    Assert.assertEquals(1, qtdMoedas5Centavos.intValue());

        Assert.assertEquals(4, qtdMoedas1Centavo.intValue());

    }

}
