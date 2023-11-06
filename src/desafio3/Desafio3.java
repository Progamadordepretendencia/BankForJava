package desafio3;

import java.util.Scanner;


public class Desafio3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   System.out.println("Digite o valor total do Saldo");
      int saldoTotal = scanner.nextInt();
      System.out.println("Digite o valor do saque: ");
      int saque = scanner.nextInt();
      
      if (saldoTotal > saque) {
        saldoTotal = saldoTotal - saque;
        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal );
      }else{
        System.out.println("Saldo insuficiente. Saque não realizado!");
      }
    scanner.close();
}
}