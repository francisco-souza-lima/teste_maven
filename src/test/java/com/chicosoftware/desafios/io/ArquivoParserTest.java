package com.chicosoftware.desafios.io;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ArquivoParserTest {

  @Test
  public void obter_frases_test() {

    ArquivoParser arquivoParser = new ArquivoParser();

    List<String> valoresEncontrados = arquivoParser.obterFrases(
            "C:\\users\\chico\\poemaTosco.txt",
        "azul");


    Assert.assertNotNull(valoresEncontrados);

    Assert.assertEquals(1, valoresEncontrados.size());

    Assert.assertEquals("Brilha brilha estrela azul", valoresEncontrados.get(0));

  }

}
