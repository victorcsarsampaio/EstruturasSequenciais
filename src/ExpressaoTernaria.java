public class ExpressaoTernaria {
    public static void main(String[] args) {

        boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Come o que tem em casa";

        if (temDinheiro) {
            System.out.println("Pede um ifood");
        }
        else {
            System.out.println("Come o que tem em casa");
        }
    }
}
