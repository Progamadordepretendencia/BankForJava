package desafio8;

import java.util.Scanner;

abstract class Cofre {
    final String tipo;
    final String metodoAbertura;

    Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    void imprimirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Método de abertura: " + metodoAbertura);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de cofre ");
        String tipoCofre = scanner.nextLine();

        if ("digital".equalsIgnoreCase(tipoCofre)) {
            int senha = 0;
            int confirmacaoSenha = 0;

            try {
              System.out.println("Informe sua senha");
                senha = Integer.parseInt(scanner.nextLine());
                confirmacaoSenha = Integer.parseInt(scanner.nextLine());
                scanner.close();
            } catch (NumberFormatException e) {
                System.out.println("Erro: Senha inválida.");
                return;
            }

            CofreDigital cofre = new CofreDigital(senha);
            cofre.imprimirInformacoes();

            if (cofre.validarSenha(confirmacaoSenha)) {
                System.out.println("Senha validada. Cofre digital aberto.");
            } else {
                System.out.println("Erro: As senhas não correspondem. Cofre digital não pode ser aberto.");
            }
        } else if ("fisico".equalsIgnoreCase(tipoCofre)) {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
            System.out.println("Cofre físico aberto com sucesso.");
        } else {
            System.out.println("Erro: Tipo de cofre inválido.");
        }
        
    }
  }