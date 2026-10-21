public class OperadoresAritmeticos {
    public static void main(String[] args) {

        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;
        double valorDivido = 2;

        double valorTotal = pao + queijo + acucar; //exemplo de adição

        double descontos = valorTotal - desconto;  //exemplo de subtração

        double totalDiasMes = totalDiasDoMes * descontos; //exemplo de multiplicação

        double valorTotalDividido =  totalDiasMes / valorDivido; //exemplo de divisão

        System.out.println("Valor Total : R$ " + 18.5);
        System.out.println("Desconto de: R$ " + desconto);
        System.out.println("Valor com Desconto : R$ " + descontos);
        System.out.println("Valor Total por Mes : R$  " + totalDiasMes);
        System.out.println("Valor em casal: R$" + valorTotalDividido);

    }
}
