public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Artur"; //String serve para nomes.
        String nomeDois = " Eloi ";
        int tamanhoDaString = nome.length(); //com "nome e . você coloca length e sabe a quantidade de caracteres.
        boolean saoIguais =nome.equals(nomeDois); // o boolean compara se é verdadeiro ou falso.
       String nomeCompleto = nome.concat(nomeDois); //concat concatena,junta os nomes.

        System.out.println("Olá! " + nome.toUpperCase() + " tamanho de caracteres : " + tamanhoDaString + " caracteres");
        System.out.println("os nomes são iguais? " + saoIguais);
        System.out.println("Nome Completo " + nomeCompleto);

    }
}
