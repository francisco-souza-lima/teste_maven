package com.chicosoftware.desafios.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArquivoParser {

    /**
     * Este método ira receber o path absoluto de um arquivo de texto
     * (ex: C:\\users\\chico\\meuArquivo.txt) e ira retornar a frase na qual
     * a palavra se encontra.
     * <p>
     * Exemplo:
     * <p>
     * 1 - Se o conteudo do arquivo for:
     * <p>
     * Brilha brilha estrela azul. brilha tanto.
     * Tanto que fica tudo iluminado.
     * <p>
     * 2 - Caso a palavra informada como parametro for "azul" esse método
     * ira retorna uma List de String com o seguinte conteudo:
     * ["Brilha brilha estrela azul"]
     *
     * @param pathAbsolutoDoFile
     * @param palavra
     * @return
     */
    public List<String> obterFrases(String pathAbsolutoDoFile, String palavra) throws IOException {

        List<String> valoresEncontrados = new ArrayList<>();

        Scanner verso = new Scanner(new File("C:\\Users\\Mateus\\poemaTosco.txt"));

        boolean b = true; // variavel para poder sair do loop
        String frase = ""; // variavel onde vai armazenar a 'novaPalavra'

        while (verso.hasNextLine() && b) {
            Scanner plvra = new Scanner(verso.nextLine());
            while (plvra.hasNext()) {
                String novaPalavra = plvra.next().replace(".",""); // elimina o ponto da palavra
                frase = frase + " " + novaPalavra; //  armazena a 'novaPalavra' na frase
                if (novaPalavra.equals("azul")) {
                    b = false;
                    break;
                }
            }
        }

        valoresEncontrados.add(frase.substring(1)); // tira o espaco vazio do primeiro index e adiciona na lista

        return valoresEncontrados;

    }

}
