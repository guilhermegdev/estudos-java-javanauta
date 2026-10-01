package fundamentos.revisao;

public class ExercicioIfElseEstoque {

    public static void main(String[] args) {

        int filtros = 4;
        int quantidadeMinima = 5;

        if (filtros < quantidadeMinima) {
            System.out.println("Repor estoque");
        } else {
            System.out.println("Estoque suficiente");
        }
    }
}
