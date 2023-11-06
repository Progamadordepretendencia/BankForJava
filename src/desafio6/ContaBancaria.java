package desafio6;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

  private int numeroDaConta;
  private String nomeDoTitular;
  private double saldo;

public int getNumeroDaConta() {
    return numeroDaConta;
}
public void setNumeroDaConta(int numeroDaConta) {
    this.numeroDaConta = numeroDaConta;
}
public String getNomeDoTitular() {
    return nomeDoTitular;
}
public void setNomeDoTitular(String nomeDoTitular) {
    this.nomeDoTitular = nomeDoTitular;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

static void entrada(ContaBancaria conta){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    

    System.out.println("Digite o numero da conta");
        int numeroDaConta = scanner.nextInt();
        conta.setNumeroDaConta(numeroDaConta);

    System.out.println("Digite o nome do titular");
        String titular = scanner.next();
        conta.setNomeDoTitular(titular);

    System.out.println("Forneça o saldo inicial em R$");
        double saldoInicial = scanner.nextDouble();
        conta.setSaldo(saldoInicial);
    scanner.close();

        System.out.printf("%s\n %d\n %s\n %.2f\n",
         "Informações da conta:",
         numeroDaConta,
         titular, 
         saldoInicial);
}

public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();
    entrada(conta);
}

}