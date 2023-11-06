package desafio4;

import java.util.Locale;
import java.util.Scanner;

public class Desafio4_1 {
      static double valorFinal(double valor_inicial, double taxa_juros, int periodo ){
       double valorFinal = valor_inicial;
       for (int i = 0; i < periodo; i++) {
            valorFinal *= (1 + taxa_juros);
       }
       return valorFinal;
  }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Digite o valor inicial: ");
        double valor_inicial = scanner.nextDouble();
        double taxa_juros = 0.05;

       System.out.println("Digite o periodo em anos do seu investimento: ");
        int periodo = scanner.nextInt(); 
        scanner.close();

        double valorFinal = valorFinal(valor_inicial, taxa_juros, periodo);
      
      System.out.printf("%s %.2f\n", "O valor final do investimento foi: ", valorFinal );

    }
}
