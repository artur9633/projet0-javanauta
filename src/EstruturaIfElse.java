public class EstruturaIfElse {
    public static void main(String[] args) {

//        int idade = 34;
//
//
//        if (idade >= 18) {
//
//            System.out.println("Você é maior de idade");
//        } else {
//            System.out.println("Você é menor de idade");
//
//        }
//}
// }


//        boolean estaChovendo = true;
//
//        if (!estaChovendo) {
//            System.out.println("vamos a praia");
//        } else {
//            System.out.println("vamos ficar em casa lendo livro ou vendo dorama");
//
//        }
//    }
//}


        boolean temDinheiro = true;
        boolean temCartao = false;

        if (temDinheiro && temCartao) {

            System.out.println("Pedir Ifood ou Zé Delivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pedir Ifood");
        } else {
            System.out.println("Sem condições de pedir algo");
        }
    }
}