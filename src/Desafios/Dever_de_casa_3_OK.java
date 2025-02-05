package Desafios;

public class Dever_de_casa_3_OK {

    //Vimos como usar comparações para condicionais, integrar leitura do teclado com a classe Scanner,
    //explorar alternativas para condicionais e empregar estruturas de repetição como for e while.
    //Esses conhecimentos constituem a base para o desenvolvimento eficaz de programas em Java.

    //    Para aprimorar essas habilidades, propomos atividades práticas (não obrigatórias). Vamos lá?

    //    1.Crie um programa que solicite ao usuário digitar um número.
    //    Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
//    public static void main(String[] args) {
//        Scanner numeroPositivoOuNegativo = new Scanner(System.in);
//
//        System.out.println("Digite um Número");
//        int numero = numeroPositivoOuNegativo.nextInt();
//
//        if (numero > 0){
//            System.out.println("Número positivo");
//        } else {
//            System.out.println("Número Negativo");
//
//    }

    //    2.Peça ao usuário para inserir dois números inteiros.
    //    Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
//    public static void main(String[] args) {
//        Scanner numerosInteiros = new Scanner(System.in);
//
//        System.out.println("Digite o primeiro número");
//        int numero1 = numerosInteiros.nextInt();
//
//        System.out.println("Digite o segundo número");
//        int numero2 = numerosInteiros.nextInt();
//
//        if (numero1 == numero2 ) {
//            System.out.println("Os números são iguais");
//        }else if (numero1 > numero2) {
//            System.out.println("Número 1 é maior");
//        }else
//            System.out.println("Número 2 é maior");
//        }
//    }

    //    3.Crie um menu que oferece duas opções ao usuário: "1.
    //    Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
//    public static void main(String[] args) {
//        Scanner quadrado = new Scanner(System.in);
//
//        int escolha = 0;
//
//        while (escolha !=3){
//            System.out.println("---------------Menu---------------");
//            System.out.println("1. Calcular área do quadrado");
//            System.out.println("2. Calcular área do circulo");
//            System.out.println("3. Sair");
//            System.out.println("Escolha uma opção");
//            System.out.println("----------------------------------");
//            escolha = quadrado.nextInt();
//
//            if (escolha == 1){
//                System.out.println("Digite o lado do quadrado");
//                double lado = quadrado.nextDouble();
//                double areadoQuadrado = lado * lado;
//                System.out.println("Área do quadrado " + areadoQuadrado);
//
//            } else if (escolha == 2){
//                 System.out.println("Digite o raio do circulo: ");
//                 double raio = quadrado.nextDouble();
//                double areaCiculo = 3.14 * raio * raio;
//                 System.out.println("Área do circulo " + areaCiculo);
//            } else if (escolha == 3){
//                 System.out.println("Programa encerrado");
//            }else{
//
//            System.out.println(("opção invalida. Tente novamente"));
//
//    }
//        }
//    }
//}

    //    4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
//    public static void main(String[] args) {
//        Scanner tabuada = new Scanner(System.in);
//
//        System.out.println("Digite um Número: ");
//        int numero = tabuada.nextInt();
//
//        System.out.println("Tabuada do " + numero + ":");
//        for (int i = 1; i<=10; i++){
//            System.out.println(numero + "x" + i + " = " + (numero*i));
//        }
//
//    }
//
//    }

    //    5.Crie um programa que solicite ao usuário a entrada de um número inteiro.
    //    Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
//    public static void main(String[] args) {
//        Scanner parOuImpar = new Scanner(System.in);
//
//        System.out.println("Digite um número");
//        int numero = parOuImpar.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.println("O número é par");
//        } else {
//            System.out.println("O número é impar");
//        }
//    }
//
//}
    //    6.Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
//    public static void main(String[] args) {
//        Scanner Fatorial = new Scanner(System.in);
//
//        System.out.println("Digite um número");
//        int numero = Fatorial.nextInt();
//
//        int fatorial = 1;
//
//        for (int i = 1; i <= numero; i++) {
//            fatorial *= i;
//
//        }
//        System.out.println("O fatorial de " + numero + " é: " + fatorial);
//    }
}




