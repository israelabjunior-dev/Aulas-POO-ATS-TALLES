package AT3;

public class Produto {
        Produto contabilidadeInformatica;
        contabilidadeInformatica = new Informatica();

        String nome;
        double preco;
        double desconto;
        double acrescimos;

        contabilidadeInformatica.nome = "Notebook";
        contabilidadeInformatica.preco = 860;
        contabilidadeInformatica.desconto = - 5%;
        contabilidadeInformatica.acrescimos = + 5%;


        void nome() {
            System.out.println("O nome do produto é " + nome);
        }

        void preco() {
            System.out.println("O preço do produto é " + preco);
        }

        void desconto() {
            preco = preco - 5%;
        }

        void acrescimos() {
            preco = preco - 5%;
        }

    public static void main(String[] args) {

        contabilidadeInformatica.informarNome();
        contabilidadeInformatica.informarPreco();
        contabilidadeInformatica.fazerPromocao();
        contabilidadeInformatica.prazo();


        void infomarNome () {

            System.out.println("Produto: ");
        }

        void informarPreco () {
            System.out.println("Preço: ");
        }

        void fazerPromocao () {
            System.out.println("Promoção: ");

        }

        void prazo () {
            System.out.println("Prazo: ");

        }
    }
}
