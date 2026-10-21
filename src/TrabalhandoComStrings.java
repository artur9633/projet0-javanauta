public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Artur";
        String nomeDois = "Eloi";
        int tamanhoDaString = nome.length();
        boolean saoIguais =nome.equals(nomeDois);

        System.out.println("Olá! " + nome + " tamanho de caracteres : " + tamanhoDaString + " caracteres");
        System.out.println("os nomes são iguais? " + saoIguais);
    }
}
