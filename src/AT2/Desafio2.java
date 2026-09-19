package AT2;

public class Desafio2 {
    public static void main(String[] args) {

        //DESAFIO  2  //

        String desafio02 =  "Desafio 2";
        System.out.println(desafio02);
        System.out.println();

        String frase02 =  " Java é muito Legal! ";
        frase02 = frase02.trim();
        System.out.println(frase02);

        System.out.println(frase02.toLowerCase().endsWith("legal!"));

        frase02 = frase02.replace("Legal", "Incrível");
        System.out.println(frase02);

        String[] palavras = frase02.split(" ");
        for (String palavra : palavras){
            System.out.println(palavra);

        }
    }
}
