package desafio9;

import java.util.Scanner;

public class Transacoes {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    
    Transacoes(String data, String hora, String descricao, double valor){
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    
    public void exibirInformacoes(String data, String hora, String descricao, double valor){
        System.out.println("---------------------");
        System.out.println("Valor do registro");
        System.out.println("Data: " +data);
        System.out.println("Hora: " +hora);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+ valor);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pora favor forneça os dados para registro no formato: data,hora,descricao,valor ");
        String registro = scanner.next();
        scanner.close();
        
        String[] partes = registro.split(",");

        String data = partes[0];
        String hora = partes[1];
        String descricao = partes[2];
        double valor = Double.parseDouble(partes[3]);

        Transacoes transacoes = new Transacoes(data, hora, descricao, valor);

        transacoes.exibirInformacoes(data, hora, descricao, valor);


        


    }
}
