package fundamentos.revisao;

public class ExercicioTernarioLiberacaoPedido {

    public static void main(String[] args) {

        int pecasEmEstoque = 8;
        int pedidoDePecas = 5;
        boolean pagamentoConfirmado = false;

        String statusPedido = pecasEmEstoque >= pedidoDePecas && pagamentoConfirmado ? "Pedido liberado" : "Pedido pendente";

        System.out.println(statusPedido);
    }
}
