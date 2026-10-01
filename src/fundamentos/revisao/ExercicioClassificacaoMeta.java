package fundamentos.revisao;

public class ExercicioClassificacaoMeta {

    public static void main(String[] args) {

        int vendasDePecas = 12;

        if (vendasDePecas >= 15) {
            System.out.println("Meta superada");
        } else if (vendasDePecas >= 10) {
            System.out.println("Meta atingida");
        } else {
            System.out.println("Meta não atingida");
        }
    }
}
