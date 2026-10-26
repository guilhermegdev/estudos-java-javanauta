public class ExercicioWhileEstoque {
    public static void main(String[] args) {
        int estoque = 10;
        int unidadesPorVenda = 2;

        while (estoque >= unidadesPorVenda) {
            estoque -= unidadesPorVenda;
            System.out.println("Estoque: " + estoque);
        }
    }
}