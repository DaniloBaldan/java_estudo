package Desafios;

import java.util.Scanner;

//Criação de classe e metodo, Declaração de Variavéis e Concatenação com String.
public class Dever_de_casa_4 {
    public static void main(String[] args) {
        String nome = "Danilo Baldan";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("*********************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*********************************************");

//Menu de opções
        String menu = """
                
                **Digite sua opção**
                
                1- Consultar saldo
                2- Transferir valor
                3- Receber 
                4- Sair
                
                """;

        Scanner leitura =new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            }else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a tranferencia");
                }else{
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            }else if (opcao ==3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);

            }else if (opcao != 4){
                System.out.println("Não existe essa opção");
            }
        }

        // ola meu nome é danilo






        }

    }

