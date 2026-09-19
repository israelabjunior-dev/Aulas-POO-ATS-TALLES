package AT1;

public class Desafio1 {
    public static void main(String[] args) {

        // DESAFIO  1 //
        String desafio01 =  "Desafio 1";
        System.out.println(desafio01);
        System.out.println();

        String nome = "Israel";
        String sobrenome = "Junior";

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo: " + nome.concat(sobrenome));

        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equalsIgnoreCase(sobrenome));
        System.out.println(nome.length());

        String nomeCompleto = "Israel Junior";
        System.out.println("Nome em maiúsculo: " + nomeCompleto.toUpperCase());
        System.out.println("Total de caracteres: " + nomeCompleto.length());
        System.out.println("Primeiro caractere: " + nomeCompleto.charAt(0));

        int idade = 38;
        System.out.println("Idade: " + idade);
        String cpf = "400.289.222-98";
        System.out.println("CPF: " + cpf);
        System.out.println();

        ///Do PDF//


        System.out.println("PDF operações aritméticas diferentes");


        int minhaIdade = 38;
        boolean casado = false;
        char masculino = 'M';
        long varios = 132456789L;

        System.out.println(minhaIdade);
        System.out.println(casado);
        System.out.println(masculino);
        System.out.println(varios);



        double valor1;
        valor1 = 24.48;
        double valor2;
        valor2 = 68.96;

        double resultado1 = valor1 + valor2;
        double resultado2 = valor1 - valor2;
        double resultado3 = valor1 * valor2;
        double resultado4 = valor1 / valor2;

        System.out.println("Valor do Resultado " + resultado1);
        System.out.println("Valor do Resultado " + resultado2);
        System.out.println("Valor do Resultado " + resultado3);
        System.out.println("Valor do Resultado " + resultado4);






    }
}