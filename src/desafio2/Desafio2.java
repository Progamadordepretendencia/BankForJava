package desafio2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Desafio2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      // Informando a quantidade de Ativos
      System.out.println("Digite a quantidade de ativos");
       int quantidadeDeAtivos = scanner.nextInt();
       List<String> ativos = new ArrayList<>();
      //Atribuindo os ativos dentro da Lista 
       for (int i = 0; i < quantidadeDeAtivos; i++) {
        System.out.println("Digite o tipo do ativo" + (i +1) + ": ");
        String tipoAtivo = scanner.next();
        ativos.add(tipoAtivo);
       }
       //Ordendando em ordem Alfabética
       Collections.sort(ativos);

       System.out.println("Ativos organizados em ordem alfabética: ");

       for (String ativo : ativos) {
        System.out.println(ativo);
       }

    scanner.close();
    }
    
}