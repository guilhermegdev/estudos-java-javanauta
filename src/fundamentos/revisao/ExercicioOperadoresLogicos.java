package fundamentos.revisao;

public class ExercicioOperadoresLogicos {
    public static void main(String[] args) {

        int filtros = 8;
        int quantidadesSolicitadas = 5;
        boolean pedidoPago = false;

        System.out.println(filtros >= quantidadesSolicitadas && pedidoPago);
        System.out.println(filtros >= quantidadesSolicitadas || pedidoPago);
        System.out.println(!pedidoPago);
    }
}
