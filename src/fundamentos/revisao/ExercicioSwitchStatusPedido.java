package fundamentos.revisao;

public class ExercicioSwitchStatusPedido {
    public static void main(String[] args) {

        String statusPedido = "PAGO";

        switch (statusPedido){
            case "NOVO":
                System.out.println("Pedido recebido");
                break;

            case "PAGO":
                System.out.println("Separar as peças");
                break;

            case "ENVIADO":
                System.out.println("Pedido a caminho");
                break;

            default: System.out.println("Status inválido");
        }
    }
}
