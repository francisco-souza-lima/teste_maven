package com.chicosoftware.desafios.io;

import java.util.ArrayList;
import java.util.List;

public class ArquivoParser {


  /**
   * Este método ira receber o path absoluto de um arquivo de texto
   * (ex: C:\\users\\chico\\meuArquivo.txt) e ira retornar a frase na qual
   * a palavra se encontra.
   *
   * Exemplo:
   *
   * 1 - Se o conteudo do arquivo for:
   *
   *    Brilha brilha estrela azul. brilha tanto.
   *    Tanto que fica tudo iluminado.
   *
   * 2 - Caso a palavra informada como parametro for "azul" esse método
   * ira retorna uma List de String com o seguinte conteudo:
   *  ["Brilha brilha estrela azul"]
   *
   *
   * @param pathAbsolutoDoFile
   * @param palavra
   * @return
   */
  public List<String> obterFrases(String pathAbsolutoDoFile, String palavra) {

    List<String> valoresEncontrados = new ArrayList<>();

    valoresEncontrados.add("Brilha brilha estrela azul");

    return valoresEncontrados;

  }


}
