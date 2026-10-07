package fundamentos.revisao;

public class ExercicioTernarioEstoque {

    public static void main(String[] args) {

        int filtrosNoEstoque = 8;
        int pedidosDeFiltro = 5;

        String statusPedido = filtrosNoEstoque >= pedidosDeFiltro ? "Estoque suficiente" : "Estoque insuficiente";

        System.out.println(statusPedido);
    }
}
