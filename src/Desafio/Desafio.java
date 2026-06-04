package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
    	Scanner leitura = new Scanner(System.in);
    	String nome = "Jorge Mário";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);

        while(true) {
        System.out.println("\n******** MENU ********");
        System.out.println("Digite sua opção:");
        System.out.println("");
        System.out.println("1 - Consultar saldo\n2 - Transferir valor\n3 - Receber valor\n4 - Sair");
        var opçao = leitura.nextInt();
            if (opçao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opçao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opçao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if(opçao==4) {
            	System.out.println("Progama encerrado.");
            	break;
            } else {
                System.out.println("Opção inválida!");
        }
    }
}
}
