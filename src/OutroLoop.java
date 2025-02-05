//A classe Scanner é usada para capturar entradas do teclado.
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args){

    //Cria um objeto Scanner chamado leitura, que será usado para capturar a entrada de dados do usuário (as notas, neste caso).
    Scanner leitura = new Scanner (System.in);
    //mediaAvalicao: Inicializada como 0, acumulará as notas fornecidas pelos usuários para calcular a média.
    double mediaAvalicao = 0;
    //nota: Armazena temporariamente cada nota digitada pelo usuário.
    double nota = 0;
    int totalDeNotas = 0;

    //O laço while continua enquanto o usuário não inserir -1.
        while (nota != -1) {
        System.out.println("Diga a sua avalição para o filme ou -1 para encerrar ");
        //leitura.nextDouble() captura o número decimal inserido pelo usuário e armazena na variável nota.
        nota = leitura.nextDouble();

        //O if verifica se o valor de nota é diferente de -1.
        if (nota != -1){
            //Adiciona o valor de nota à variável mediaAvalicao, que acumula a soma de todas as notas válidas.
            mediaAvalicao += nota;
            //Incrementa o número total de notas válidas em 1.
            totalDeNotas++;

        }
        }
        System.out.println("Média de avaliação " + mediaAvalicao / totalDeNotas);

    }
}
