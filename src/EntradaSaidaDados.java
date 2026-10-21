import java.util.Scanner;

public class EntradaSaidaDados {
    public static void main(String[] args) {
//        //Saídas de dados
//        System.out.println("Eu imprimo e pulo a linha");
//        System.out.print("Eu imprimo na mesma linha ");
//        System.out.printf("Eu faço a impressão formatada"); CTRL + / COMENTA

        Scanner scanner = new Scanner(System.in); //entrada //cria e retorna um objeto (uma instância) da classe Scanner em Java

        System.out.println(" Olá! Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome);

        System.out.println(" Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println(" Sua idade é:" + idade);

        System.out.println("Você está empregado? Sim -true- Não -false-");
        boolean empregado = scanner.nextBoolean();
        System.out.println(" Seu nome: " + nome + " Sua idade: " + idade + " Está trabalhando?:" + empregado);
    }
}