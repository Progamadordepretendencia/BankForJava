package desafio1;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          // Solicitar o saldo atual da conta bancária
  System.out.println("Digite o saldo atual da conta bancária: ");
  double saldoAtual = scanner.nextDouble();

  // Solicitar o valor do depósito
  System.out.println("Digite o valor do depósito: ");
  double valorDeposito = scanner.nextDouble();

  // Solicitar o valor da retirada
  System.out.println("Digite o valor da retirada: ");
  double valorRetirada = scanner.nextDouble();

  // Atualizar o saldo com base nas transações
  double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;

  scanner.close();

  // Exibir o saldo atualizado com uma casa decimal
  System.out.printf("%s %.2f\n", "O salto atual é:", saldoAtualizado );
    }
    
}