
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean inlcluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipodoplano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else{
            System.out.println("Filme retrô que vale a pena assistir");
        }
        // o == serve para comparar, || serve como "ou", $$ serve como "e"
        if (inlcluidoNoPlano == true || tipodoplano.equals("plus")) {
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");

        }
    }
}
