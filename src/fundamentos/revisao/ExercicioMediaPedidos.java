package fundamentos.revisao;

public class ExercicioMediaPedidos {
    public static void main(String[] args) {

        double filtroDeOleo = 24.50;
        double filtroAC = 18.99;
        double filtroArMotor = 32.02;

        double mediaPorPedidos = (filtroDeOleo + filtroAC + filtroArMotor) / 3;

        System.out.printf("Média por pedido: R$ %.2f%n", mediaPorPedidos);
    }
}
