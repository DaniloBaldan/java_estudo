

public class Conversao_de_temperutura_1_OK {
    public static void main(String[] args) {
        double temperaturaCelsius = 24.6;
        double temperaturaFahrenheit = 24.6 * 1.8;

        String mensagem = String.format("A temperatura de %f é equivalente a %f Fahrenheit", temperaturaCelsius,temperaturaFahrenheit);
        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit é:" + temperaturaFahrenheitInteira);

    }

}
