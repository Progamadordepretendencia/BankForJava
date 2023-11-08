package desafio7;

import java.util.Scanner;

import desafio6.ContaBancaria;

public class ContaPoupança extends ContaBancaria {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void entrada(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Conta:");
        int numeroDaConta = scanner.nextInt();
        setNumeroDaConta(numeroDaConta);

        System.out.println("Digite o Nome do Titular");
        String nomeDoTitular = scanner.next();
        setNomeDoTitular(nomeDoTitular);

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();
        setSaldo(saldo);

        System.out.println("Forneça a taxa de juros");
        double taxaJuros = scanner.nextDouble();
        setTaxaJuros(taxaJuros);

        scanner.close();

    }

    public void exibirDados(ContaPoupança contaPoupança){
        System.out.println("-----------------------");
        System.out.println("Numero da conta: " + contaPoupança.getNumeroDaConta());
        System.out.println("Nome do Titular: " + contaPoupança.getNomeDoTitular());
        System.out.println("Saldo inicial: " + contaPoupança.getSaldo());
        System.out.println("taxa de juros: " + contaPoupança.getTaxaJuros());
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        ContaPoupança contaPoupança = new ContaPoupança();
        contaPoupança.entrada();
        contaPoupança.exibirDados(contaPoupança);
    }



    
}
