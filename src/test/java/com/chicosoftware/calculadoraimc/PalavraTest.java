package com.chicosoftware.calculadoraimc;

import org.junit.Assert;
import org.junit.Test;

public class PalavraTest {

    @Test
    public void reversal_test() {
        Palavra p = new Palavra();
        String result = p.reversal("show");
        Assert.assertEquals("wohs", result);
    }

}
