package com.loiane.estruturadados.teste;

import com.loiane.estruturadados.Vetor;

import java.util.Arrays;

public class Aula03 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("Curso");
        vetor.adiciona("Estrutura de Dados");


        int i = 0;


        if (vetor.getElementos() != null) {

            System.out.println("Vetor foi preenchido: " + Arrays.toString(vetor.getElementos()));
        } else {
            System.out.println("Erro! O vetor não pode ser preenchido");
        }







    }
}
