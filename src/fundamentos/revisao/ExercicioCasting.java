package fundamentos.revisao;

public class ExercicioCasting {
    public static void main(String[] args) {

        double canetaAzul = 12.75;
        double canetaPreta = 12.75;
        double canetaVermelha = 12.75;

        double valorTotal = canetaAzul + canetaPreta + canetaVermelha;

        int valorTotalConvertido = (int) valorTotal;

        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Valor total convertido: R$ " + valorTotalConvertido);
    }
}
