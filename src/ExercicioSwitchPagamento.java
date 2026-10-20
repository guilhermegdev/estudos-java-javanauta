public class ExercicioSwitchPagamento {

    public static void main(String[] args) {

        int formasDePagamento = 3;

        switch (formasDePagamento){
            case 1:
                System.out.println("Pix");
                break;

            case 2:
                System.out.println("Cartão");
                break;

            case 3:
                System.out.println("Dinheiro");
                break;

            default: System.out.println("Forma de pagamento inválida");
        }
    }
}
