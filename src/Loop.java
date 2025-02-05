

//Esta linha importa a classe Scanner, que permite a entrada de dados pelo teclado.
import java.util.Scanner;

//A classe se chama Loop e contem o metodo main, que é o ponto de entrada do programa.
public class Loop {
    public static void main(String[] args) {
        //Cria um objeto Scanner chamado leitura, que será usado para capturar a entrada de dados do usuário (as notas, neste caso).
        Scanner leitura = new Scanner (System.in);
        //mediaAvalicao: Inicializada como 0, acumulará as notas fornecidas pelos usuários para calcular a média.
        double mediaAvalicao = 0;
        //nota: Armazena temporariamente cada nota digitada pelo usuário.
        double nota = 0;

        //O laço for é usado para repetir a mesma operação 3 vezes.
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diga a sua avalição para o filme ");
            nota = leitura.nextDouble();
            mediaAvalicao += nota;

        }
        System.out.println("Média de avaliação " + mediaAvalicao/3);
    }
}
