package fundamentos.revisao;

public class ExercicioMediaCasting {
    public static void main(String[] args) {

        int mediaDeNotas1 = 7;
        int mediaDeNotas2 = 8;

        int somaDasNotas = mediaDeNotas1 + mediaDeNotas2;

        double mediaTotal = (double) somaDasNotas / 2;

        System.out.println("Media total: " + mediaTotal);
    }
}
