public class TESTES {
    public static void main(String[] args) { // Corrigido para "main"
        String senha = "12345";
        if (senha.equals("1234")) { // Corrigido: a senha válida é "1234"
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");

            String saudacao = "Ola meu nome é ";
            String nome = "Alice ";
            String continuacao = "e minha idade é ";
            int idade = 17;
            System.out.println(saudacao + nome + continuacao + idade);
        }
    }
}

