package desafio5;

import java.util.Locale;
import java.util.Scanner;

public class Desafio5 {

  

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      double saldo = 0.0;

      System.out.println("Digite o valor do depósito");
      double deposito = scanner.nextDouble();
     
      while (true) {
        if (deposito == 0) {
          System.out.println("Encerrando Porgrama!");
          break;
        }else if (deposito > 0) {
          saldo += deposito;
          System.out.println("Saldo atualizado com sucesso! novo saldo é: R$" + saldo );
          break;
        }else{
          System.out.println("Valor de depósito inválido, digite um valor maior do que 0");
          deposito = scanner.nextDouble();
        }
      }
      scanner.close();

    }

}